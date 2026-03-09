class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int len=target.length;
        // if(len==n)
        // {
        //     for(int i=0;i<n;i++)
        //     {
        //         list.add("Push");
        //     }
        // }
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int j=0;
        for(int k=0;k<n;k++)
        {
            if(arr[k]==target[j])
            {
            list.add("Push");
            j++;
            }
            else
            {
                list.add("Push");
                list.add("Pop");
               
            }
            if(j==len) break;
            
        }
        return list;
    }
}