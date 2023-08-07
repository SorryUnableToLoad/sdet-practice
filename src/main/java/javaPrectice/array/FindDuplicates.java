package javaPrectice.array;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] a = {0, 5, 7, 3, 3, 7, 0};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(" " + a[j]);

                }
            }
        }

        System.out.println("--------------------------------");

        String[] b = {"a", "b", "c", "d", "e", "f"};
        boolean duplicateFound = false;

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].equals(b[j])) {
                    System.out.println(" " + b[j]);
                    duplicateFound = true;
                    break;
                }
            }
        }
        if (duplicateFound==false) {
            System.out.println("Duplicate elements are not present.");
        } else {
            System.out.println();
        }


    }


}
