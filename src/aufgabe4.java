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

void main() {
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
