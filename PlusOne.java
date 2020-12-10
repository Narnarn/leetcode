public class PlusOne {
    /*
     * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     * 
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/plus-one
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;

            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        for (int j = 1; j < ans.length - 1; j++) {
            ans[j] = digits[j - 1];
        }
        return ans;

    }

}