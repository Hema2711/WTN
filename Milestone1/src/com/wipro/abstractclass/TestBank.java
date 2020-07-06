package com.wipro.abstractclass;

public class TestBank {
public static void main(String[] args) {
	ICICIBank i=new ICICIBank();
	 KotMBank k=new KotMBank();
	 GeneralBank g=new KotMBank();
	 GeneralBank b=new ICICIBank();
	System.out.println("Rate of Savings Interest is: "+i.getSavingsInterestRate()+" %");    
	System.out.println("Rate of Fixed Deposit Interest is: "+i.getFixedDepositInterestRate()+" %");  
	System.out.println("Rate of Savings Interest is: "+k.getSavingsInterestRate()+" %");    
	System.out.println("Rate of Fixed Deposit Interest is: "+k.getFixedDepositInterestRate()+" %");  
	System.out.println("Rate of Savings Interest is: "+g.getSavingsInterestRate()+" %");    
	System.out.println("Rate of Fixed Deposit Interest is: "+g.getFixedDepositInterestRate()+" %");  
	System.out.println("Rate of Savings Interest is: "+b.getSavingsInterestRate()+" %");    
	System.out.println("Rate of Fixed Deposit Interest is: "+b.getFixedDepositInterestRate()+" %");  
}
}
abstract class GeneralBank{
	abstract int getSavingsInterestRate(); 
	abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank{
	int getSavingsInterestRate()
	{
		return 4;
	}
	double getFixedDepositInterestRate()
	{
		return 8.5;
	}
	
}
class KotMBank extends GeneralBank{
	int getSavingsInterestRate()
	{
		return 6;
	}
	double getFixedDepositInterestRate()
	{
		return 9;
	}
	
}