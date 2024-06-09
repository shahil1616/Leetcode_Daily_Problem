class Solution {
    public int subarraysDivByK(int[] nums, int k) {
                HashMap<Integer,Integer> map= new HashMap<>();
        
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=(sum+nums[i])%k;
            if(sum<0)
            sum=sum+k;
            if(map.containsKey(sum))
            {
                // System.out.println(sum,ans);
                ans=ans+map.get(sum);
                    System.out.println(sum+" "+ans);
                map.put(sum,map.get(sum)+1);
            }
             else
            map.put(sum,map.getOrDefault(sum,0)+1);


        }
        return ans;

        
    }
}