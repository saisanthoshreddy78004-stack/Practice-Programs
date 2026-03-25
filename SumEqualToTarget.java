package DynamicProgramming;
 /*    given an array arr[] of length n and an integer target, 
       the task is to find the number of subsets
       ex:
            arr[]={1,2,3,3}
            output=3
            
            arr[]={{1,2,3}
                   {1,2,3}
                   {3,3}
                   }
            "" Counting the no of subsets in given array 
            that matches exactly to the given sum or target""
            

 */


public class SumEqualToTarget {
         
	 public static int perfectSum(int[] arr, int target) {
		 int n=arr.length;
		 int[][] dp=new int[n+1][target+1];
		 dp[0][0]=1;
		 for(int i=1;i<=n;i++) {
			 for(int j=0;j<=target;i++) {
				 dp[i][j]=dp[i-1][j];
				 if(j>=arr[i-1]) {
					 dp[i][j]+=dp[i-1][j-arr[i-1]];
				 }
			 }
		 }
		 return dp[n][target];
	 }
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int target=6;
		System.out.println(perfectSum(arr,target));
	}

}
