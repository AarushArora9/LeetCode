class Solution {
    public long sumAndMultiply(int n) {
        long ans=0,sum=0,a=1;
        while(n!=0)
        {
            int r=n%10;
            if(r!=0){
            ans=r*a+ans;
            a=a*10;
            sum+=r;
            }
            n=n/10;
        }
        return ans*sum;
    }
}
