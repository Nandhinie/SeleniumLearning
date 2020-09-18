package week1.day2;

public class Calculator {

	public int addNum(int a,int b) {
		return a+b;
	}

	public int subract(int a,int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public double multiply(double a,double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		int add=calc.addNum(150, 50);
		System.out.println(add);
		
		int subract=calc.subract(150, 50);
		System.out.println(subract);
		
		double multiply=calc.multiply(150, 50);
		System.out.println(multiply);

	}

}
