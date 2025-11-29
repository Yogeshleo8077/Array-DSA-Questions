import java.util.*;

public class STR{
    public static String keepFirstOccurrence(String str){
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static String reverseEachWord(String sentence){
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse()).append(" ");
        }

        return result.toString().trim(); //remove last space
    }

    public static String findLongestWord(String sentence){
        String words[] = sentence.split(" ");
        String longestWord = "";

        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static String findSmallestWord(String sentence){
        String words[] = sentence.split(" ");
        String smallestWord = words[0]; // Initialize with the first word

        for(String word : words){
            if(word.length() < smallestWord.length()){
                smallestWord = word;
            }
        }

        return smallestWord;
    }

    public static Map<String, Integer> countWords(String sentence) {
        sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String words[] = sentence.split("\\s+");

        Map<String, Integer> countMap = new HashMap<>();
        for(String word : words){
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        return countMap;
    }
    
    public static String removeDuplicates(String sentence){
        String words[] = sentence.split(" ");
        HashSet<String> seen = new LinkedHashSet<>();

        for(String word : words){
            seen.add(word);
        }

        return String.join("", seen);
    }
    public static void main(String args[]){
        String str = "this is a test this is nice";
        String result = removeDuplicates(str);
        System.out.println(result);
    }
}