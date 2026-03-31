package DynamicProgramming;
        /* A robber wants to steal money from houses arranged in a straight line
         goal:
           Find maximum amount of money the robber can steal without robbing adjacent hoses
         constraint:
           if the robber robs two adjacent house,the police will be altered*/


public class HouseRobberProblem {

	  public static int rob(int n,int nums[]) {
		  if(n==1) {
			  return nums[0];
		  }
		  int dp[]=new int[n];
		  dp[0]=nums[0];
		  dp[1]=Math.max(nums[0], nums[1]);
		  for(int i=2;i<n;i++) {
			  dp[i]=Math.max(dp[i-1], nums[i]+dp[i-2]);
		  }
		  return dp[n-1];
	  }
	public static void main(String[] args) {
		int nums[]= {3,5,6,9};
		int n=nums.length;
		System.out.println("Maximum amount is:"+rob(n,nums));
	}
}
