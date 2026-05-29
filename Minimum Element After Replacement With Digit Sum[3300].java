class Solution {
    public int minElement(int[] nums) {
        int min=100;
        for(int a:  nums)
        {
            int s=0;
            while(a>0)
            {
                int r=a%10;
                s+=r;
                a/=10;
            }
            if(s<min)
                min = s;
        }
        return min;
    }
}
