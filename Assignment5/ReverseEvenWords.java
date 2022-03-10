package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) 
	
	{
	  String test = "I am a software tester";
	  String[] split = test.split(" ");
	  for (int i = 0; i < split.length; i++) 
	  {
		  if(i%2==1)
		  {
			  char[] splitArray = split[i].toCharArray();
			  for (int j = splitArray.length-1; j >= 0; j--) 
			  {
				System.out.println(splitArray[j]);
			  }
			  System.out.println(" ");
			  
		  }
		  else
		  {
			  System.out.println(split[i]+ " ");
		  }
	  }
	 
	 
	  }
	  
	  
      
	}


