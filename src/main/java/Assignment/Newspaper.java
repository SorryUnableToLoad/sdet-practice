package Assignment;

public class Newspaper {
    String name;

    double[] dailyCosts;

    public Newspaper(String name, double[] dailyCosts) {
        this.name = name;
        this.dailyCosts = dailyCosts;
    }

    public double getWeeklyCost() {
        double weeklyCost = 0;
        for (double dailyCost : dailyCosts) {
            weeklyCost += dailyCost;
        }
        return weeklyCost;
    }
}
