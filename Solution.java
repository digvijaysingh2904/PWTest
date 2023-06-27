public

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }

}

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "leetcode";
        System.out.println(solution.firstUniqChar(s));  // Output: 0

        s = "loveleetcode";
        System.out.println(solution.firstUniqChar(s));  // Output: 2

        s = "aabb";
 {
    
}
