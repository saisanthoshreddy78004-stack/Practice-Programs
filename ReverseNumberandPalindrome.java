package PracticePrograms;

public class ReverseNumberandPalindrome {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
     System.out.println("Reverse of a number:"+rev);
     
     if(rev==temp) {
    	 System.out.println("The number is palindrome");
       }
     else {
    	 System.out.println("The number is not a palindrome");
     }
     
	}

}
