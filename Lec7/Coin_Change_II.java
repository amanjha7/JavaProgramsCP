package Lec7;

public class Coin_Change_II {
    public static void main(String[] args){
        int amount = 5;
        int[] coin = {1, 2, 5};
        System.out.println("Number of combinations: " + Change_II(coin, amount));
    }

    public static int Change_II(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There is 1 way to make amount 0: by choosing no coins

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}
