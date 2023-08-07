package Assignment;

import java.util.ArrayList;
import java.util.List;

public class NewspaperSubscriptionCalculator {
    public static void main(String[] args) {
        // Sample data: Prices of newspapers on different days
        Newspaper[] newspapers = {
                new Newspaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6}),
                new Newspaper("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 4}),
                new Newspaper("ET", new double[]{4, 4, 4, 4, 4, 4, 10}),
                new Newspaper("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5}),
                new Newspaper("HT", new double[]{2, 2, 2, 2, 2, 4, 4})
        };

        double weeklyBudget = 40; // Change this value to the user's weekly budget

        List<List<Newspaper>> result = findCombinations(newspapers, weeklyBudget);

        // Print the output
        for (List<Newspaper> combination : result) {
            double totalCost = 0;
            System.out.print("{");
            for (Newspaper newspaper : combination) {
                System.out.print("\"" + newspaper.name + "\", ");
                totalCost += newspaper.getWeeklyCost();
            }
            System.out.println("} , Total Cost: " + totalCost);
        }
    }

    public static List<List<Newspaper>> findCombinations(Newspaper[] newspapers, double budget) {
        List<List<Newspaper>> result = new ArrayList<>();
        int n = newspapers.length;
        int maxCombinations = (int) Math.pow(2, n);
        System.out.println(maxCombinations);

        for (int i = 1; i < maxCombinations; i++) {
            double totalCost = 0;
            List<Newspaper> currentCombination = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    totalCost += newspapers[j].getWeeklyCost();
                    currentCombination.add(newspapers[j]);
                }
            }

            if (totalCost <= budget) {
                result.add(currentCombination);
            }
        }

        return result;
    }
}
