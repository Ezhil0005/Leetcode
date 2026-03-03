class Solution {
    public String reverseVowels(String s) {
        char [] arr=new char[s.length()];
        int i=0;
        for(char v:s.toCharArray())
        {
            if(v=='A'||v=='a'||v=='E'||v=='e'||v=='i'||v=='I'||v=='o'||v=='O'||v=='u'||v=='U')
            {
                arr[i]=v;
                i++;
            }
        }

        char res[]=s.toCharArray();
        int k=0;
        int j=i-1;
        for(char b:res)
        {
            if(b=='A'||b=='a'||b=='E'||b=='e'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U')
            {
                res[k]=arr[j];
                j--;
            }
            k++;
        }
        return new String(res);
    }
}