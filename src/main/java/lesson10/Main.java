package lesson10;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{
                "Колбаса", "Котлета", "Сосиски",
                "Бургер", "Шаурама", "Хот-дог",
                "Пирожок", "Эклер", "Пироженое",
                "Мороженое", "Шаурама", "Сосиски",
                "Колбаса", "Шаурама", "Мороженое"};

        HashSet<String> wordsHashSet = new HashSet<>();
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        int i = 0;

        for(String word : words){
            if (wordsHashSet.contains(word)){
                wordsHashMap.put(word, wordsHashMap.get(word) + 1);
            } else {
                wordsHashSet.add(word);
                wordsHashMap.put(word, 1);
            }
        }

        for (String unWord : wordsHashSet){
            System.out.println(unWord + " " + wordsHashMap.get(unWord));
        }

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addRecord("Васильев", "9883971090");
        phoneDirectory.addRecord("Вакуленко", "9996543653");
        phoneDirectory.addRecord("Петров", "9886880988");
        phoneDirectory.addRecord("Иваненко", "9615555445");
        phoneDirectory.addRecord("Кардашьян", "9883912040");
        phoneDirectory.addRecord("Васильев", "9377158500");
        phoneDirectory.addRecord("Петров", "9613871523");
        phoneDirectory.addRecord("Кардашьян", "9996669966");


        for (String number : phoneDirectory.getNumbers("Петров")){
            System.out.println("Петров " + number);
        }

        for (String number : phoneDirectory.getNumbers("Васильев")) {
            System.out.println("Васильев " + number);
        }

        for (String number : phoneDirectory.getNumbers("Кардашьян")) {
            System.out.println("Кардашьян " + number);
        }
    }
}
