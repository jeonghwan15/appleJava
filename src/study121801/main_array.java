// 프로젝트명 -> 마우스오른쪽클릭 -> team -> Add to Index 클릭
// -> commit message 작성 -> commit and push 버튼 클릭

package study121801;

import java.util.Arrays;

public class main_array {

	public static void main(String[] args) {
	
		// 16개의 정수를 중복없이 배열에 저장하기
		int[] number = new int[16];
		
		for( int i=0; i<number.length; i++) {
			int temp = (int)(Math.random()*50)+1;
			for( int k=0; k<i; k++) {
				if( number[k]==number[i] ){
					i--;
					break;
				}
			}
// 자바스크립트 배열에 특정값 존재여부 - indxOf(특정값), includes(특정값)
// 자바 배열은 indexOfm, includes 가 없다
// indexOf와 contains로 존재여부를 알 수 있지만,
// String과 list 클래스에서만 사용가능
		
	}
		System.out.println( Arrays.toString(number) );
		
		// num 배열을 한줄에 4개씩 4줄로 출력하세요
		for( int i=0; i<number.length; i++) {
			if(i%4==0)
				System.out.println();
			System.out.println( number[i] +" " );
		}
	}
}
