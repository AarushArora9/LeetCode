class Solution {
    public long countCommas(long n) {
        long i=1000,res=0;
        while(i<=n)
        {
            res+=n-i+1;
            i*=1000;
        }
        return res;
    }
}
