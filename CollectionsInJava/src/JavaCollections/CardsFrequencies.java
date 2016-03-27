package JavaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CardsFrequencies {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] cards=console.nextLine().toLowerCase().split("\\W+");

        Map<String,Integer> cardsCount=new HashMap<>();
        cardsCount=countcards(cards,cardsCount);
        double totalCount=cards.length;

        printCards(cardsCount,totalCount);
    }

    public static Map<String, Integer> countcards(String[] words, Map<String, Integer> cardsCount) {
        for (String word : words) {

            Integer count = cardsCount.get(word);
            if (count == null) {
                count = 0;
            }
            cardsCount.put(word, count + 1);
        }
        return cardsCount;
    }

    public static void printCards(Map<String, Integer> cardsCount,double totalCount) {

        for (Map.Entry<String, Integer> word : cardsCount.entrySet()) {

            double count=word.getValue();
            double result=(count/totalCount)*100.0;

            System.out.printf("%s -> %.2f%c",word.getKey() ,result , '%');
            System.out.println();
        }
    }
}
