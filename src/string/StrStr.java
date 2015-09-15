package string;

public class StrStr {
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || source.length() == 0 || target == null || target.length() == 0 || source.length() < target.length()) {
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
