package inherit_test;

public class tv extends house{

	int ch; //ä��
	int vol; //�Ҹ�
	
	tv(){ // �⺻ ������ �޼���
		System.out.println("tv Ŭ������ �������Դϴ�.");
		ch=7;
		vol=15;
	}
	
	tv(String brand){ // �Ű������� �ִ� �����ڸ޼���
		super(brand);
	}
}