package arrays;

import java.util.Arrays;

public class duplicate {
    public static  int printduplicate(int[]nums){
      int j=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[j]=nums[i];
            j++;
        }
    }
    return j;
    }
    public static void main(String[] args) {
        int[]nums={1,2,2,3,3,4};
        System.out.println(Arrays.toString(nums));
        int k=printduplicate(nums);
        System.out.println("no of unique elements: " +k);
        System.out.println("after");
        
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        
    }
    
}
