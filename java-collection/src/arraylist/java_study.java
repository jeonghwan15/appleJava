package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class java_study {   // p.624

	public static void main(String[] args) {
		
		
		ArrayList<member> mbr = new ArrayList<>();
		mbr.add( new member("�̼���","lee@naver.com","����", 1012345678) );
		mbr.add( new member("������","kim@naver.com","����", 1034576890) );
		mbr.add( new member("�Ż��Ӵ�","ssid@naver.com","����", 1048506955) );
		mbr.add( new member("������","khs@gmail.com","����", 1070542859) );
		mbr.add( new member("������","jjh@gmail.com","����", 1058390525) );
		
		System.out.println( mbr.get(2) );
		System.out.println( mbr.size() );
		System.out.println( mbr.subList(1, 4) );
		
		member tmp = new member("������","jjh@gmail.com","����", 1058390525);
		
		System.out.println( mbr.indexOf(tmp) );
		System.out.println( mbr.contains(tmp) );
		// indexOf()
		
		
//		System.out.println( mbr );
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//
//		arr.add(10);
//		arr.add(20);
//		arr.add(50); // �迭�� �������� ���ο� ������ �߰�
//		arr.add(1,100);	// �迭�� ������ �ε��� ��ġ�� ���ο� ������ �߰�
////		arr.add("�̼���");
////		arr.add(3.14);
//		
//		for( int i=0; i<arr.size(); i++) {
//			if( arr.get(i) > 20 )
//				System.out.println( arr.get(i) );
//		}
//		
//		System.out.println("arraylist�� �� ���翩�� contains " + arr.contains(20) );
//		System.out.println("���� ����� �ε��� indexOf " + arr.indexOf(50) );
//		System.out.println("arraylist�� ���� � �ֳ� size " + arr.size() );
//		arr.remove(2); // ������ �ε��� ��ġ�� �� ����
//		System.out.println("arraylist ����ֳ� isEmpty " + arr.isEmpty() );
//		
//		System.out.println("������ �� ��� sublist " + arr.subList(1, 3));
//		
//		arr.set(1, 200);
//		System.out.println("�� ���� set " + arr);
//		
//	//	arr.toArray() - ArrayList�� ���� �迭�� ��ȯ
//		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("�̼���"); name.add("������"); name.add("������"); name.add("�念��");
//		String[] names = new String[name.size()];
//		name.toArray(names);
//		System.out.println( Arrays.toString(names));
//		
//	// ����
////	Collections.sort( arr );
////	arr.sort(Comparator.naturalOrder()); // ������ ���� ����
//	arr.sort(Comparator.reverseOrder()); // ������ ������ �� ���� ����
//	System.out.println( arr );
//	
//	Collections.sort( name );
//	System.out.println( name );
//		
	}

}


//	ArrayList
//	������ �迭�� �������� ����ϱ� ���� Ŭ����
//	���� �迭�� �ٸ����� ���� Ÿ������ �����ؼ� ����� �� �ִ�.(���׸�)
//	ArrayList�� �⺻ ������ Ÿ���� Object ��� �ڹ� �ֻ��� Ŭ���� Ÿ���̴�.
//	Object Ÿ������ ���� �Ǳ� ������ ����ϰ��� �ϴ� Ÿ���� �����ؼ� ����ؾ� �Ѵ�.
//	ArrayListó�� collection ��� Ŭ�������� Ÿ���� �����ؼ� ����ؾ� �Ѵ�.
//
//	ArrayList<Ŭ����>  ->  ArrayList(�����迭)�� ������ ������(��ü) Ÿ����
//	<> �ȿ� �ۼ��Ͽ� ����ؾ� �Ѵ�.
//	<> �ȿ� Ŭ������ �־��ָ� �ش� Ÿ������ ���� �ǵ��� �ϴ� ����� ���׸��̴�.
//	���׸��� ����ڰ� ������ Ÿ�Կ� ���߾� ����� �� �ֵ��� �ڹٿ��� �����ϴ� ���
//	���׸��� ����ϸ� ���� Ÿ���� ó���ϱ� ���� �ڵ��� ���⼺�� �پ���
//	Ÿ���� ����ȭ�� ������ �� �ִ�.




//	�ڹ� �÷���
//	�ټ��� ������ �Ǵ� �ټ��� ��ü�� ����, ����, ���� �ϱ� ���� �ڷᱸ�� �� �˰�����
//	�����ڰ� ���� ����� �� �ֵ��� ����� ���� �������̽� �� Ŭ�����̴�.

//	Collection, Map

//	Collection - List => ArrayLisk 
//			  		 => Vector
//					 => LinkedList			  				 
//			  		 => Stack	 
			  				 
//			  - Set => HashSet
//					=> TreeSet

//	Map - HashTable
//	    - HashMap
//	    - TreeMap





