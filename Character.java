import java.util.*;
public class Character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c>='A' && c<='Z') {
			System.out.println("upper");
			}else if(c>='a' && c<='z') {
				System.out.println("lower");
			}else if(c>='0' && c<='9') {
				System.out.println("digit");
			}else {
				System.out.println("special character");
			}
     }
}