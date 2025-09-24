import java.util.*;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter a number for nested operation (1, 2, 3): ");
        int d = sc.nextInt();

        if (op == '+') {
            int e = a + b;
            System.out.println("Original sum: " + e);

            switch (d) {
                case 1: e += 1; System.out.println("After adding 1: " + e); break;
                case 2: e += 2; System.out.println("After adding 2: " + e); break;
                case 3: e += 3; System.out.println("After adding 3: " + e); break;
                default: System.out.println("No additional operation"); break;
            }

        } else if (op == '-') {
            int e = a - b;
            System.out.println("Original difference: " + e);

            switch (d) {
                case 1: e -= 1; System.out.println("After subtracting 1: " + e); break;
                case 2: e -= 2; System.out.println("After subtracting 2: " + e); break;
                case 3: e -= 3; System.out.println("After subtracting 3: " + e); break;
                default: System.out.println("No additional operation"); break;
            }

        } else if (op == '*') {
            int e = a * b;
            System.out.println("Original product: " + e);

            switch (d) {
                case 1: e *= 1; System.out.println("After multiplying by 1: " + e); break;
                case 2: e *= 2; System.out.println("After multiplying by 2: " + e); break;
                case 3: e *= 3; System.out.println("After multiplying by 3: " + e); break;
                default: System.out.println("No additional operation"); break;
            }

        } else if (op == '/') {
            if (b != 0) {
                int e = a / b;
                System.out.println("Original division: " + e);

                switch (d) {
                    case 1: e /= 1; System.out.println("After divided by 1: " + e); break;
                    case 2: e /= 2; System.out.println("After divided by 2: " + e); break;
                    case 3: e /= 3; System.out.println("After divided by 3: " + e); break;
                    default: System.out.println("No additional operation"); break;
                }
            } else {
                System.out.println("Error: Division by zero");
            }

        } else if (op == '%') {
            if (b != 0) {
                int e = a % b;
                System.out.println("Original modulus: " + e);

                switch (d) {
                    case 1: e %= 1; System.out.println("After modulus by 1: " + e); break;
                    case 2: e %= 2; System.out.println("After modulus by 2: " + e); break;
                    case 3: e %= 3; System.out.println("After modulus by 3: " + e); break;
                    default: System.out.println("No additional operation"); break;
                }
            } else {
                System.out.println("Error: Modulus by zero");
            }

        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
















































































































































        



