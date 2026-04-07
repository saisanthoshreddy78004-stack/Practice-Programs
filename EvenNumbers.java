package CoreJavaProgram;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,i=4;
		System.out.println("Enter the limit to get series:");
		n=sc.nextInt();
		System.out.print("1 ");
		for(i=4;i<=n;i+=2) {
			System.out.print(i+" ");
		}

	}

}
