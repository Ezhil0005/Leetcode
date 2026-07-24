class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;

        while(left<right)
        {
            if(Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right)))
            {
                char c=sb.charAt(left);
                sb.setCharAt(left,sb.charAt(right));
                sb.setCharAt(right,c);
                left++;
                right--;
            }
            else if(!Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right)))
            {
                left++;
            }
            else if(Character.isLetter(sb.charAt(left)) && !Character.isLetter(sb.charAt(right)))
            {
            right--;
            }
            else
            {
                // char d=sb.charAt(left);
                // sb.setCharAt(left,sb.charAt(right));
                // sb.setCharAt(right,d);
                left++;
                right--;
                // right--;
                // left++;
            }
        }
        return sb.toString();
    }
}