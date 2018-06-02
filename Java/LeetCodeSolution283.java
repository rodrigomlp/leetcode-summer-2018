
public class LeetCodeSolution283 {
    public void moveZeroes(int[] nums) {
        // null / empty check
        if (nums == null || nums.length < 1) { return; }
        // find the zeros
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)  {
                int leftOffAt = i;
                // find next non 0
                for (int j = leftOffAt + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
    }
    // swaps nums
    public void swap(int[] array, int index1, int index2) {
        int num = array[index1];
        array[index1] = array[index2];
        array[index2] = num;
    } 

    public static void main(String[] args) { }
}