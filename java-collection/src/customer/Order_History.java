package customer;

private String customer;
private String menu;
private int price;

	public class Order_History(int num, String customer, String menu, int price) {
		this.customer=customer;
		this.menu=menu;
		this.price=price;
		this.num=num;
	
	public Order_History(int num, String customer, String menu, int price) {
		this(customer, menu, price);
		this.num=num;
	}
	
	
	@Override
	public String toString() {
		
		return "고객 : "+customer+" 메뉴 : "+menu+" 금액 : "+price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getString() {
		return String;
	}
	public void setString(int string) {
		String = string;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
