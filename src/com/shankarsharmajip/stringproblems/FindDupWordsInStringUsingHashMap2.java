package com.shankarsharmajip.stringproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//GFG
public class FindDupWordsInStringUsingHashMap2 {

	public static void main(String[] args) {
		String input = "Shankarlal Sharma Shankarlal Shah";
		String[] words = input.split("\\W");
		
		Map<String, Integer> wordmap = new HashMap<>();
		
		
		for(String word: words) {
			if(wordmap.get(word)!=null) {
				wordmap.put(word, wordmap.get(word)+1);
			} else {
				wordmap.put(word, 1);
			}
		}
		
		Set<String> wordset = wordmap.keySet();
		
		System.out.println("Duplicate words: ");
		for(String word: wordset) {
			if(wordmap.get(word)>1) {
				System.out.println(word);
			}
		}
		
	}

}
