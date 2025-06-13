class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int l = prices.length;
        int low = prices[0];
        for(int i = 1; i<l ; i++)
        {   int newPr = prices[i];
            if(low>newPr)
            {
                low=newPr;
            }
            else if(low <= newPr && diff < (newPr - low))
            {
                diff = newPr - low;
            }
        }
        return diff;
    }
}
