import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "a";
        
        System.out.println("Partitioning for " + s1 + ":");
        List<List<String>> result1 = partition(s1);
        printResult(result1);
        
        System.out.println("\nPartitioning for " + s2 + ":");
        List<List<String>> result2 = partition(s2);
        printResult(result2);
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentList = new ArrayList<>();
        backtrack(result, currentList, s, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, List<String> currentList, String s, int start) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                String substring = s.substring(start, i + 1);
                currentList.add(substring);
                backtrack(result, currentList, s, i + 1);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static void printResult(List<List<String>> result) {
        for (List<String> list : result) {
            System.out.println(list);
        }
    }
}
