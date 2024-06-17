class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        while(i*i<=c)
        {
            long j=i;
            long k=(int)Math.sqrt(c);
            
            while(j<=k)
            {
                long mid=k-(k-j)/2;
                if((mid*mid+i*i)==c)
                {
                    return true;
                }
                else if((mid*mid+i*i)<c)
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