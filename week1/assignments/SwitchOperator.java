package week1.assignments;

public class SwitchOperator {


	public static void main(String[] args) {

		int valueA= 2;
		int valueB=3;

		String Ops="add";


		switch (Ops) {
		case ("add"):
			System.out.println("Addition of two numbers is: "+(valueA+valueB));
		break;
		case ("sub"):
			System.out.println("Subtraction of two numbers is: "+(valueA-valueB));
		break;
		case ("mul"):
			System.out.println("Multiplication of two numbers is: "+(valueA*valueB));
		break;
		case ("div"):
			System.out.println("Division of two numbers is: "+(valueA/valueB));
		break;

		default:
			break;
		}	

	}

}
