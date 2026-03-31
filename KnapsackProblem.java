package DynamicProgramming;
   /* Rules:
         1.Every item has a weight and value
         2.your knapsack has a weight limit
         3.choose which items you want to bring with you in the knapsack
         4.you can't take half of the item, take either an item or not
         Goal:
           maximize the total value of the knapsack
     */
     


	/*
	     items={1,2,3,4,5}
	     weights={3,2,4,5,1} in terms of kgs
	     price={50,40,70,80,10}
	     
	     bag capacity=7 kgs
	     
	     possibilities:
	     (1) item1 and item3= 3,4=7  = (50+70)=120
	     (2) item2 and item4= 2,5=7  = (40+80)=120
	     (3) item2,item3 and item 5= 2,4,1=7 = (40+70+10)=120
	     
	     
	     
	 */
public class KnapsackProblem {
	
	 public static int knapsack(int w,int[] val,int[] wt) {
		 int n=wt.length;
		 int[][] dp=new int[n+1][w+1];
		 for(int i=0;i<=n;i++) {
             for(int j=0;j<=w;j++) {
            	 if(i==0 || j==0) {
            		 dp[i][j]=0;
            	 }
            	 else {
            		 int pick=0;
            		 if(wt[i-1]<=j)
            			 pick=val[i-1]+dp[i-1][j-wt[i-1]];
            		 int notpick=dp[i-1][j];
            		 dp[i][j]=Math.max(pick, notpick);
            	 }
             }
		 }
		 return dp[n][w];
	 }
	
     public static void main(String[] args) {
		int[] val= {50,40,70,80,10};
		int[] wt= {3,2,4,5,1};
		int w=5;
		System.out.println(knapsack(w,val,wt));

	}

}
