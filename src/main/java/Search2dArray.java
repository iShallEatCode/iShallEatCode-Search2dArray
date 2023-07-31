public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){
        // This is a dang good challenge. 
        // To begin I will need to seach through rows and columns and compare each element to the target

        // Iterate through the rows
        for (int i = 0; i < nums.length; i++) {
            // Iterate through the columns of the current row
            for (int j = 0; j < nums[i].length; j++) {
                // Now target comparison
                if (nums[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
