class Solution {
    public int minKBitFlips(int[] nums, int k) {
            int n = nums.length;
        int[] flip = new int[n];
        int ans = 0, flipCount = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flipCount ^= flip[i - k];
            }
            if (nums[i] == flipCount) {
                if (i + k > n) return -1;
                ans++;
                flipCount ^= 1;
                flip[i] = 1;
            }
        }

        return ans;
        
    }
}