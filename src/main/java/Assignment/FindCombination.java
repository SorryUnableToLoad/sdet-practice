package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCombination {

    public static void main(String[] args) {
        /* List of newspapers */
        String[] papersName = {"TOI", "Hindu", "ET", "BM", "HT"};

        /* Price of newspapers */
        final double[] arrayTOI = {3, 3, 3, 3, 3, 5, 6}, arrayHindu = {2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 4};
        final double[] arrayET = {4, 4, 4, 4, 4, 4, 10}, arrayBM = {1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5};
        final double[] arrayHT = {2, 2, 2, 2, 2, 4, 4};

        /* Weekly total amount of newspapers */
        double[] total = new double[5];
        for (int i = 0; i < arrayTOI.length; i++) {
            total[0] += arrayTOI[i];
            total[1] += arrayHindu[i];
            total[2] += arrayET[i];
            total[3] += arrayBM[i];
            total[4] += arrayHT[i];
        }

        /* Adding newspaper name and total weekly amount into Map */
        Map<String, Double> mp = new LinkedHashMap<>();
        for (int i = 0; i < papersName.length; i++) {
            mp.put(papersName[i], total[i]);
        }

        /* Printing all newspapers' names and total weekly amount to the user */
        System.out.println("List of Newspapers and weekly costs");
        mp.forEach((k, v) -> System.out.println(k + "  " + v));
        System.out.println();

        /* Getting user Budget from user */
        final double minimumAmount = 29;
        System.out.println("Minimum Base price is RS" + minimumAmount + " to get a pair of newspapers.");
        System.out.println("Please enter your weekly Amount and it should be more than the minimum price.");
        Scanner sc = new Scanner(System.in);
        double userBudget = sc.nextDouble();

        /* Verifying the minimum amount of the user and printing the newspaper pairs */
        System.out.println();
        if (userBudget >= minimumAmount) {
            /* Printing the newspapers' names that fit within the user's budget */
            System.out.println("Below are the newspapers in your budget:");
            for (Map.Entry<String, Double> entry : mp.entrySet()) {
                if (entry.getValue() <= userBudget) {
                    System.out.println(entry.getKey());
                }
            }
            System.out.println();
            System.out.println("The pairs of newspapers that fit in your budget:");
            int count = 0;
            for (int i = 0; i < papersName.length; i++) {
                for (int j = i + 1; j < papersName.length; j++) {
                    double totalCost = total[i] + total[j];
                    if (totalCost <= userBudget) {
                        System.out.println("Pair: { " + papersName[i] + ", " + papersName[j] + " }");
                        count++;
                    }
                }
            }
            System.out.println("Total pairs: " + count);
        } else {
            System.out.println("Sorry, please select a minimum amount of " + minimumAmount + " and above to get pairs.");
        }
    }

}