import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store value -> index mapping
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            // Put the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // This should not happen according to the problem statement
        return new int[] {};
    }
    
    public static void main(String[] args) {
        TwoSumOptimized solution = new TwoSumOptimized();
        
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