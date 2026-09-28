public class find_min_in_rotated_sorted_array {


    public static void main(String[] args) {

        int nums[] = {4, 5, 6, 7, 0, 1, 2};

       find_min_in_rotated_sorted_array obj =
                new find_min_in_rotated_sorted_array();

        int result = obj.findMin(nums);

        System.out.println("Minimum element = " + result);
    }

    public int findMin(int[] nums) {

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            // Right half is smaller
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            }
            else {
                e = mid;
            }
        }

        return nums[s];
    }
}

