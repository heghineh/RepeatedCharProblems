package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {             //Find the first repeated character from the string.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence.");
        String str = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                Integer integer = map.get(ch);
                integer++;
                map.put(ch, integer);
                if (integer > 1) {
                    System.out.println("The first repeated character:  " + ch);
                }
            }
        }
        System.out.println(map);
    }
}
