class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max_cost=0;
        for(int i:costs)
        max_cost=Math.max(i,max_cost);
        int freq[]=new int[max_cost+1];
        for(int i:costs)
        freq[i]++;
        int count=0;
        for(int i=1;i<=max_cost;i++)
        {
            if(freq[i]==0)continue;
            int price=Math.min(freq[i],coins/i);
            count+=price;
            coins-=price*i;
            if(coins<i)break;
        }
        return count;
    }
}
