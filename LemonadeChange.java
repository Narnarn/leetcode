import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;

public class LemonadeChange {
    /*
     * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
     * 
     * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
     * 
     * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
     * 
     * 注意，一开始你手头没有任何零钱。
     * 
     * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
     * 
     * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/lemonade-change
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /*
     * bills是由5，10，20构成的数组
     * 接收10的时候需要1个5，接收20需要3个5或者1个10和1个5,考虑到5更重要，而10只被20需要，所以优先找10，5的组合
     */

    public static boolean lemonadeChange(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveNum++;
            } else if (bills[i] == 10) {
                if (fiveNum > 0) {
                    fiveNum--;
                    tenNum++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (fiveNum < 1) {
                    return false;
                } else if (tenNum > 0) {
                    fiveNum--;
                    tenNum--;
                } else if (fiveNum >= 3) {
                    fiveNum -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int[] bills = { 5, 5, 10, 10, 20 };
        System.out.println(lemonadeChange(bills));
    }
}