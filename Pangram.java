package com.cloudvandana;

public class Pangram {
	
	
	public static void allLetter(String str) {
		str = str.toLowerCase();
		
		boolean b  = true;
		
		for(char ch ='a';ch<='z';ch++) {
			if(!str.contains(String.valueOf(ch))) {
				b= false;
				break;
			}
		}
		if(b) {
			System.out.println("It's a pangram");
		}
		else {
			System.out.println("It's not a pangram");
		}
	}
	
 
    public static void main(String args[])
    {

        String str = "Abcdefghijklmnopqrstuvwxyz12";

        allLetter(str);
    }
}


