package calculator;

import java.util.Scanner;

public class Decision {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);  // read first character

        System.out.print("Enter first number: ");
        int b = sc.nextInt();

        System.out.print("Enter second number: ");
        int c = sc.nextInt();

        if (op == '+') {
            System.out.println(b + c);
        } else if (op == '-') {
            System.out.println(b - c);
        } else if (op == '*') {
            System.out.println(b * c);
        } else if (op == '/') {
            if (c != 0) {
                System.out.println((double) b / c); // floating-point division
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
