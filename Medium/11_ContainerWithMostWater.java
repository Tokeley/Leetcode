class Solution {
    public int maxArea(int[] height) {

        int maxVol = 0;

        int l = 0;
        int r = height.length - 1;

        while ( l < r ) {
            int minHeight = height[l] < height[r] ? height[l] : height[r];
            int vol = minHeight * (r - l);
            if (vol > maxVol) {
                maxVol = vol;
            }

            if ( height[l] == minHeight ) {
                l++;
            }

            else if ( height[r] == minHeight ) {
                r--;
            }

            else {
                l++;
                r--;
            }
        }

        return maxVol;
    }
}