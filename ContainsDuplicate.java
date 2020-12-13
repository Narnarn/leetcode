import java.util.List;

public class ContainsDuplicate {
    /*
     * 给定一个整数数组，判断是否存在重复元素。
     * 
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     */
    public static boolean containsDuplicate(int[] nums) {
        /*
         * 用arraylist超时了 
         * List<Integer> list = new ArrayList<>(); 
         * for (int i : nums) { 
         * if (!list.contains(i)) { list.add(i); } 
         * else { return true; } } 
         * return false;
         */

        // 哈希表
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;

        // 排序后检查相邻元素
        /*
         * Arrays.sort(nums); 
         * int n = nums.length; 
         * for (int i = 0; i < n - 1; i++) { 
         *     if (nums[i] == nums[i + 1]) { 
         *         return true; 
         *     } 
         * } 
         * return false;
         */

    }

}