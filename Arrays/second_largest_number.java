//max element

//package practise;
//
//import java.util.*;
//public class maximum {
//
//	public static void main(String[] args) {
//		int[] arr= {3,7,9,3,8,3};
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//	}
//}

//reverse an array
//package practise;
//
//import java.util.*;
//public class maximum {
//
//	public static void main(String[] args) {
//		int[] arr= {3,7,9,0,8,2};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//	}
//}

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


//package practise;
//
//import java.util.*;
//public class maximum {
//
//	public static void main(String[] args) {
//		int[] arr= {3,7,9,0,8,2};
//		
//	}
//}


//package practise;
//
//import java.util.*;
//public class maximum {
//
//	public static void main(String[] args) {
//		int[] arr= {3,7,9,0,8,2};
//		
//	}
//}
