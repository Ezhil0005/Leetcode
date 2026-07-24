class Solution {
    public boolean detectCapitalUse(String word) {
        boolean lflag=false;
        boolean uflag=false;
        boolean fflag=false;
        int count=0;
        if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
        fflag=true;
        if(word.length()==1) return true;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)>='a' && word.charAt(i)<='z')
            {
            lflag=true;
            count++;
            }
            else 
            uflag=true;
        }
        if(lflag && uflag || !fflag && uflag)
        return false;
        else if(count==word.length()-1 && fflag   ||  uflag&&!lflag || lflag&&!uflag)
        return true;

        return false;
    }
}