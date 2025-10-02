package practise;

import java.util.Scanner;

public class sum_of_each_column {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no.of cols:");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++) {
				sum=sum+arr[j][i];
			}
			System.out.println("The sum of column "+i+" is "+sum);
		}

	}

}
