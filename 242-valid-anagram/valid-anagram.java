class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        String a=Arrays.toString(arr);
        String b=Arrays.toString(brr); 
        if(a.equals(b))
        return true;
        return false;      
    }
}