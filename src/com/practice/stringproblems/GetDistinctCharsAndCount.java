package com.practice.stringproblems;
//Java program to get distinct characters and their count in a String? 


import java.util.HashMap;


public class GetDistinctCharsAndCount {
    public static void main(String args[]) {
      String str = "proGramming";
      HashMap<Character, Integer> hm = new HashMap();
      
      for(int i=0; i<str.length(); i++){
          char ch = str.charAt(i);
          if(hm.containsKey(ch)){
              hm.put(ch, hm.get(ch)+1);
          } else{
              hm.put(ch, 1);
          }
      }
      System.out.println(hm);
    }
}
