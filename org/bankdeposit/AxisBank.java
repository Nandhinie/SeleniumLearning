package org.bankdeposit;

public class AxisBank extends BankInfo{

	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("Deposit. 1.90 % p.a.. fixed for 12 months");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis=new AxisBank();
		
		axis.deposit();
		axis.saving();
		axis.fixed();
	}

}
