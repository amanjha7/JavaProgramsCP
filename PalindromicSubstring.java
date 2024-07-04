/**
 * PalindromicSubstring
 */
public class PalindromicSubstring {

    public static void main(String[] args) {
        String s = "aabaa";
        int result = count(s);
        System.out.println("Total palindromic substrings: " + result);
    }

    public static int count(String s) {
        int count = 0;
        
        // Count odd-length palindromic substrings
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break;
                }
                count++;
            }
        }
        
        // Count even-length palindromic substrings
        for (int axis = 0; axis < s.length() - 1; axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + 1 + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + 1 + orbit)) {
                    break;
                }
                count++;
            }
        }
        
        return count;
    }
}
