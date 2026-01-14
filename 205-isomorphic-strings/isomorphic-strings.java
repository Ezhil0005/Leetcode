class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        HashMap<Character,Character>map1=new HashMap<>();
      HashMap<Character,Character>map2=new HashMap<>();
      for(int i=0;i<s1.length();i++)
      {
          char a=s1.charAt(i);
           char b=s2.charAt(i);
           if(map1.containsKey(a))
           {
               if(map1.get(a)!=b)
               return false;
           }
           else
           {
               map1.put(a,b);
           }
           if(map2.containsKey(b))
           {
               if(map2.get(b)!=a)
               return false;
           }
           else
           {
               map2.put(b,a);
           }
          
      }
     
       
       return true; 
    }
}