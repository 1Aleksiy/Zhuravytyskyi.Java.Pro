package com.hillel.zhuravytskii.homeworks.homework12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("grape");
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("apple");
        stringList.add("kiwi");


        int occurrence = countOccurance(stringList, "apple");
        System.out.println("Occurrence of 'apple': " + occurrence);


        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println("List: " + list);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        numberList.add(4);
        numberList.add(5);
        numberList.add(4);
        numberList.add(3);
        List<Integer> uniqueList = findUnique(numberList);
        System.out.println("Unique List: " + uniqueList);


        List<String> wordList = new ArrayList<>();
        wordList.add("bird");
        wordList.add("fox");
        wordList.add("cat");
        wordList.add("bird");
        wordList.add("bird");
        wordList.add("cat");
        calcOccurance(wordList);


        List<String> wordList2 = new ArrayList<>();
        wordList2.add("bird");
        wordList2.add("fox");
        wordList2.add("cat");
        wordList2.add("bird");
        wordList2.add("bird");
        wordList2.add("cat");
        List<WordOccurrence> occurrences = findOccurance(wordList2);
        System.out.println("Occurrences: " + occurrences);
    }

    public static int countOccurance(List<String> stringList, String target) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numberList) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : numberList) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    public static void calcOccurance(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static class WordOccurrence {
        private String name;
        private int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        public String getName() {
            return name;
        }

        public int getOccurrence() {
            return occurrence;
        }

        @Override
        public String toString() {
            return "{name: " + name + ", occurrence: " + occurrence + "}";
        }
    }

    public static List<WordOccurrence> findOccurance(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        List<WordOccurrence> occurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            occurrences.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return occurrences;
    }
}



