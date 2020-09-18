package week1.day1;

public class Factorial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int factNum = 1;
		for (int i = 1; i <= num; i++) {
			factNum=factNum*i;
		}

		System.out.println(factNum);
	}

}
