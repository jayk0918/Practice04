package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력 & 평균 산출
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5]; // 우선 num이라는 배열이 값을 받을 수 있게 세팅부터 해주고
		double sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextDouble(); // 5회 반복(length제한)
			sum += num[i]; // 반복되는 동안 sum변수에 총합 저장
			}
		
		System.out.println("평균은 " + (sum / num.length) + " 입니다."); //length 채용이유 : 지금은 5개지만 변할 수 있으니까
		
		
		sc.close();
		
		}// main end
	}// class end
