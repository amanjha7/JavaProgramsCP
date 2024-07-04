package Lec7;

import java.lang.reflect.Array;
import java.util.*;

public class Longest_Incresing_Subsequence {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(LIS(arr));
    }

    // public static int LIS(int[] arr) { // O(n^2)
    // int[] dp = new int[arr.length];
    // Arrays.fill(dp, 1);
    // for (int i = 1; i < dp.length; i++) {
    // for (int j = i - 1; j >= 0; j--) {
    // if (arr[j] < arr[i]) {
    // int x = dp[j] + 1;
    // dp[i] = Math.max(dp[i], x);
    // }
    // }
    // }
    // System.out.println(Arrays.toString(dp));
    // return dp[dp.length - 1];
    // }

    public static int LIS(int[] arr) { // O(nlog(n))
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        dp[0] = arr[0];
        int len = 1;
        for (int i = 1; i < dp.length; i++) {
            if (dp[len - 1] < arr[i]) {
                dp[len] = arr[i];
                len++;
            } else {
                int idx = BinarySearch(dp, 0, len, arr[i]);
                dp[idx] = arr[i];
            }
        }
        int count = 0;
        for (int i : dp) {
            if (i != -1) {
                count++;
            }
        }
        return count;
    }

    private static int BinarySearch(int[] dp, int lo, int hi, int item) {
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (dp[mid] >= item) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
