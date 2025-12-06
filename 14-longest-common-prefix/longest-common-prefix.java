import java.util.*;

class Solution {
    static Scanner sc = new Scanner(System.in);

    // Method to find longest common prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            common = getCommon(common, strs[i]);
            if (common.isEmpty()) {
                break;
            }
        }
        return common;
    }

    // Helper method to get common prefix of two strings
    private String getCommon(String s1, String s2) {
        int minlen = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minlen && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Create an object to call the non-static method
        Solution sol = new Solution();
        String result = sol.longestCommonPrefix(arr);
        System.out.println("Longest Common Prefix: " + result);
    }
}
