class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if ( !Character.isDigit(lChar) && !Character.isLetter(lChar) ) {
                l++;;
            }
            else if ( !Character.isDigit(rChar) && !Character.isLetter(rChar) ) {
                r--;
            }
            else {
                if ( Character.toUpperCase(lChar) != Character.toUpperCase(rChar)) {
                    return false;
                }
                else {
                    l++;
                    r--;
                }
            }
        }
        
        return true;
    }
}