class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++)
        {
            if(i>=100)
            ans+=helper(i);
        }
        return ans;
    }
    public int helper(int a)
    {
        int ans=0;
        int prev=a%10;
        a/=10;
        int curr=a%10;
        a/=10;
        while(a>0)
        {
            int next=a%10;
            if((curr<prev && curr<next) || (curr>prev && curr>next))
               ans++;
            prev=curr;
            curr=next;
            a/=10;
        }
        return ans;
    }
}
