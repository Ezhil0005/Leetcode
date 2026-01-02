class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        s=s.toLowerCase();
        for(char a:s.toCharArray())
        {

            if((a>='a'&&a<='z')||(a>='0'&&a<='9'))
            res+=a;
        }
        String fin="";
        for(int i=res.length()-1;i>=0;i--)
        {
            
            fin+=res.charAt(i);
        }
        if(res.equals(fin))
        return true;
        return false;
    }

}