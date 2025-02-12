class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // n log n

        for (int i = 0; i < nums.length - 2; i++) {
            // If lowest num is greater than 0, then no possible solution
            if (nums[i] > 0) { break; }
            
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i-1]) { continue; }

            int l = i + 1;
            int r = nums.length - 1;

            while (l<r) {  
                if (nums[i] + nums[l] + nums[r]==0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    l++;

                    // Skip duplicates
                    while (nums[l] == nums[l - 1] && l<r) {
                        l++;
                    }
                    r--;

                    // Skip duplicates
                    while (nums[r] == nums[r + 1] && l<r) {
                        r--;
                    }
                }
                else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        return result;
    }
}