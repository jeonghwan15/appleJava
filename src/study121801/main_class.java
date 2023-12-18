package study121801;

public class main_class {

	public static void main(String[] args) {
		
		// 자바스크립트 - let a = new array( );
		//			  let b = [10,20,30,40];
		//			  a.push(3123);   b.push(233);
					  
	    int[] arr1 = {101,20};
	    
	    System.out.println( arr1 [0] );
	    
	    // int[] arr2 = new int[50];
	    //	new int[10]
		// (new)새로운 공간 (int)(정수타입)[10](10공간연속으로 생성)
	    
	    System.out.println( arr1[0] );
	    
	    int[] arr2 = new int[10];
	    // new int[10]
	    
	    for( int i=0; i<arr2.length; i++) {
	    	arr2[i]= i*10;
	    }
	    
	    for( int i=0; i<arr2.length; i++) {
	    	
	    }
	    	
	    	
	    // 자바에서 기본 배열을 생성하여 다룰때
	    // 배열에 저장할 데이터 정하기( 저장 데이터에 따라 데이터 타입 정해야함 )
	    // 몇개의 데이터를 저장할 것인지 갯수 정하기
	    // 타입과 갯수에 맞는 배열 생성
	    // 타입 - 문자열, 갯수 - 7
	    // String[] names = new String[7];
	}

}
