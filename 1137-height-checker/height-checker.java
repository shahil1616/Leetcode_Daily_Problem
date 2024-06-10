class Solution {
    public int heightChecker(int[] arr ) {
        int count=0;
        int ans[]= new int[arr.length];
        for(int i =0;i<arr.length;i++)
        {
            ans[i]=arr[i];

        }
        Arrays.sort(ans);
        for(int i =0;i<arr.length;i++)
        {
            if(ans[i]!=arr[i])
            count++;
        }
        return count;
            
        
    }
}