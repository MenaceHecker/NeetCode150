class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        String rev = ""; String forw = "";
        for(int i = l-1; i>=0 ; i--)
        {
            char asc = s.charAt(i);
            if(Character.isLetterOrDigit(asc))
            {
            rev = rev + s.charAt(i);
            }
            else
            {
                continue; 
            }
        }
        for(int j = 0; j<l ; j++)
        {
            char asc = s.charAt(j);
            if(Character.isLetterOrDigit(asc))
            {
                forw = forw + s.charAt(j);
            }
            else
            {
                continue;
            }
        }
        boolean isEqual = rev.equalsIgnoreCase(forw);
        return isEqual;
    }
}
