package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 1~45까지 임의의 숫자 6개를 출력하되 중복되지 않을 것
		
		int[] lotto = new int[6];
		int duplicate = 0;	// 중복 체크용 변수
		while(true) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
				for(int j=i+1; j<lotto.length-1; j++) {		// 중복 체크를 위해 배열 2개 운영
					if(lotto[i+1]==lotto[j]) {
						duplicate += 1;
					}
				}
			}
			if(duplicate == 0) {
				break;
			}else {
				duplicate = 0;
				continue;
			}
			
		}
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}//main method end
}//class end
