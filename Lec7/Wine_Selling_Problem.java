package Lec7;

public class Wine_Selling_Problem {
    public static void main(String[] args) {
        int[] wine = { 2, 3, 5, 1, 4 };
        System.out.println(maximum_profit(wine, 0, wine.length - 1, 1));
    }

    private static int maximum_profit(int[] wine, int si, int ei, int year) {
        // Bottom up Approach
        if (si > ei)
            return 0;
        int fs = wine[si] * year + maximum_profit(wine, si + 1, ei, year + 1);
        int ls = wine[ei] * year + maximum_profit(wine, si, ei - 1, year + 1);
        return Math.max(fs, ls);
    }
}
