package inner;

import inner.computer.vga;

interface a{
	public void view();
	public void haha();
}
class b{
	public void show() {
		System.out.println("���� Ŭ����B�� �޼����.");
	}
}

public class java_inner {

	public static void main(String[] args) {
		
		a a1 = new a() {
			@Override
			public void view() {
				System.out.println("���� �������̽��� �̿��� �͸�Ŭ����");
			}
			public void haha() {
				System.out.println("�߰����� �޼��� ������ ����");
			}
		};
		
		a1.view();
		a1.haha();
		
		
		b b1 = new b(){
			@Override
			public void show() {
				System.out.println("���� �͸� Ŭ�����Դϴ�.");
			}
		};
		
		b1.show();
		
		computer com = new computer();
		
		com.print();
		
		computer.ram r = new computer().new ram();
		r.print();
		
		computer.vga v = new vga();
		
		com.OS_install();
	}

}

// ����Ŭ����
//   Ŭ�������ο� �ν��Ͻ�����, Ŭ�������� ���� �ϵ��� ���ο� Ŭ������ �����ϴ� ��
//   �ϳ��� Ŭ������ ���� Ŭ������ ����(���, ����)�� �����ʰ� �ϳ��� Ư�� Ŭ�����͸�
//   ���踦 �ΰ� �ʹٸ� �ܺο� Ŭ������ �ۼ��ؼ� ���踦 �δ� �� �ƴϰ� ����Ŭ������ ����� �ȴ�.

// ���� Ŭ������ �ۼ��ϸ� Ŭ������ �������� �׷�ȭ �� �� �ִ�.


/*
 *    class car{
 *    
 *    	  class wheel{   ����Ŭ������ �ٸ� �ܺ� Ŭ�������� ���Ұ�
 *    
 *    	  }
 *    	  class glass{
 *    
 *    	  }
 *    	  class hood{
 *    
 *    	  }
 *    
 *    }
 *    
 *    
 * 
 * 
 * 
 * 
 * 
 * 
 */







