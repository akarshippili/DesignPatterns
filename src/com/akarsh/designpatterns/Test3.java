package com.akarsh.designpatterns;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "listen",
                "silent",
                "enlist",
                "inlets",
                "google",
                "elgoog",
                "rat",
                "tar",
                "art"
        );

        Map<String, List<String>> ans = new HashMap<>();
        for(String s: words){
            String sortedWord = sort(s);
            if(!ans.containsKey(sortedWord)) {
                ans.put(sortedWord, new ArrayList<>());
            }

            ans.get(sortedWord).add(s);
        }

        for(String key: ans.keySet()){
            System.out.println(ans.get(key));
        }
    }


    public static String sort(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
