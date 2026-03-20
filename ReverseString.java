package PracticePrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="Prasanna";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println("Reverse of a String is:"+rev);

	}

}










