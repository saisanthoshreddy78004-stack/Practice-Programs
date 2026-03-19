package PracticePrograms;
public class Armstrong {
	public static void main(String[] args) {
		int num=153;
		int sum=0,temp=num;
		while(num!=0) {                                                      
			int digit=num%10;                                                                                                
			sum+=digit*digit*digit;
			num=num/10;                                       
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("The number is Amstrong");
		}
		else {
			System.out.println("The number is not Amstrong");
		}
	}
}