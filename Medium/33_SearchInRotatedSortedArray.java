class Solution {
    public int search(int[] nums, int target) {
        int back = nums[nums.length - 1];
        int kValue = 0;

        for( int i = nums.length - 2; i >= 0; i--){
            if (nums[i] > back){
                kValue = i + 1;
                break;
            }
            back = nums[i];
        }

        int value = -1;
        int p1 = 0;
        int p2 = nums.length;
        int midPointIndex = ((p2 + p1) / 2);
        int adjustedIndex = (midPointIndex + kValue) % nums.length;
        value = nums[adjustedIndex];

        while ( value != target ){
            if ( p1+1 == p2 ){
                return -1;
            }

            if( value > target){
                p1 = p1;
                p2 = midPointIndex;
                midPointIndex = ((p2 + p1) / 2);
                adjustedIndex = (midPointIndex + kValue) % nums.length;
                value = nums[adjustedIndex];
                continue;
            }

            else if( value < target ){
                p1 = midPointIndex;
                p2 = p2;
                midPointIndex = ((p2 + p1) / 2);
                adjustedIndex = (midPointIndex + kValue) % nums.length;
                value = nums[adjustedIndex];
                continue;
            }
        }

        return adjustedIndex;
    }
}