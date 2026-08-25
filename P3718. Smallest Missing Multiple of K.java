class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=k;;i+=k)
        {
            boolean found=false;
            for(int j:nums)
            {
                if(j==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            return i;
        }
    }
}P
