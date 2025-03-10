class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int n= nums.length; // n=5
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0) //[1, 3, 12]
            {
                nums[l++] = nums[i]; //[1, 3, 12, 3, 12]
            }
        }
        for(int i=l; i<n;i++) // l=3
        {
            nums[i]=0; //[1, 3, 12, 0, 0]
        }
    }
}
