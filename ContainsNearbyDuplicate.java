public class ContainsNearbyDuplicate {
    /*
     * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j， 使得 nums [i] = nums [j]，并且 i 和 j 的差的
     * 绝对值 至多为 k。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
    // 滑动窗口 时间复杂度 O(n·min(k,n)) 空间复杂度O(1)
    /*
    
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (nums[i] == nums[i + j]) {
                    return true;
                }
            }
        }
        return false;

    }
    */
    // 通过自平衡二叉搜索树来维护一个 k 大小的滑动窗口。 时间复杂度间复杂度：O(n·log(min(k,n)))
    // BST 中搜索，删除，插入都可以保持 O(logk) 的时间复杂度，其中 k 是 BST 中元素的个数。
    /*
    Set<Integer> set = new TreeSet<>();
    for (int i = 0; i < nums.length; i++){
        if (set.contains(nums[i])){
            set.add(nums[i]);
        }
        if (set.size() > k) {
            set.remove(nums[i - k]);
        }
    }
    return false;
    */

    // 散列表可以在常量时间内完成搜索删除和插入 时间复杂度 O(n)
    
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; ++i) {
        if (set.contains(nums[i])) return true;
        set.add(nums[i]);
        if (set.size() > k) {
            set.remove(nums[i - k]);
        }
    }
    return false;
}}
    


