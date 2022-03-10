package week3.day1;

public class FindTypes {

	public static void main(String[] args) 
	{
		
		String test = "$$ Welcome to 2nd class of Automation $$";
		int letter = 0;
		int digit = 0;
		int space = 0;
		int specialCharacter = 0;
		
		char[] testArray = test.toCharArray();
		
		for (int i = 0; i < testArray.length; i++) 
		{
			if(Character.isLetter(testArray[i]))
			{
				letter++;
				
			}
			else if (Character.isDigit(testArray[i])) 
			{
				digit++;
				
			}
			else if(Character.isSpaceChar(testArray[i]))
			{
				space++;
				
			}
			else
			{
				specialCharacter++;
			}
		}
		System.out.println("Number of letters are " + letter);
		System.out.println("Number of digits are " + digit);
		System.out.println("Number of spaces are " + space);
		System.out.println("Number of special characters are " + specialCharacter);
	}

	
}
