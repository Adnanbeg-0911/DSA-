import java.util.*;

class Day10_greedynoofcoins {

    // Function to get minimum coins for given amount
    public static List<Integer> minCoins(int V) {

        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        List<Integer> ans = new ArrayList<>();

        int n = coins.length;

        // Traverse coins from largest to smallest
        for (int i = n - 1; i >= 0; i--) {
            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int V = 93;

        List<Integer> result = minCoins(V);

        System.out.println("Coins used: " + result);
    }
}