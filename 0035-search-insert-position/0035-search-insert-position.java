class Solution {
    public int searchInsert(int[] nums, int target) 
    {
       int i,k=0;
       int len = nums.length;

       if (target<nums[0])
            k = 0;

        if (target > nums[len - 1]) 
        {
            k = len; // If target is greater than all elements, insert at the end
        }

       for (i=0;i<len-1;i++)
       {
        if(target>nums[i] && target<=nums[i+1])
        { k = i+1; }
        else if (target==nums[i])
        { k =  i; }
       } 
       return k;
    }
}

// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int len = nums.length;
//         if (target <= nums[0]) {
//             return 0; // Target is smaller than or equal to the first element
//         }
//         if (target > nums[len - 1]) {
//             return len; // Target is greater than all elements, insert at the end
//         }
//         for (int i = 0; i < len - 1; i++) {
//             if (target == nums[i]) {
//                 return i; // Target matches an element in the array
//             }
//             if (target > nums[i] && target < nums[i + 1]) {
//                 return i + 1; // Target should be inserted between nums[i] and nums[i+1]
//             }
//         }
//         return 1; // This line should not be reached if the array is properly sorted and the target exists
//     }
// }
