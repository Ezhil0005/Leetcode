class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        boolean vow=false;
        boolean con=false;
        if(n<3)
        return false;
        for(char c:word.toCharArray())
        {
       if(!Character.isLetterOrDigit(c) )
        return false;
        if(Character.isLetter(c))
        {
            char cc=Character.toLowerCase(c);
            if("aeiou".indexOf(cc)!=-1)
            vow=true;
            else
            con=true;
        }
        }
        return vow&con;
    }
}