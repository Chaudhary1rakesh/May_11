package com.May_assignment;
import java.util.Scanner;
public class may11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		-
//		- 
//		- 
//		-
//		- .
//		- WAP to find number of pairs with given sum
///////
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		 WAP to print all multiples of 7 till n
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%7==0)
			{
				System.out.print(i+" ");
			}
		}
//		WAP to count multiples of 3, multiples of 5 and both 3,5 in range 1-n.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%3==0)
			{
				System.out.println("Multiple of 3:"+i);
			}
		}
		for(int i=1;i<n;i++)
		{
			if(i%5==0)
			{
				System.out.println("Multiple of 5:"+i);
			}
		}
		for(int i=1;i<n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("Multiple of 3 and 5 both:"+i);
			}
		}
//		WAP to input n, loop for n times and input 2 numbers in each iteration, if iteration is even(0th,2nd,4th..) print sum else print multplication.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		long sum=0;
		long mul=1;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum+=i;
				
		
			}
			else
			{
				mul*=i;
				
			}
		}
		System.out.println("Sum:"+sum);
		System.out.print("Multiplication:"+mul);
////		WAP print 1 2 3 4
//////        5 6 7 8
//////        9 10 11 12
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  row Number:");
		int row=sc.nextInt();
		System.out.println("Enter  col Number:");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	
////		WAP to count number of pairs in 1-n with sum even
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		long sum=0;
		int i;
		for( i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum+=i;
		}
			
	}System.out.print(sum);
//		WAP to print even numbers till n 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
