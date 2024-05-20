class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int i=0,j,k=0;
        int len = nums.length;
        for(j=0;j<len;j++)
        {
            if(nums[j]==val)
            continue;

            nums[i]=nums[j];
            i++;
            k++;
        }
        return k;

    }
}