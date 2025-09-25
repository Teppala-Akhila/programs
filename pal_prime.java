import java.util.*;
public class pal_prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int count=0;
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int temp=a;
		while(a!=0) {
			int d=a%10;
			sum = sum*10+d;
			a=a/10;
		}
		if(sum==temp) {
			for(int j=1;j<=temp;j++) {
				if(temp%j==0) {
					count=count+1;
				}
			}
		}
		else {
			System.out.println("not a palindrome");
		}
		if(count==2) {
			System.out.println("pal_prime");
		}
		else {
			System.out.println("not pal_prime");
		}
	}
}

// output:
// Enter a number:
// 131
// pal_prime

// Enter a number:
// 21
// not a palindrome