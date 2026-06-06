class Solution {
    public int[] leftRightDifference(int[] nums) {
        System.gc();
        int l=nums.length;
        int lsum=0,rsum=0;
        for(int i:nums)
        rsum+=i;
        for(int i=0;i<l;i++)
        {
           int t=nums[i];
           rsum -=t;
           nums[i]=Math.abs(lsum-rsum);
           lsum+=t;
        }
        return nums;
    }
}
