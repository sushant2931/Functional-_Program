package Functional_Programs;

import java.util.Scanner;

public class SumOfTwoNumbers_AddsToZero {
	
	
		
		static Scanner sc = new Scanner(System.in);
		
		static void sumofnumbers (int n) {
			int arr[] = new int[n];
			
			int count =0;
			
			System.out.println("Enter the values :");
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<arr.length; i++)
			{
				for(int j = i+1; j< arr.length; j++)
				{
					for(int k = j+1; k< arr.length; k++)
					{
						if(arr[i] + arr[j] + arr[k] == 0)
						{
							count++;
							System.out.println(arr[i]+ "+" + arr[j]+ "+" + arr[k]+ "=" + "0");
						}
					}
				}
			}
			
			System.out.println("Total number of pairs having sum 0 :" + count);
			
		}
		
		public static void main(String[] args) {
			
			
			System.out.println("Enter number of Inputs: ");
			int n = sc.nextInt();
			
			sumofnumbers(n);
			
			
			
			
			
		}

	
}
