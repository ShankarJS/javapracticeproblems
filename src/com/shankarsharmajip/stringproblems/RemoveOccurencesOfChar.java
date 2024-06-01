package com.shankarsharmajip.stringproblems;
//Remove all occurrences of a given character from input String? 


public class RemoveOccurencesOfChar{
    public static void main(String args[]) {
      String str = "programming";
      char ch = 'g';
      String str2 = "";


      for(int i = 0; i < str.length(); i++){
          if(str.charAt(i)!=ch){
              str2= str2+str.charAt(i);
          }
      }
      System.out.println(str2);


        //   String str2 = str.replaceAll("m", "");  //using inbuilt function replaceAll()
        //   System.out.println(str2);
    }
}
