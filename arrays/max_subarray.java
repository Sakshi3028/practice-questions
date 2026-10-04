package arrays;

public class max_subarray {
     public static int maxSubArray(int[] nums) {
    //subarray=continous part
    int currsum=nums[0];
    int maxsum=nums[0];
    for(int i =1; i<nums.length;i++){
        currsum=Math.max(nums[i],currsum+nums[i]);
        maxsum=Math.max(maxsum,currsum);
    }
    return  maxsum;
     }
    public static void main(String[] args) {
      

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);  
    
}
}