class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int b=0;
        for(int i=0;i<sentences.length;i++)
        {
            b=0;
            for(char a:sentences[i].toCharArray())
        {
            if(a==' ')
            {
                b++;
            }
            if(max<b)
            max=b;
        }
        }
       
        return max+1;
    }
}