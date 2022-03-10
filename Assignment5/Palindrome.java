package week3.day1;

public class Palindrome {

	public static void main(String[] args) 
	{
		String original = "madam";
		String reverse = "";
		int i = original.length();
		System.out.println("Length of String is " + i);
		for (int j = i-1; j>=0; j--) 
		{
			reverse = reverse+ original.charAt(j);
			
		}
		if(original.equals(reverse))
		{
			System.out.println("Given string is a palindrome");
		}
		
		else
		{
			System.out.println("Given String is not a palindrome");
		}
	}

}
