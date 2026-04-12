package CoreJavaProgram;

import java.util.Scanner;

public class TwistedTriboSeries {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int n,a=1,b=0,c=2,d=1;
				System.out.println("Enter the Limit of Series:");
				n=sc.nextInt();
		        while(n>=0) {
		        	a=b;
		        	b=c;
		        	c=d;
		        	System.out.print(" "+a);
		        	d=a+b+c;
		        	n--;
		        }
			}
}