class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        int i=0;
        while(i<nums.length)
        {
            if(ans%2==0 && nums[i]==1)
            {i++;
            continue;
            }
            else if(ans%2==0 && nums[i]==0)
            {
                while(i<nums.length && nums[i]==0)
                i++;
                ans++;

            }
            else if(ans%2==1 && nums[i]==0)
            {
                i++;
                continue;
            }
            else if(ans%2==1  && nums[i]==1)
            {
                while(i<nums.length &&nums[i]==1) i++;
                ans++;
            }

        }
        return ans;
    }
}