package com.test;

import java.util.Scanner;

//Ű����� ������ 5���� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) 1��° ������ �Է� >> 10
//    2��° ������ �Է� >> 20
//    3��° ������ �Է� >> 30
//    4��° ������ �Է� >> 40
//    5��° ������ �Է� >> 50
//    [���]�հ� = 150
public class TotalOneExample {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int sum = 0;
		int input;
		int cnt = 5;

		System.out.println("10~100�� ������ 5�� �Է��ϼ���");
		while (cnt > 0) {
			System.out.println("���� �Է��ϼ���");
			System.out.println(cnt + "��°");
			input = sn.nextInt();
			if (input < 0 || input > 100) {
				System.out.println("���� �ʰ�");
			} else {
				sum += input;
				cnt--;
			}
		}
		System.out.println("�հ�" + sum);

	}
}
