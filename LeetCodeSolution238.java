
public class LeetCodeSolution238 {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length < 1) { return null; }
        
        int[] output = new int[nums.length];
        int product = 1;
        
        // get all numbers to the left
        for (int i = 0; i < nums.length; i++) {
            output[i] = product;
            product = product * nums[i]; // add current num to product
        }
        
        product = 1;
        // get everything to the right
        for (int i = nums.length - 1; i > -1; i--) {
            output[i] = output[i] * product;
            product = product * nums[i];
        }
        return output;
    }

    public static void main(String[] args) { }
}