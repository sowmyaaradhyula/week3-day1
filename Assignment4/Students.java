package week3.day1;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("This is student's info");
	}

	public void getStudentInfo(int id)
	{
		System.out.println("This is student's id");
	}
	
	public void getStudentInfo(String name)
	{
		System.out.println("This is student's name");
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("This is student's id and name");
	}
	
	public static void main(String[] args) 
	{
		
		Students s1 = new Students();
		s1.getStudentInfo();
		s1.getStudentInfo(2);
		s1.getStudentInfo("sowmya");
		s1.getStudentInfo(1, "Dhruv");
     
	}

}
