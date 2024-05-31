class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
	    if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
    //System.out.println(digits);
}

    // digits = new int[digits.length + 1];
    // //System.out.println(digits);
    // digits[0] = 1;
    // return digits;
    int[] newDigits = Arrays.copyOf(digits, digits.length + 1);
    newDigits[0] = 1;
    return newDigits;
    /*In this approach, Arrays.copyOf is used to create a new array with a length that is one greater than the original digits array. 
    This method automatically copies the elements from the original array to the new array. 
    If the new array is larger, the extra elements are initialized to 0 (for int arrays),
    so you only need to set the first element to 1. 
    This is a clean and concise way to handle the array expansion and initialization.*/     
    }
}