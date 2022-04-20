package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		// 코드 오류 -> 수정 후 출력결과 예상
		/*
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<= intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}	*/
		// 오류 원인 : intArray의 length는 5의 값을 가진다.
		// i가 6까지 출력되는 반면 배열은 0~4까지가 한계이므로 ArrayIndex-OutOfBounds(범위초과) 오류가 나온다.
	
		// i < intArray.length;로 고치면 오류는 해결될 것이다.
		// 출력결과는 0~2까지의 값이 있으므로 0~2까지만 값이 나오고 3~4까지의 값은 출력되지 않을 것이다.
		// 출력결과 : 22
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i< intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
	}
}