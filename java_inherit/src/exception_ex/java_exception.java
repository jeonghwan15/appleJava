package exception_ex;

import java.util.Scanner;

public class java_exception {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name=null;
		int score=0;
		int[] num = {};				
		try {
			score=scan.nextInt();
			
			System.out.println("�̸� : "+ name.concat("��"));
			System.out.println( score/ num. length);
			
		}catch(java.lang.NullPointerException n) {
			System.out.println("�̸��� �Է��ϼ���");
		}catch(java.lang.ArithmeticException a) {
			System.out.println("������ �Է��ϼ���");
		}
	}
}
		
		
//	try {	
//	String name;
//	name = scan.nextLine();
//	
//	System.out.println( name.charAt(0) );
//	}catch( Exception e ) {
//		System.out.println("�̸��� �Է��ϼ���");
//	}
//	
//		
//	try {
//		int num=10;
//		
//		System.out.println( num/0 );
//		
//		System.out.println("�ƹ� ���� ����");
//		
//	}catch( java.lang.ArithmeticException e) {
//		System.out.println( e.getMessage() );
//		e.printStackTrace();
//		System.out.println("0���� ������ �� �� �����ϴ�.");
//		}
//	System.out.println("���α׷� ����");
//	}
//
//}
