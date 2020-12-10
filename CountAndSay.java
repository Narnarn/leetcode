public class CountAndSay {
    /*
     * 给定一个正整数 n ，输出外观数列的第 n 项。
     * 
     * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
     * 
     * 1 11 21 1211 111221 312211
     * 
     * 你可以将其视作是由递归公式定义的数字字符串序列：
     * 
     * countAndSay(1) = "1" countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/count-and-say
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static String countAndSay(int n) {
        if (n < 1) {
            return "error";
        } else if (n == 1) {
            return "1";
        } else if (n > 1) {
            return (descript(countAndSay(n - 1)));
        }
        return "I don't know";

    }

    /*
     * 此方法将问题用数字来解决，问题是字符串越来越长，结果会溢出，所以不行。 public static String descript(String s) {
     * char[] c = s.toCharArray(); // 将字符串传换为字符数组 char pre = c[0]; int num = 0; for
     * (char cur : c) { if (cur == pre) { num++; } else { num = (num * 10 + (pre -
     * '0')) * 10; pre = cur; num += 1; } } num = num * 10 + (pre - '0'); return
     * Integer.toString(num); }
     */
    public static String descript(String s) {
        char[] c = s.toCharArray(); // 将字符串传换为字符数组
        char pre = c[0];
        int num = 0;
        String ans = "";
        for (char cur : c) {
            if (cur == pre) {
                num++;
            } else {
                num = num * 10 + (pre - '0');
                ans += Integer.toString(num);
                pre = cur;
                num = 1;
            }
        }
        num = num * 10 + (pre - '0');
        ans += Integer.toString(num);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(descript("3322251")); // 3112
    }

}