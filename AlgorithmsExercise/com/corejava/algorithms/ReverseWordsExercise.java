package com.corejava.algorithms;

import java.util.List;
import java.util.regex.Pattern;

public class ReverseWordsExercise {

	public static String getReversedSentence(String inputString) {
		
		//String[] splitInputString = inputString.split(" ");
		StringBuilder tempStr = new StringBuilder();
		
		/*
		int length = splitInputString.length;
				
		for(int i=length-1; i>=0; i--) {
			tempStr.append(splitInputString[i]);
			if (i!=0) tempStr.append(" ");
		}*/
		
		
		int currIdx=inputString.length() -1;
		int lastIdx=currIdx;
		
		while(currIdx >= 0) {
		
			Character currChar = inputString.charAt(currIdx);
			
			if(Character.isLetter(currChar)) {
				if (lastIdx == 0) {
					lastIdx = currIdx;
				}
				
				if (currIdx == 0) {
					tempStr.append(inputString.substring(currIdx, lastIdx+1));
				}
				
				currIdx--;
				//tempStr.append(currChar);
			}
			else {
				if (lastIdx != 0) {
					tempStr.append(inputString.substring(currIdx+1, lastIdx+1));
					tempStr.append(currChar);
				}
				else {
					tempStr.append(currChar);
				}
				
				currIdx--;
				lastIdx=0;
				
			}
		}
		
		return tempStr.toString();
	}
	
}
