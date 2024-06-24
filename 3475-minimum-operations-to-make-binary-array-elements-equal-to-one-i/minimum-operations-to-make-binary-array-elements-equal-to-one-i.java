class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int i=0;
        while(i<nums.length)
        {
            if(i<nums.length-2 && nums[i]==0)
            {
                nums[i]=1;
                if(nums[i+1]==0)
                nums[i+1]=1;
                else
                nums[i+1]=0;
                if(nums[i+2]==0)
                nums[i+2]=1;
                else
                nums[i+2]=0;
                ans++;

            }
            i++;

        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            return -1;
        }
        return ans;
    }
}