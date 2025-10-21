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
