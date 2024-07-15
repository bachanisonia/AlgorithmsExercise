package com.corejava.algorithms;

public class PhoneNumberDecoder {

	public static String decode(String inputPhone) throws InvalidCharacterException {
		
		StringBuilder tempPhone = new StringBuilder();
		
		int length = inputPhone.length();
		int i=0;
		
		while(i<length) {
			
			Character currChar =  inputPhone.charAt(i);
			
			
			if (Character.isDigit(currChar)) {
				tempPhone.append(currChar);
			}
			else {
				if (Character.isLetter(currChar)) {
					switch(currChar.toString().toLowerCase()) {
						
						case "a":
						case "b":
						case "c":
							tempPhone.append(2);
							break;
						
						case "d":
						case "e":
						case "f":
							tempPhone.append(3);
							break;
					
						case "g":
						case "h":
						case "i":
							tempPhone.append(4);
							break;
							
						case "j":
						case "k":
						case "l":
							tempPhone.append(5);
							break;
							
						case "m":
						case "n":
						case "o":
							tempPhone.append(6);
							break;
							
						case "p":
						case "q":
						case "r":
						case "s":
							tempPhone.append(7);
							break;
						
						case "t":
						case "u":
						case "v":
							tempPhone.append(8);
							break;
							
						case "w":
						case "x":
						case "y":
						case "z":
							tempPhone.append(9);
							break;
					}
				}
				else {
					throw new InvalidCharacterException();
				}
			}
			i++;
			
		}
		
		return tempPhone.toString();
	}
	
}

