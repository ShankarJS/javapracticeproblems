package com.jip.problems.seta;

import java.util.HashSet;
import java.util.Set;

//GFG
public class FindDupWordsInStringUsingHasSet2 {
	public static void main(String[] args) {
		String input = "Love what you Do, Do what you Love Steve";
		String[] words = input.split("\\W");
		
		Set<String> wordset = new HashSet<>();
		
		System.out.println("Duplicate words are: ");
		for(int i = 0; i<words.length-1; i++) {
			for(int j=1; j<words.length; j++) {
				// if strings matched then adding strings in
                // Set because if we ad same string set will
                // remove one and we have only repeated
                // words.
				if(words[i].equals(words[j]) && i!=j) {
					wordset.add(words[i]);
				}
			}
		}
		
		System.out.println(wordset);
		
	}
}
