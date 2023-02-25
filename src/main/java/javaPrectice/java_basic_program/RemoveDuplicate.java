package javaPrectice.java_basic_program;

public class RemoveDuplicate {
	public static void main(String[] args) {

		int[] a = { 12, 12, 14, 15, 16 };

		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = i+1; j<a.length; j++) {
				if (a[i] == a[j]) {
					count ++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}

	}

}
