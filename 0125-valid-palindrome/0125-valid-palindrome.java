class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end) {
            char curri=s.charAt(start);
            char currj=s.charAt(end);
            if(!Character.isLetterOrDigit(curri)) {
                start++;
            }else if(!Character.isLetterOrDigit(currj)) {
                end--;
            }else {
                if (Character.toLowerCase(curri) != Character.toLowerCase(currj)) {
        			return false;
        		}
                start++;
                end--;
            }
        }
        return true;
    }
}