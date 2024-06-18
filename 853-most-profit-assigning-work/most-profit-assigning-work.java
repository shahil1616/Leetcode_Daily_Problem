class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int arr[][]= new int[profit.length][2];
        for(int i=0;i<profit.length;i++)
        {
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
         for(int i=1;i<arr.length;i++)
         {
            arr[i][1]=Math.max(arr[i][1],arr[i-1][1]);
         }
         int ans=0;
         for(int i=0;i<worker.length;i++)
         {
             int bs=binarysearch(arr,worker[i]);
            //  if(i==0)
            //  System.out.println(bs);
             if(bs!=-1)
             ans=ans+bs;
         }
         return ans;

        
    }
    public int binarysearch(int arr[][],int t)
    {
        int i=0;
        int j=arr.length-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=j-(j-i)/2;
            if(arr[mid][0]<=t)
            {
                ans=Math.max(ans,arr[mid][1]);
                
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        // System.out.println(ans);
        return ans;
    }
}