package axisbank;

import bankInfo.BankInfo;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("this is new deposit account");
	}
	
	public static void main(String[] args) 
	{
		AxisBank axis = new AxisBank();
		axis.fixed();
		axis.saving();
		axis.deposit();
	}
	
	
}
