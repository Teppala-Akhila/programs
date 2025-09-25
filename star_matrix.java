import java.util.*;
public class star_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
			}
	    System.out.println(" ");
		}
	}
}

// output:
// Enter a number:
// 4
// **** 
// **** 
// **** 
// **** 