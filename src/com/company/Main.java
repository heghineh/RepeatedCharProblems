package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {                          //How many times each character shows.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence.");
        String str = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                Integer integer = map.get(ch);
                integer++;
                map.put(ch, integer);
            }
        }
        System.out.println(map);
    }
}