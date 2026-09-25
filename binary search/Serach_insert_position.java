public class Serach_insert_position {

    public static int Serachinsert(int[] nums,int target){
      int s=0;
      int e= nums.length-1;
      int mid;
      while(s<=e){
        mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;

        }
        else if(nums[mid]<target){
            s=mid+1;
        }
        else if(nums[mid]>target){
            e=mid-1;
        }
        
      }
      return s;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result=Serachinsert(nums,target);
        System.out.println("insert position:" + result); 
    }
}