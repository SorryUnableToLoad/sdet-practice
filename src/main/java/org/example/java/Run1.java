package org.example.java;

public class Run1 {

	public static void main(String[] args) {
		int[] a = { 15, 51, 7, 81, 40, 1, 5, 11, 25 };
		int value = 42;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = a[i];
			for (int j = i + 1; j < a.length; j++) {
				sum = sum + a[j];
				if (sum == value) {
					System.out.println("addition of sub array is equal to value " + sum);
					for (int k = i; k <= j; k++) {
						System.out.print(a[k] + " ");
					}
					//System.out.println();
					break;
				}
			}
		}

//		for (int i = 0; i < a.length; i++) {
//			sum = a[i];
//			for (int j = i + 1; j < a.length; j++) {
//				sum = sum + a[j];
//				if (sum == value) {
//					System.out
//							.println("continuous sub array of" + Arrays.toString(a) + " whose sum is " + value + "is");
//					for (int k = i; k <= j; k++) {
//						System.out.print(a[k] + " ");
//					}
//				} else if (sum < value) {
//					continue;
//				} else if (sum > value) {
//					break;
//				}
//
//			}
//		}

	}

}
