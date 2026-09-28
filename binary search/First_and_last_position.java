public class First_and_last_position {
    public int[] searchRange(int[] nums, int target) {
        
int first=findfirst(nums, target);
int last=findlast(nums,target);
return new int[]{first,last};

}
        public int findfirst(int[] nums, int target){
          int s=0;
          int e=nums.length-1;
          int mid;
          int first=-1;
          while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }

          }
          return first;
        }
       public int findlast(int[] nums, int target){
          int s=0;
          int e=nums.length-1;
          int mid;
          int last=-1;
          while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                last=mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }

          }
          return last;
        }   

}
