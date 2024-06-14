class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1]){
                ans+=nums[i-1]+1-nums[i];
                nums[i]=nums[i-1]+1;
            }
            
        }
        return ans;
        
    }
}