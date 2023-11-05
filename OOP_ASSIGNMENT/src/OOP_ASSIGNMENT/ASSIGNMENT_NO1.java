package OOP_ASSIGNMENT;

import java.util.Scanner;

public class ASSIGNMENT_NO1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 {



		int n,i,a,b,c,d,e,f,avg;

		System.out.println("Enter no. of students");

		Scanner obj=new Scanner (System.in);

		n=obj.nextInt();

		for(i=1;i<=n;i++) {

		System.out.println("Enter no. of sub");

		a=obj.nextInt();

		System.out.println("Marks of OOP");

		b=obj.nextInt();

		System.out.println("Marks of FP");

		c=obj.nextInt();

		System.out.println("Marks of ADE");

		d=obj.nextInt();

		System.out.println("Marks of FDS");

		e=obj.nextInt();

		System.out.println("Marks of CAO");

		f=obj.nextInt();

		avg=(f+b+c+d+e)/5;

		System.out.println("avg is"+avg);

		if(avg>=80)

		{

		System.out.println("Grade is A");

		}

		else if((avg<=80) || (avg>=60))

		{

		System.out.println("Grade is B");

		}

		else if((avg<=60) || (avg>=30))

		{

		System.out.println("Grade is C");

		}

		else

		{

		System.out.println("fail");

		}

		}

		}

		}


	}



