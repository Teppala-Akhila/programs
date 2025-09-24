package calculator;
import java.util.*;
public class S_witch {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
		char c=sc.next().charAt(0);

        System.out.print("Enter first number: ");
		int a=sc.nextInt();

        System.out.print("Enter second number: ");
		int b=sc.nextInt();
		switch(c){
		    case '+': System.out.println("addition is " +(a+b));
		              break;
		    case '-': System.out.println("subtraction is " +(a-b));
		              break;
		    case '*': System.out.println("multiplication is " +(a*b));
		              break;
		    case '/': 
		        if(b!=0){
		            System.out.println("division is " +(a/b));
		              break;
		        }
		        else{
		            System.out.println("Invalid");
		        }
		    case '%': System.out.println("modulas is " +(a%b));
		              break;
		    default:System.out.println("Invalid operation");
            }
        }
}
