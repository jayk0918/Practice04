package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 코드의 출력값을 예상 후 확인
		
		int[] intA = {3, 6, 9};
		
		System.out.println(intA[0]);
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		System.out.println(intA[0]);
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		// 예상
		// intA는 [0] : 3, [1] : 6, [2] : 9의 값을 가진다
		// intB는 주소값을 따왔으나 [0] : 20, [2] : 10을 직접대입하였다.
		// [1]의 값은 intA[1]값인 6을 그대로 받을 것이다.
		// 출력문은 intA를 의도하였다.
		// intB와는 무관하므로 출력결과는 3, 6, 9 순으로 나올 것이다. (오답)
		
		
		// 결과값은 20, 6, 10
		// why? -> 무관하지 않다
		// intA의 주소값 3, 6, 9는 intB에 복사되었는데?
		// 검증을 위해 print를 추가 배치
		// 주소값의 공유 - intB에 intA의 주소를 대입한 것
		// 후속 선언으로 인해 값이 같이 변경된 것
		// 좀 더 배열에 대해 살펴볼 필요가 있을 듯
	}

}
