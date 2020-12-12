public class realizeStr {
    /*
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置
     * (从0开始)。如果不存在，则返回  -1。 当 needle 是空字符串时我们应当返回 0 。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/implement-strstr
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static int strStr(String haystack, String needle) {
        if (needle == "") {
            return 0;
        }
        int startNum = 0;
        int firstPos = -1;
        // 想法：先遍历这个haystack字符串找到和needle第一个char相同的char的位置，找到一个就中断一次进行判断
        // 如果不对的话就继续那次遍历
        char[] chay = haystack.toCharArray();
        char[] cnee = needle.toCharArray();
        int i, j;
        while (true) {
            for (i = startNum; i < chay.length; i++) {
                if (chay[i] == cnee[0]) {
                    firstPos = i;
                    startNum = i + 1;
                    break;
                }
            }
            if (i == chay.length) {
                return -1;
            }
            if (firstPos >= 0) {
                for (j = 0; j < cnee.length; j++) {
                    if (cnee[j] != chay[firstPos + j]) {
                        break;
                    }
                }
                if (j == cnee.length) {
                    return firstPos;
                }
            }
        }

    }
}