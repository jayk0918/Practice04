package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 1~45까지 임의의 숫자 6개를 출력하되 중복되지 않을 것
		
		int[] lotto = new int[6];
		int duplicate = 0;	// 중복이 0일때만 반복문을 끝내도록 장치
		
		while(true) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;	// 로또 번호 생성
			}
			
			for(int i=0; i<lotto.length; i++) {		// i&j값 2개를 배열에 넣어 비교군 형성
				for(int j=0; j<lotto.length; j++) {	
					if(lotto[i]==lotto[j]) {
						duplicate++;	// 중복시 정수값 +
					}
				}
			}
			
			if(duplicate==0) {
				break;	// 중복값 0이 충족되면 break;
			}else {
				duplicate = 0;	// 중복값이 존재해도 초기화해주지 않으면 무한루프, 중복값은 초기화가 필요함
				continue;
			}
			
		}// while end
		
	}//main method end
}//class end
