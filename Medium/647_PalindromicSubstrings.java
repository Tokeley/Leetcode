class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for ( int i = 0; i < s.length(); i++){
            int l = i;
            int r = i;
            result++;

            // From single center, expand outwards
            while ( l > 0 && r < s.length() -  1) {
                l--;
                r++;
                if (s.charAt(l) == s.charAt(r)){
                    result++;
                } 
                else {
                    break;
                }
            }

            l = i;
            r = i;

            if (r < s.length() - 1) {
                // From double center, expand outwards
                if (s.charAt(l) == s.charAt(r + 1)){
                    r = r + 1;
                    result++;
                    while ( l > 0 && r < s.length() -  1) {
                        l--;
                        r++;
                        if (s.charAt(l) == s.charAt(r)){
                            result++;
                        } 
                        else {
                            break;
                        }
                    }
                }
                
            }

            
        }

        return result;
    }
}