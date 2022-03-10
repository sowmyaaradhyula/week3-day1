package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "pots";
		int len1 = text1.length();
		System.out.println("Length of first String is " + len1);
		int len2 = text2.length();
		System.out.println("Length of first String is " + len2);
		
		if(len1 == len2)
		{
			System.out.println("Both strings are of same length");
			
			char[] charText1 = text1.toCharArray();
			Arrays.sort(charText1);			
			
			
			char[] charText2 = text2.toCharArray();
			Arrays.sort(charText2);
			
			boolean equals = Arrays.equals(charText1, charText2);
			if(equals)
			{
				System.out.println("Both strings are Anagram");
			}
			else 
			{
				System.out.println("Both strings are not Anagram");
			}
			
		}
		else 
		{
			System.out.println("Both strings are not of same size so not a anagram");
		}
	}

}
