class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = ( nums.length * ( nums.length + 1 ) ) / 2;

        int actual = 0;
        for ( int num : nums) {
            actual += num;
        }

        return expectedSum - actual;
    }    
}