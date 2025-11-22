public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        // Create an array to store the result indices
        int[] result = new int[2];
        
        // Use nested loops to check all possible pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        // This should not happen according to the problem statement
        return result;
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: Input: nums = [2,7,11,15], target = 9");
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2: Input: nums = [3,2,4], target = 6");
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");
        
        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3: Input: nums = [3,3], target = 6");
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]");
    }
}