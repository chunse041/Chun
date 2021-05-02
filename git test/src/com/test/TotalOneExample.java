package com.test;

import java.util.Scanner;

//키보드로 정수값 5개를 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//ex) 1번째 정수값 입력 >> 10
//    2번째 정수값 입력 >> 20
//    3번째 정수값 입력 >> 30
//    4번째 정수값 입력 >> 40
//    5번째 정수값 입력 >> 50
//    [결과]합계 = 150
public class TotalOneExample {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int sum = 0;
		int input;
		int cnt = 5;

		System.out.println("10~100의 정수를 5번 입력하세요");
		while (cnt > 0) {
			System.out.println("수를 입력하세요");
			System.out.println(cnt + "번째");
			input = sn.nextInt();
			if (input < 0 || input > 100) {
				System.out.println("범위 초과");
			} else {
				sum += input;
				cnt--;
			}
		}
		System.out.println("합계" + sum);

	}
}
