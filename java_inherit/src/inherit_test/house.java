package inherit_test;

public class house {
	
	boolean onoff;
	String brand;
	
	house(){ // �⺻ ������ �޼���
		onoff=false;
		System.out.println("���� �θ� house Ŭ���� ������");
	}
	
	house(String brand){
		this.brand= brand;
	}
	
	void power() {
		onoff = !onoff;
	}
}