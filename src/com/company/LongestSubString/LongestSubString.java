package com.company.LongestSubString;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {

        System.out.print(lengthOfLongestSubstring("dvdf"));
    }
    
    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        Map<Character,Integer> countMap = new HashMap<>();
        for (int right = 0, left = 0; right < s.length(); right++) {
            
            Character currentChar = s.charAt(right);
            if (countMap.containsKey(currentChar) && countMap.get(currentChar) >= left) {
                left = countMap.get(currentChar) + 1;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            countMap.put(currentChar, right);
        }
        
        return maxLength;
    }
}
