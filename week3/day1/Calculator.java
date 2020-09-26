package week3.day1;

public class Calculator {



	public void add(int a, int b) {
		System.out.println("add two elements : "+(a+b));
	}

	public void add(int a, int b,int c) {
		System.out.println("add three elements : "+(a+b+c));
	}

	public void subtract(int a, int b) {
		System.out.println("subtract two elements : "+(a-b));
	}

	public void subtract(double a, double b) {
		System.out.println("Subtract double values : "+(a-b));
	}


	public void multiply(int a, int b) {
		System.out.println("multiply two elements : "+a*b);
	}

	public void multiply(int a, double b) {
		System.out.println("multiply double values : "+a*b);
	}


	public void divide(int a, int b) {
		System.out.println("divide two elements : "+a/b);
	}

	public void divide(double a, int b) {
		System.out.println("divide double values : "+a/b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc=new Calculator();
		calc.add(10, 15);
		calc.add(10, 15, 20);
		calc.multiply(6, 9);
		calc.multiply(10, 5.1);
		calc.subtract(10, 5);
		calc.subtract(20.7, 5.0);
		calc.divide(10, 2);
		calc.divide(20.0, 10);

	}

}
