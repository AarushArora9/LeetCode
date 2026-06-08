class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        System.gc();
        int l=nums.length;
        int ans[]=new int[l];
        int front=0,rear=l-1;
        for(int i=0,j=l-1;i<l;i++,j--)
        {
            if(nums[i]<pivot)
            ans[front++]=nums[i];
            if(nums[j]>pivot)
            ans[rear--]=nums[j];
        }
        while(front<=rear)
        ans[front++]=pivot;
        return ans;
    }
}
