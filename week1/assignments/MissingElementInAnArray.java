package week1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		boolean isFound = false;
		// Sort the array	
		Arrays.sort(arr);
		int maxVal =arr[arr.length-1];

		for (int i = 1; i <= maxVal; i++) {
			isFound=false;
			for (int j=0; j < arr.length; j++) {

				if (arr[j]==i) {
					isFound=true;
					break;
				}

			}
			if(isFound==false) {
				System.out.println(i);
			}
		}

	}

}
