package CoreJavaProgram;

public class Series3 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			if(i==4) {
				continue;
			}
			System.out.print((int)Math.pow(i, 2)+ " ");
	   }
    }
}
