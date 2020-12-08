public class RemoveElement {
    /*
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/remove-element
     */
    public static int removeElement(int[] nums, int val) {
        // 想法1：将数组排序后，二分搜索val，记录起始和结束的位置，与最后的数字调换位置
        // 想法2：遍历数组，发现等于val的数就和最后的数字调换
        /*
         * 注意： 最后的数字仍有可能是目标数字，所以也需要进行判断 所以对数组遍历时，发现目标数字后，完成调换等操作后，将i减去1
         */
        int valSize = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (i == size - valSize) {
                break;
            }
            if (nums[i] == val) {
                int tmp = nums[size - 1 - valSize];
                nums[size - 1 - valSize] = nums[i];
                nums[i] = tmp;
                valSize += 1;
                i -= 1;
            }

        }
        return size - valSize;

    }

    public static void main(String args[]) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println(removeElement(arr, 2));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}