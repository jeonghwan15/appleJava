package inner;

public class computer {
	
	int ram_speed = 3200;
	
	public void print() { // �ν��Ͻ��޼���
		System.out.println("��ǻ�� ���");
	}
	
	class ram{
		public void print() {
			computer.this.print(); //�ܺ�Ŭ���� �޼��� ����
			System.out.println("�޸� ��� ");
		}
		public void getRam() {
			System.out.println("�޸� �ӵ� : "+ ram_speed);
		}
	}
	static class vga{ //���� static Ŭ����
		static String brand="RTX"; // Ŭ��������
		int GDDR_SIZE = 8; // �ν��Ͻ�����
		
		public void print() {
//			computer.this.print();
			System.out.println("�׷��� ī�� ���");
		}
	}
	class cpu{
		
	}
	
	
	
	
	public void OS_install() {
		int version = 11; // ��������
		
		class OS{ // ����Ŭ����
			 public void getOs(){
				 version=10; // ���� Ŭ�������� ���������� final�� ���� ����� ���ȴ�.
				 System.out.println( version );
			 }
		}
		
		new OS().getOs();
	}
}


// ���� Ŭ���� ����
//  �ν��Ͻ� Ŭ���� - �ܺ� Ŭ������ �ν��Ͻ� ���� ���� ��ġ�� ����
//				- �ܺ� Ŭ������ �ν��Ͻ� ����, �޼���� ���õ� �۾��� �� ��� ���
//				- �ν��Ͻ� Ŭ���������� �ν��Ͻ� ����, �޼��常 ��밡��
//				- �ܺ� Ŭ������ static ����, �޼���� ��� �Ұ�


//  static Ŭ���� - ���� static Ŭ�������� �ν��Ͻ�����, �޼��� �� static����, �޼���
//				   ��� ������ �����ϴ�
//			    - �ܺ� Ŭ������ �ν��Ͻ� ����, �޼����� ����� �Ұ����ϴ�.
//				- �ܺ� Ŭ������ ��ü�� ���� ��ü ������ �ƴ϶� ���������� ���� ����
//				- static����, �޼���� �޸𸮿� �ϳ��� �ö�����
//				  static Ŭ������ ������ ������ �����ϴ�.
//				- �ܺ� Ŭ������ �ν��Ͻ��� ������� �ʴ� ����Ŭ�������
//				  ����Ŭ������ static���� �����Ѵ�.(�Ϻ� IDE������ �����.)


//  ���� Ŭ����  - �޼ҵ� ���ο� ��ġ�ϴ� Ŭ����
//			  - �޼ҵ� ���ο����� ��밡��
// 			  - ����������, static�� ���� �� ����.

//  �͸� Ŭ���� - Ŭ���� �̸��� �������� �ʴ� Ŭ����
//			 - ��ȸ�� Ŭ����
//			 - �͸�Ŭ������ �����ڰ� ����.
//			 - �͸�Ŭ������ ������ Ŭ������ �������Ͽ� ����ϴ� ����̴�.










