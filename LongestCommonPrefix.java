public class LongestCommonPrefix {
    /*
     * 查找字符串数组中的最长公共前缀。
     * 
     * 如果不存在公共前缀，返回空字符串 ""。
     */

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (i > s.length() - 1 || s.charAt(i) != c) {
                    return printAns(strs, i);
                }
            }
        }
        return strs[0];
    }

    public static String printAns(String[] strs, int endIndex) {
        if (endIndex == 0) {
            return "";
        } else {
            return strs[0].substring(0, endIndex);
        }

    }

}