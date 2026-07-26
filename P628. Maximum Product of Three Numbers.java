class Solution {
    public int maximumProduct(int[] nums) {
        int a=-1001,b=a,c=b;
        int x=1001,y=x;
        for(int i: nums)
        {
            int pa=a,pb=b,px=x;
            a=Math.max(a,i);
            b=Math.max(b,Math.min(pa,i));
            c=Math.max(c,Math.min(pb,i));
            x=Math.min(x,i);
            y=Math.min(y,Math.max(px,i));
        }
        return Math.max(a*b*c,a*x*y);
    }
}
