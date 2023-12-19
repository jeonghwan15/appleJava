package study121801;

import java.util.Arrays;
import java.util.Scanner;

class home {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 과제 - 자바 배열 문제
		// { 30, 4, 50, 60, 14, 80, 45, 72, 94, 25}
		// 평균을 구하세요.
		// 10개 정수의 평균 이하인 숫자들은 F, 평균 이상인 숫자들은 A 라고 표기되는
		// 배열을 만들어 출력하세요.
		
		// 출력 결과 - F, F, A, A, F, A, F, A, A, F
		int[] score= {30, 4, 50, 60, 14, 80, 45, 72, 94, 25};
		
		int total=0;
		for(int i=0; i< score.length; i++) {
			total += score[i];
		}
		int avg = total/score.length;
		char[] grade= new char[10];
		for( int i=0; i< score.length; i++) {
			if( score[i] <= avg)
				grade[i] = 'F';
			else
				grade[i] = 'A';
		}
		System.out.println ( Arrays.toString(grade) );

	}

}
