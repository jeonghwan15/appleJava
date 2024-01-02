package exception_ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class java_exception {

	static Scanner scan = new Scanner(System.in);
	
	static String myAge(String birth) throws StringIndexOutOfBoundsException{
		//Date today = new Date(); ��¥ �ٷ�� Ŭ����
		// getXxx() �޼���� ��¥�ð� �������� ���� / �� �̻� ���x
		
		Calendar today = Calendar.getInstance();  
		
//		System.out.println("�⵵ : "+ today.get( Calendar.YEAR ) );
//		System.out.println("�� : "+ today.get( Calendar.MONTH ) );
//		System.out.println("�� : "+ today.get( Calendar.DATE ) );
//		
//		System.out.println("���� ���� : "+ today.get( Calendar.WEEK_OF_YEAR ) );
//		
//		System.out.println("����(1-�Ͽ���) : "+ today.get ( Calendar.DAY_OF_WEEK) );
//		
//		today.set(2020, 1, 1);  // �� 0���� ���� -> 2�� 1��
//		System.out.println("�̴��� ������ �� : "+today.getActualMaximum(Calendar.DATE) );
		int year = today.get(Calendar.YEAR);
		String age = null;
					
		// throw  - ����(����)�� �߻���Ű�� ���
		// 	  throw�� ������ �ִ� �޼���� �ݵ�� throws �� �־�� �Ѵ�.
		//	  throw�� ���� �ش� �޼��尡 � ������ ���� ������ �� �ְ�, ����ó���� �����Ѵ�.
		//    ���� ó���� ���� ������ �����ϰ� ���ش�.
		
		// throws - ���ܸ� �Ѱ��ִ� ���
		
		if(birth.length() != 8 ) { //�Է��� ��������� 8�ڸ��� �ƴ϶��
			throw new StringIndexOutOfBoundsException("method:myAge - ��������� 8�ڸ� �Է��ϼ���");
		}
		if( !birth.matches("[+-]?\\d*(\\.\\d+)?") ) {
			throw new NumberFormatException("���ڸ� �Է��ϼ���");
		}
			
		int myYear = Integer.parseInt( birth.substring(0, 4) );
	
		age= (year-myYear) + "��";
		return age;
			
			
		
//		}finally { // try�������� ������ �߻��ϰų� �߻����� �ʾƵ� ������ ����Ǵ� ����
//			return "0��";
		}


	
	public static void main(String[] args) {
	
		// �ڵ� �ڿ� ��ȯ ����ó�� - ���Ͽ���� ���� �ܺ� ����(������)�� ����ϰԵǴ� ���
		//						����� �޸𸮿� cpu ����� close�� ���� ��ȯ�ؾ��Ѵ�.
		//						�ڵ��ڿ���ȯ ����ó���� �ڵ��� ���⼺ �ٿ��� ����ó���̴�.
		//	try( ���Ͽ���){
		//	}catch( ����Ŭ���� ) {
		//  }
		
		//BufferedReader bf=null;
		
		try (BufferedReader bf = new BufferedReader(new FileReader("c:/test/book.txt")))
		{
			
			while( true ) {
				String line = bf.readLine();
				if( line==null ) break;
				System.out.println( line );
			}
			
		}catch( Exception e) {
			System.out.println("���� �ε� �� ��ȯ ����");
		}
		
//		try {
//			bf = new BufferedReader(new FileReader("c:/test/book.txt") );
//		
//			System.out.println( bf.readLine() );
//			System.out.println( bf.readLine() );
//				
//		}catch(Exception e) {
//			System.out.println("�����б� ����");
//		}finally {
//			try {
//				bf.close();
//			}catch(Exception e) {
//				System.out.println("���� �ݱ� ����");
//			}
//		}
		
		
//		try {
		
//		}catch(Exception e) {
			
//		}
		
//		String birth=null;
		
//		System.out.print("������� : ");
//		birth = scan.nextLine();
		
//		try {
//			String age = myAge(birth);
//			System.out.println( age );
//		}catch(Exception e) {
//			System.out.println( e.getMessage() );
//			e.printStackTrace();
//		}
		
		
		
		
//		String name=null;
//		int score=0;
//		int[] num = {};				
//		try {
//			score=scan.nextInt();
//			
//			System.out.println("�̸� : "+ name.concat("��"));
//			System.out.println( score/ num. length);
//			
//		}catch(java.lang.NullPointerException n) {
//			System.out.println("�̸��� �Է��ϼ���");
//			
//		}catch(java.lang.ArithmeticException a) {
//			System.out.println("������ �Է��ϼ���");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.print("���� ����");
		
		
		
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

	}
}