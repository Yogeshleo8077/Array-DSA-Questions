import java.util.Arrays;

public class IsAnagram {
    // sorting method
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static boolean isAnagramCountArrApproach(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        // System.out.println(isAnagram("listen", "silent")); // true
        // System.out.println(isAnagram("race", "care")); // true
        // System.out.println(isAnagram("hello", "world")); // false

        System.out.println(isAnagramCountArrApproach("listen", "silent"));
        System.out.println(isAnagramCountArrApproach("race", "care"));
        System.out.println(isAnagramCountArrApproach("hello", "world"));
    }
}