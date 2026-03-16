package practise;

import java.util.*;
public class second_largest_number {

	public static void main(String[] args) {
		int[] arr= {10,8,3,7,9,0,1,2};
		int max=arr[0];
		int second=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>second & arr[i]<max) {
				second=arr[i];
			}
		}
		System.out.println(second);
	}
}



