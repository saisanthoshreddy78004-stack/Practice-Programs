package CoreJavaProgram;
//   1 -2 3 5 -6 7 9 -10 11 13   
//   1  3  5  7  9  11  13 
//   -2  -6  -10
public class PosNegNumSeries 
{

	public static void main(String[] args)
	{
	      int i,k=1;
	      for(i=1;i<13;i++)
	      {
	    	  	if(i==4||i==8||i==12)	continue;
	    	  	if(i%2==0)	
	    	  	{ 
	    	  		k=i*-1;
	    	  		System.out.print("\t"+k);
	    	  	}
	    	  	if(i%2!=0)
	    	  	System.out.print("\t"+ i);
	      }
	}
}

