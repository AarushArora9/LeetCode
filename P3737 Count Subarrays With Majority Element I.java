class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int pos=n+1;
        int len=2*n+2;
        int freq[]=new int[len];
        int cumulative[]=new int[len];
        freq[pos]=1;
        cumulative[pos]=1;
        int count = 0;
        for(int num: nums)
        {
            int offset=(num==target)?1:-1;
            pos+=offset;
            freq[pos]++;
            cumulative[pos]=cumulative[pos-1]+freq[pos];
            count+=cumulative[pos-1];
        }
        return count;
    }
}
