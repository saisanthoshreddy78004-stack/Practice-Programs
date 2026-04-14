package CoreJavaProgram;

import java.util.Arrays;

public class RearrangedArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, -4, -1, 4, -6, -7};

	        rearrange(arr);

	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	    }
	    static void rearrange(int[] arr) {
	        int n = arr.length;
	        int i = 0, j = n - 1;
	        while (i < j) {
	            while (i < n && arr[i] > 0) i++;
	            while (j >= 0 && arr[j] < 0) j--;
	            if (i < j) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int pos = 0, neg = i;  

	        while (pos < n && neg < n && arr[pos] > 0) {
	            int temp = arr[pos + 1];
	            arr[pos + 1] = arr[neg];
	            arr[neg] = temp;

	            pos += 2;
	            neg++;
	        }
	    }
		
 
}