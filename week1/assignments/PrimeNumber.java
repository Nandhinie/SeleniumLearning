package week1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {

		int nVal=23;

		boolean flag = false;

		for (int i=2;i<=((nVal/2)+1);i++) {
			if(nVal%i==0) {
				flag=true;
				break;
			}
		}


		if(flag==true) {
			System.out.println("Output :" +nVal +" is not a Prime Number");
		}
		else {
			System.out.println("Output :" +nVal +" is a Prime Number");
		}

	}

}
