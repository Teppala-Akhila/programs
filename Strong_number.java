import java.util.*;
public class Strong_number{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(a!=0) {
			int d=a%10;
			int fact=1;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		System.out.println("sum of factorials of number " +sum);
		if(sum==temp) {
			System.out.println("strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
}

// output:
// Enter a number:
// 145
// sum of factorials of number 145
// strong number

// Enter a number:
// 132
// sum of factorials of number 9
// Not a strong number