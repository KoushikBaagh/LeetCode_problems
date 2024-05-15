class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int len = nums.length;
        int i=0,j, k=1;
        //ArrayList <Integer> expectedNums=new ArrayList<>();
        //int [] expectedNums = new int[len];
            for(j=1;j<len;j++)
            {
                if(nums[i] == nums[j])
                    continue;

                nums[i+1]=nums[j];
                k++;
                i++;

            }
        return k;
    }
}


