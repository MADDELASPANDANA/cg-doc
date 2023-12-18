package newone;

import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter " + (i+1)+ "st element: ");
			a[i] = sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
