class Solution {
    public Boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            sb.append(s.charAt(i));
        }
        String b=sb.toString();
        String m=sb.reverse().toString();
        if(m.equals(b))
        return true;
        return false;
    }
}