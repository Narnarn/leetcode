public class RomanToInt {
    // 罗马数字转数字
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        char pre = ' ';
        int res = 0;
        for (char cur : c) {
            switch (cur) {
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    res += 5;
                    if (pre == 'I') {
                        res -= 2;
                    }
                    break;
                case 'X':
                    res += 10;
                    if (pre == 'I') {
                        res -= 2;
                    }
                    break;
                case 'L':
                    res += 50;
                    if (pre == 'X') {
                        res -= 20;
                    }
                    break;
                case 'C':
                    res += 100;
                    if (pre == 'X') {
                        res -= 20;
                    }
                    break;
                case 'D':
                    res += 500;
                    if (pre == 'C') {
                        res -= 200;
                    }
                    break;
                case 'M':
                    res += 1000;
                    if (pre == 'C') {
                        res -= 200;
                    }
                    break;
            }
            pre = cur;
        }
        return res;
    }

}