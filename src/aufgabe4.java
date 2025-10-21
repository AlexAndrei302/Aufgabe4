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
