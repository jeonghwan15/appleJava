package cafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Order {

	static Scanner scan = new Scanner(System.in);
	
	// 전체 메뉴 보여주는 메서드 :  분류(커피,음료,치노) 선택 -> 해당 분류에서 제품 이름 입력하여 주문
	// 커피 메뉴를 선택하여 보다가 음료 메뉴를 보고싶으면 이동하여 보이게 해줘야한다.
	public static void kiosk( HashMap<Category,Set<menu>> cafeMenu ) {
		System.out.println("\n========== 주문 ============\n");
		
		Category main = Category.커피;
		while(true) {
			System.out.println("1.커피  2.음료  3.빽스치노");
			Set<menu> list = cafeMenu.get(main);
			Iterator<menu> tmp = list.iterator();
			while( tmp.hasNext() ) {
				System.out.println( tmp.next() );
			}
			System.out.print( "주문 메뉴 선택 및 항목 선택 : " );
			String input = scan.nextLine();
			// 메뉴를 입력했는가?, 분류 번호를 입력했는가?
			if( isInteger( input ) ) // 정수변환 가능 - 분류번호입력
				main = SelectCategory( file.i(input) );
			else //메뉴를 입력
				progress(input);
				break;
		}
		
	}
	
	// 주문 진행하는 메서드 : 주문할 제품을 선택했다면 결제 까지 진행 되는 메서드 
	private static void progress(String orderMenu) {
		if( Order_Counter.Menu.containsKey(orderMenu) ){ // 내가 선택한 메뉴가 map의 키값인가?
		
			menu select = Order_Counter.Menu.get(orderMenu); //내가 선택한 메뉴의 menu클래스객체
			//핫, 아이스?  추가 선택 유도
			int price=0;
			if( select.getCost1() !=0 && select.getCost2() !=0 ) {
				System.out.print("1.HOT  2.ICE : ");
				int HI = scan.nextInt();
				price = HI==1? select.getCost1() : select.getCost2();
			}else {
				price = select.getCost1() !=0 ? select.getCost1() : select.getCost2();
			}
			DecimalFormat df = new DecimalFormat("\u20A9",###원")
			System.out.println("\n===== 주문 내역 ==== \n");
			System.out.println( select );
			System.out.printf("카페인 : %dmg, 칼로리:dkacl, .용량 : %dml \n",
					select.getCaffeine(), select.getCalorie(), select.getM1() );
			System.out.println(" 결제금액 : "+df.foramat(price));
		
		}
		// 내가 선택한 메뉴가 map의 키값이 아니라면 다시 메뉴를 선택하게 해줘야한다.
		
		
	}
	
	
	//주문 내역을 Order_history를 통해 저장 메서드
	
	
	private static Category SelectCategory(int num) {
		switch(num) {
		case 1: return Category.커피;
		case 2: return Category.음료;
		case 3: return Category.빽스치노;
		}
		return Category.커피;
	}

	private static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
	}
	
	
	}
	
}




