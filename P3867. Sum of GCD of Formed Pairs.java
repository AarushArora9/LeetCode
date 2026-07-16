class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length,a=0,b=n-1;
        int mx[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            mx[i]=gcd(max,nums[i]);
        }
        Arrays.sort(mx);
        long ans=0;
        while(a<b)
        ans+=gcd(mx[a++],mx[b--]);
        return ans;
    }
    public static int gcd (int a,int b)
    {
       while(b!=0)
       {
        int t=b;
        b=a%b;
        a=t;
       }
       return a;
    }
}
