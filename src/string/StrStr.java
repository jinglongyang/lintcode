package string;

/**
 * strstr (a.k.a find sub string), is a useful function in string operation. Your task is to implement this function.
 * For a given source string and a target string, you should output the first index(from 0) of target string in source string.
 * If target does not exist in source, just return -1.
 * Have you met this question in a real interview?
 * Example
 * If source = "source" and target = "target", return -1.
 * If source = "abcdabcdefg" and target = "bcd", return 1.
 * <p>
 * Challenge
 * O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)
 * <p>
 * <p>
 * Clarification:
 * Do I need to implement KMP Algorithm in a real interview?
 * Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
 */
public class StrStr {
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }

        for (int i = 0; i <= source.length() - target.length(); i++) {
            int j = 0;
            while (j < target.length() && source.charAt(i + j) == target.charAt(j)) {
                j++;
            }
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("", ""));
    }
}
