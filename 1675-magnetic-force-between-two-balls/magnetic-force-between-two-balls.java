class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        long i=0;
        long j=position[position.length-1]-position[0];
        long ans=0; 
        while(i<=j)
        {
          long mid=j-(j-i)/2;
          if(helper(position ,mid,m)==true)
          { 
            ans=(int)mid;
            // System.out.println(mid);
            i=mid+1;

          }
          else
          {
            j=mid-1;
          }


        }
       return (int)ans;
        
    }
    public boolean helper(int arr[],long mid,int m)
    {
        int prev=arr[0];
        m--;
        for(int i=1;i<arr.length;i++)
        {
            if(Math.abs(prev-arr[i])>=mid)
            {
                prev=arr[i];
                m--;
            }
            if(m==0)
            return true;
        }
  
        return false;
    }
}