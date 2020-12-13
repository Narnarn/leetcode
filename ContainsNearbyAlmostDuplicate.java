public class ContainsNearbyAlmostDuplicate {
    /*
     * 在整数数组 nums 中，是否存在两个下标 i 和 j，
     * 
     * 使得 nums [i] 和 nums [j] 的差的绝对值小于等于 t ，
     * 
     * 且满足条件的 i 和 j 的差的绝对值也小于等于 k 。
     * 
     * 如果存在则返回 true，不存在返回 false。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/contains-duplicate-iii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        /* 延续相似题的做法，一个一个数判断，超时了。
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = -t; j <= t; j++) {
                if (set.contains((long) nums[i] + j)) {
                    return true;
                }
            }
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
        */
        
        // 用TreeSet的ceiling方法，减少搜索时间
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long possibleNum = set.ceiling((long) nums[i] - t);
            if (possibleNum != null && possibleNum <= (long) nums[i] + t) {
                return true;
            }
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i-k]);
            }
        }
        return false;

    }


}