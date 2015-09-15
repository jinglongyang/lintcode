package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a dictionary, find all of the longest words in the dictionary.
 * Have you met this question in a real interview?
 * Example
 * <p>
 * Given
 * {
 * "dog",
 * "google",
 * "facebook",
 * "internationalization",
 * "blabla"
 * }
 * <p>
 * the longest words are(is) ["internationalization"].
 * <p>
 * Given
 * {
 * "like",
 * "love",
 * "hate",
 * "yes"
 * }
 * <p>
 * the longest words are ["like", "love", "hate"].
 * Challenge
 * <p>
 * It's easy to solve it in two passes, can you do it in one pass?
 */
public class LongestWords {
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> res = new ArrayList<>();
        if (dictionary == null || dictionary.length == 0) {
            return res;
        }
        Map<Integer, List<String>> map = new HashMap<>();
        int max = 0;
        for (String word : dictionary) {
            List<String> list = map.get(word.length());
            if (list == null) {
                list = new ArrayList<>();
                map.put(word.length(), list);
            }
            list.add(word);
            max = Math.max(max, word.length());
        }
        return map.get(max);
    }
}
