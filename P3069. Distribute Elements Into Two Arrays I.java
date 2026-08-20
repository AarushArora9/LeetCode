class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int l=0,r=n-1;
        arr[l]=nums[0];
        arr[r]=nums[1];
        for(int i=2;i<n;i++)
        {
            if(arr[l]>arr[r])
            arr[++l]=nums[i];
            else
            arr[--r]=nums[i];
        }
        for(int i=r,j=n-1;i<j;i++,j--)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        return arr;
    }
}
