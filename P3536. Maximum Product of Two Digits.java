class Solution {
    public int maxProduct(int n) {
        int p=0,l=0;
        while(n>0)
        {
            int r=n%10;
            if(r>p)
            {
                l=p;
                p=r;
            }
            else if(r>l)
            l=r;
            n/=10;
        }
        return p*l;
    }
}
