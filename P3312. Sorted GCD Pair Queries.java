class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max=0;
        for(int i:nums)
        max=Math.max(i,max);
        long freq[]=new long[max+1];
        for(int i:nums)
        freq[i]++;
        for(int i=1;i<=max;i++)
        {
            for(int j=i*2;j<=max;j+=i)
            freq[i]+=freq[j];
        }
        for(int i=0;i<=max;i++)
        freq[i]=freq[i]*(freq[i]-1)/2;
        for(int i=max;i>=1;i--)
        {
            for(int j=i*2;j<=max;j+=i)
            freq[i]-=freq[j];
        }
        for(int i=1;i<=max;i++)
        freq[i]+=freq[i-1];
        int n=queries.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            long q=queries[i]+1;
            int left=1,right=max;
            while(left<right)
            {
                int mid=(right+left)/2;
                if(freq[mid]>=q)
                right=mid;
                else
                left=mid+1;
            }
            ans[i]=left;
        }
        return ans;
    }
}
