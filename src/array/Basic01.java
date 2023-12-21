package array;

import java.util.Arrays;

public class Basic01 {

	public static void main(String[] args) {

/**
 *	1.
 */
		int[] score = new int[5];
		for (int i = 0; i < 3; i++) { 
			score[i] = i * 10; 
		}
		System.out.println(score); // [I@3d012ddd
		System.out.println(score[2]); // 20
		System.out.println(score.length); // 5
		System.out.println(Arrays.toString(score)); // [0, 10, 20, 0, 0]

		
/**
 *	2. 
 */
		int[] arr = {3, 2, 0, 1, 4};
		System.out.println(arr[0]); // 3
		Arrays.sort(arr); // 원소들을 정렬함
		System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]

		
/**
 *	3. 배열의 복사, 확장 
 *	배열은 한번 선언되고 나면 공간 자체를 직접 늘릴수없다
 */
		int[] arr1 = {10, 20, 30}; // [I@3d012ddd
		int[] arr2 = new int[arr1.length * 2]; // [I@626b2d4a
		
//		for(int i = 0; i < arr1.length; i++) {	arr2[i] = arr1[i];	} // [10, 20, 30, 0, 0, 0]	
		arr2 = Arrays.copyOf(arr1, arr1.length); // [10, 20, 30]
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
