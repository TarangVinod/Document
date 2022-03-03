package Assignment_nov9;

import java.util.Scanner;

public class mul {

	public static void main(String[] args) {
	
	
		int n1=0,n2=1,n3;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number till which you want to print series");
		int n=s.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
		}
		
		
	
	}
	}