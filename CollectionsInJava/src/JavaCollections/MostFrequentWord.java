package JavaCollections;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequentWord {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] words=console.nextLine().toLowerCase().split("\\W+");

        Map<String,Integer> wordsCount=new TreeMap<String, Integer>();
        wordsCount=countWords(words,wordsCount);

        int maxValueInMap=(Collections.max(wordsCount.values()));

        printMaxCountofWords(wordsCount,maxValueInMap);
    }
    
    private static void printMaxCountofWords(Map<String,Integer>wordsCount,int maxValueInMap){

        for (Map.Entry<String, Integer> word :wordsCount.entrySet()) {

            if (word.getValue()==maxValueInMap){

                System.out.println(word.getKey() + " -> " + word.getValue() + " times");
            }
        }
    }

    public static Map<String, Integer> countWords(String[] words, Map<String, Integer> wordsCount) {
        for (String word : words) {
            Integer count = wordsCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordsCount.put(word, count + 1);
        }
        return wordsCount;
    }
}
