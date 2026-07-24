class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2)
        return n;
        int msb=0;
        int temp=n;
        while(temp>0)
        {
            msb++;
            temp=temp/2;
        }
        return 1<<msb;
    }
}
