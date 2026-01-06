class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int res[]=new int[a+b];
        int k=0;
        for(int i=0;i<a;i++)
        {
            res[k]=nums1[i];
            k++;
        }
        
        for(int j=0;j<b;j++)
        {
            res[k]=nums2[j];
            k++;
        }
        Arrays.sort(res);
       
        if(res.length%2==0)
        {
            int mid=res.length/2;
            int sum=res[mid]+res[mid-1];
           double d=(float)sum/2;
        return d;
        }
        else
        return res[res.length/2];


    }
}