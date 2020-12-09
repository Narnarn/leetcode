public class TwoSum {
    /*
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] ans = twoSum(arr, 9);
        System.out.print(ans[0] + " " + ans[1]);

    }
}