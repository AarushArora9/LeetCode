class Solution {
    public int[] dailyTemperatures(int[] t) {
        int l=t.length;
        int arr[]=new int[l];
        int hottest=0;
        for(int i=l-1;i>=0;i--)
        {
            int curr=t[i];
            if(curr>=hottest)
            {hottest=curr;continue;}
            int days=1;
            while(t[i+days]<=curr)
              days+=arr[i+days];
              arr[i]=days;
        }
        return arr;
    }
}
