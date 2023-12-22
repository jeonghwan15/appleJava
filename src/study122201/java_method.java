package study122201;

import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	static mart[] mart_list;
	
	public static void main(String[] args) {
		
		mart_init(); // 제품등록이 첫번쨰 실행되어야 한다
		
		buyer_enroll();
		view();
	}
	
	static buyer buyer_enroll() {
		
		int num = (int)(Math.random()*40000)+10000;
		System.out.print("구매자 성함을 입력하세요 : ");
		String name = scan.nextLine();
	
		buyer 김정환 = new buyer( num, name );
	}
	
	static void view() {
		for(int i=0; i< mart_list.length; i++) {
			System.out.println( (i+1)+". "+mart_list[i]);
		}
	}


	static void mart_init() {
		mart_list = new mart[] {
			new mart("고추참치",2890, "통조림",2100 ) , new mart("홈런볼", 1300, "과자",4231),
			new mart("오이비누4묶음",5890,"비누",450), new mart("신라면1봉지",4300,"라면",5234),
			new mart("짜파게티1봉지",6430,"라면",5132),
		}
		
	}

