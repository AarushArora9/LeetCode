class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return gcd(min,max);
    }
    int gcd(int a,int b)
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
