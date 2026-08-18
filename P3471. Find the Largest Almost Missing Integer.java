class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n)
        {
            int max=nums[0];
            for(int i: nums)
            max=Math.max(i,max);
            return max;
        }
        int count[]=new int[51];
        for(int i:nums)
        count[i]++;
        if(k==1)
        {
            for(int i=50;i>=0;i--)
            {
                if(count[i]==1)
                return i;
            }
        }
        int res=-1;
        if(count[nums[0]]==1)
        res=Math.max(res,nums[0]);
        if(count[nums[n-1]]==1)
        res=Math.max(res,nums[n-1]);    
        return res;    
    }
}
