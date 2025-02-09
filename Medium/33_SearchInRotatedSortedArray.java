class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (right - left) / 2;

        while (left <= right){
            if (target == nums[middle]) {
                return middle; // Success!
            }
            // In left sorted list
            if (nums[middle] >= nums[left]) {
                if (target > nums[middle] || target < nums[left]) {
                    left = middle + 1;
                    middle = (right + left) / 2;
                }
                else {
                    right = middle - 1 ;
                    middle = (right + left) / 2;
                }
            }

            // In right sorted list 
            else {
                if ( target < nums[middle] || target >= nums[left]) {
                    right = middle - 1 ;
                    middle = (right + left) / 2;
                }
                else {
                    left = middle + 1;
                    middle = (right + left) / 2;
                }
            }
        }

        return -1;
    }
}