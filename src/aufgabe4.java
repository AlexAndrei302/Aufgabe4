
public class aufgabe4 {

    // 1) findet die billigste Tastatur
    public int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int k : keyboards) {
            if (k < min) {
                min = k;
            }
        }
        return min;
    }

    // 2) findet den teuersten Gegenstand (Tastatur oder USB)
    public int mostExpensive(int[] keyboards, int[] usbs) {
        int max = keyboards[0];

        for (int k : keyboards)
            if (k > max) max = k;

        for (int u : usbs)
            if (u > max) max = u;

        return max;
    }

    // 3) findet das teuerste USB, das Markus sich leisten kann
    public int bestUsbWithinBudget(int[] usbs, int budget) {
        int best = -1;
        for (int u : usbs) {
            if (u <= budget && u > best) {
                best = u;
            }
        }
        return best;
    }

    // 4) findet maximale Summe (Tastatur + USB), die ins Budget passt
    public int maxSpend(int budget, int[] keyboards, int[] usbs) {
        int max = -1;
        for (int k : keyboards) {
            for (int u : usbs) {
                int sum = k + u;
                if (sum <= budget && sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        aufgabe4 a = new aufgabe4();

        int[] keyboards = {50, 20, 75};
        int[] usbs = {5, 10, 15};
        int budget = 60;

        System.out.println("Cheapest keyboard: " + a.cheapestKeyboard(keyboards));
        System.out.println("Most expensive item: " + a.mostExpensive(keyboards, usbs));
        System.out.println("Best USB within budget (" + budget + "): " + a.bestUsbWithinBudget(usbs, budget));
        System.out.println("Max spend within budget (" + budget + "): " + a.maxSpend(budget, keyboards, usbs));
    }
}
