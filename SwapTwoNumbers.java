package PracticePrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=3,b=9,c;
		c=b;
		b=a;
	    a=c;
		System.out.print(a+ " "+b);

	}

}

/*      a=3    b=9
     temporary c
       a=3->  b
         b=9->  a 
        		 c=a;  //c=3
             a=b;  //a=9
             b=c;  //b=3
            
             a=9    b=3  */ 
