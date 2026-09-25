public class binary_serach {
    public static int search(int[] nums, int target){
      int s=0;
      int e=nums.length-1;
      int mid;
      while(s<=e){
        mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            s=mid+1;

        }
        else if(nums[mid]>target)
             e=mid-1;
      }
    
    return -1;
  
}
public static void main(String[] args) {
    int[] nums={-1,0,3,5,9,12};
    int target=9;
    int result=search(nums,target);
    System.out.print("index: " + result);

    
}
  }

    
