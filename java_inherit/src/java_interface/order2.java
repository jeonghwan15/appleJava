package java_interface;


interface Request{
	String getOrder();
}

class Customer{
	protected String menu;
	public Customer(String menu) { this.menu=menu; }
}
//�ܰ� �մ�
class CustomerA extends Customer implements Request{
	public CustomerA(String menu) { super(menu); }
	public String getOrder() {
		return "�մ� A����"+menu+"�� �ش�.";
	}
}
class CustomerB extends Customer implements Request{
	public CustomerB(String menu) {super(menu); }
	public String getOrder() {
		return "�մ� B���� "+menu+"�� �ش�.";
	}
}
//�Ĵ�
class Restaurant{
	public void giveFood(Request res) {
		System.out.println( res.getOrder() );
	}
}

public class order2 {

	public static void main(String[] args) {

		Restaurant owner = new Restaurant();
		Request a= new CustomerA("û����");
		Request b= new CustomerA("����");
		owner.giveFood(a);
		owner.giveFood(b);
		
	}
	
	// �Ĵ� �ֹ� �ý����� ����µ� �մԿ��Լ� �ֹ���û�� ������ � �մ��̵�
	// getOrder() �޼���� �����ؾ� �Ѵ�.
	
	// �������̽��� �ڹ� ���α׷� ���߿� ���̵� ������ �����ϴ� ������ �Ѵ�.
	// ���߿� ��Ģ�� ���س��� ȥ�� ���� ������ �� �ִ�.
	// �������̽� ����� ����, ���� ���Ӽ�, ���� ����� ���� ����Ѵ�.

}
