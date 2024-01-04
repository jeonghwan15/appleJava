package javaSet;

import java.util.TreeSet;

public class get_study2 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		
		do {
			int num = (int)(Math.random()*50)+1;
			tree.add( num );
			//System.out.println(num);
		}while( tree.size()<	10 );
		
		System.out.println( tree );
		
		// 검색
		System.out.println( tree.floor(1) );
		// 지정한 값과 일치하는 값 출력, 일치하는 값 없으면 작은값 중에서 가장 가까운값 출력
		// 그래도 없으면 null
		System.out.println( tree.headSet(25) );
		// 지정한 값보다 작은 값 전체 출력
		System.out.println( tree.tailSet(28) );
		// 지정한 값보다 큰 값 전체 출력
		
		System.out.println( tree.higher(40) );
		// 지정한 값보다 큰 값 중에서 가장 가까운 값 출력
		System.out.println( tree.lower(36) );
		// 지정한 값보다 작은값 중에서 가장 가까운 값 출력
		
		System.out.println( tree.subSet(10, 30) );
		// from과 to 사이의 값 출력, to는 포함되지 않는다. to 이전값까지만
		
		
//		System.out.println( tree.size() );
	}

}
