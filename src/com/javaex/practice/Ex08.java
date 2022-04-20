package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 1~45까지 임의의 숫자 6개를 출력하되 중복되지 않을 것
		
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			if(lotto[i] == lotto[i]) {
				lotto[i] = (int)(Math.random()*45)+1;
			}
			
			System.out.print(lotto[i] + " ");
		}
	}

}
