package _05_ExceptioinHandling;

import java.util.Scanner;

public class _02_ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Index :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
			 //System.out.println(arr[i]);
		}
		try {
			System.out.println("Enter the index of the array element you want to access");
			int a=sc.nextInt();
			System.out.println("The array element at index "+a+" = "+arr[a]);
			System.out.println("The array element successfully accessed");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}
}
