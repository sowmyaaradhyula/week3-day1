package week3.day1;

public class CharOccurance {

	public static void main(String[] args) 
	{
		
		String str = "welcome to chennai";
		int count = 0;
		
		char[] charArray = str.toCharArray();
		int length = charArray.length;
        
		for (int i = 0; i < length; i++) 
		{
			if(charArray[i] == 'i')
			{
				count++;
			}
		}
		System.out.println("Character occurance in given string is " + count);
	}

}
