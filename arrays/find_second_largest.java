package arrays;

public class find_second_largest {
    public static int secondlargest(int[]nums){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondlargest && nums[i]!=largest){
               secondlargest= nums[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[]nums={10,15,20,30,40};
        int result=secondlargest(nums);
        System.out.println(result);
    }
}
