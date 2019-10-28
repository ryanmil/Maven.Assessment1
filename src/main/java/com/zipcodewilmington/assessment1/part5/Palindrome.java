package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String str = input.substring(i, j);
                if (str.equals(BasicStringUtils.reverse(str))) {
                    count++;
                }
            }
        }
        return count;
    }
}
