// 3.maximumSubarray

class maximumSubarraySum{

    //brute force 


    // Function to find the sum of subarray with maximum sum
    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
  
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
              
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

    // kadane's algorithm
    
    static int maxSubarraySum1(int[] arr) {
        int res = arr[0];
        int currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            res = Math.max(res,currentSum);
            if(currentSum<0)
            {
                currentSum=0;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
        System.out.println("using kadane's algorithm = "+maxSubarraySum1(arr));

    }
}