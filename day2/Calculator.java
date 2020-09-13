package week1.day2;

public class Calculator {

	public void addNum(int a,int b) {
		int output=a+b;
		System.out.println(output);

	}

	public void subract(int a,int b) {
		// TODO Auto-generated method stub
		int output=a-b;
		System.out.println(output);
	}
	
	public void multiply(double a,double b) {
		// TODO Auto-generated method stub
		double output=a*b;
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.addNum(150, 50);
		calc.subract(150, 50);
		calc.multiply(150, 50);

	}

}
