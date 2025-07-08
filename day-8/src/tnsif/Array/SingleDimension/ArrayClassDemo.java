package tnsif.Array.SingleDimension;

import java.sql.Array;
import java.util.Arrays;

public class ArrayClassDemo {
	public static void main(String[] args) {
		
		//get the array
		int intArr[]= {69,20,11,40,15};
		
		//print the array
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+" ");
		}
		System.out.println();
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary search
		System.out.println(Arrays.binarySearch(intArr, 25));
		
		//get the second array
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		
		Arrays.sort(intArr1);
		System.out.println(Arrays.toString(intArr1));
		
		if(Arrays.compare(intArr, intArr1)==0) {
			System.out.println("both the array ara same");
		}
		else {
			System.out.println("both the array are not same");
		}
		//copy of array
		int intArr2[]=Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[] = Arrays.copyOfRange(intArr1, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		Arrays.fill(intArr2, 7);
		System.out.println(Arrays.toString(intArr2));
		
		
		
	}

}
