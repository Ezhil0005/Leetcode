class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        char res[]=address.toCharArray();
        for(int i=0;i<address.length();i++)
        {
            if(res[i]=='.')
            sb.append("[.]");
            else
            sb.append(res[i]);
        }
        return sb.toString();
    }

}