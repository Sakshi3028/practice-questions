package arrays;

import java.util.Arrays;

public class move_zeroes {
    public static void moveZeroes(int [] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                j++;
            }
        }
       
    }
    public static void main(String[] args) {
        int nums[]={1,3,0,6,9,0,7};
    System.out.println("before");
    System.out.println(Arrays.toString(nums));

    moveZeroes(nums);
    System.out.println("After");
    System.out.println(Arrays.toString(nums));

        
    }
}
