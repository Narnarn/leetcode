import java.util.Stack;

public class IsValidBrackets {
    /*
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 
     * 有效字符串需满足：
     * 
     * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。
     * 
     * 注意空字符串可被认为是有效字符串。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static boolean isValid(String s) {
        if (s == "") {
            return true;
        }
        Stack<Char> stack = new Stack<Char>();
        char[] c = s.toCharArray();
        for (char cur : c) {
            if (cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char pop = stack.pop();
                if ((cur == ')' && pop != '(') || (cur == '}' && pop != '{') || (cur == ']' && pop != '[')) {
                    return false;
                }

            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }
}