package week1.day2;

public class ArmstringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=153;
		int original=153;
		int calculated=0; 
		int remainder=0;
		System.out.println("Entered value :"+original);
		while(input>0)
		{
			remainder=input%10;
			calculated = calculated+(remainder* remainder* remainder);
			input= input/10;

		}
		System.out.println("Calculated value :"+ calculated);
		if(original==calculated) {
			System.out.println("It is an armstrong number :"+original);
		}
		else
		{
			System.out.println("Not an armstrong number :"+original);
		}

	}

}
