class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        /* Bruteforce approach
        for(int i=0;i<n;i++)
        {
            for(int j=i+1; j<n;j++)
            {
                if(nums[i]== nums[j] && Math.abs(i-j)<=k)
                {
                    return true;
                }
            }
        }
        return false;*/
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(h.containsKey(nums[i]) && i- h.get(nums[i]) <= k)
            {
                return true;
            }
            h.put(nums[i], i);
        }
        return false;
    }
}
