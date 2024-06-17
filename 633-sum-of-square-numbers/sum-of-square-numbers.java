class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        while(i*i<=c)
        {
            long j=0;
            long k=c-(int)i*i;
            long d=k;
            
            while(j<=k)
            {
                if(j>k)
                return false;
                
                long mid=k-(k-j)/2;
                if((mid*mid)==d)
                {
                  
                    return true;
                }
                else if((mid*mid)<d)
                {
                    j=mid+1;
                }
                else
                {
                    k=mid-1;
                }
            }
            i++;
        }
        return false;
        
    }
}