package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		// 정수로 된 돈 액수를 입력
		// 50000 ~ 1원 까지 각각 몇개로 나뉘는지
		
		Scanner sc = new Scanner(System.in);
		
		
		int[]wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		int[]count = new int[10];
		
		System.out.print("금액: ");
		int money = sc.nextInt();
		
		for(int i=0; i<wonArray.length; i++) {
			count[i] = money/wonArray[i];
			money = money%wonArray[i]; // % 나머지 값을 하지 않으면 반복해서 count[i]값으로 나눔
			System.out.println(wonArray[i] + "원:" + count[i] + "개");
		}
		
		sc.close();
		
		
		
	}

}
