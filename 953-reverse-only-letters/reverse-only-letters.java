class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        String temp=s;
        int n=s.length();
        int k=0;
        for(int i=n-1;i>=0;i--)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                if((temp.charAt(k)>='a'&& temp.charAt(k)<='z')||(temp.charAt(k)>='A'&&temp.charAt(k)<='Z'))
                {
                    sb.append(s.charAt(i));
                }
                else
                {
                    sb.append(temp.charAt(k));
                    i++;
                }
                k++;
            }
           

        }
        while(k<n)
        {
        sb.append(temp.charAt(k));
        k++;
        }

        return sb.toString();

    }
}