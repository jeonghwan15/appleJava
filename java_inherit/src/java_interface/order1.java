package java_interface;


class Customer{
	public String request;
	
	public void setRequest(String request) {
		this.request=request;
	}
	
}

// �Ĵ� �ܰ� �մ� Ŭ����
class CustomerA extends Customer{
	
}
class CustomerB extends Customer{
	
}

// �Ĵ�
//class Restaurant{
//	public void giveFood(CustomerA cusA) {
//		System.out.println("�մ� A���� "+cusA.request+"�� �ش�.");
//	}
//	public void giveFood(CustomerB cusB) {
//		System.out.println("�մ� B���� "+cusB.request+"�� �ش�.");
//	}
//}


public class order1 {

	public static void main(String[] args) {

		Restaurant owner = new Restaurant();
		CustomerA a = new CustomerA();
		CustomerB b = new CustomerB();
		a.setRequest("û����");
		b.setRequest("�̵�����ġ�");

		owner.giveFood(a);
		owner.giveFood(b);
	}

}
