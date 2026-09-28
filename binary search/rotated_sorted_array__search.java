public class rotated_sorted_array__search {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=5;
        rotated_sorted_array__search obj=new rotated_sorted_array__search();
        int result=obj.search(nums, target);
        System.out.println("tARGET INDEX" + result );
    }
    public int search(int []nums,int target){
    int s=0;
    int e=nums.length-1;
    int mid;
    while(s<=e){
        mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
    
         if(nums[s]<nums[mid]){
            //left half sorted array
           if(nums[s]<=target && target <=nums[mid] ){
            e=mid-1;
           }
           else{
            s=mid+1;
           }
        }else{

        
        //right half sorted
        if(nums[mid]<=target && target<=nums[e]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }

    }
    return -1;

}
}

