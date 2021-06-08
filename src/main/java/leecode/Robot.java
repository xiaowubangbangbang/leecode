package leecode;

import java.util.HashSet;
import java.util.Set;

public class Robot {

    public static void main(String[] args) {
        //[[10, 5], [1, 6], [6, 10], [3, 0], [0, 3], [0, 10], [6, 2]]
        boolean urr = robot("RUUR", new int[][]{{10, 5}, {1, 6}, {6, 10}, {3, 0}, {0, 3}, {0, 10}, {6, 2}}, 7856, 9033);
        System.out.println(urr);
    }

    public static boolean robot(String command, int[][] obstacles, int x, int y) {
        //多次循环 找到模式
        //学到了新的存储坐标的方法  左坐标左移30 | 右坐标
        int xx = 0, yy = 0;
        Set<Long> ss = new HashSet<>();
        ss.add(((long) xx << 30) | yy);
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'U') {
                yy++;
            } else {
                xx++;
            }
            ss.add(((long) xx << 30) | yy);
        }
        int cir = Math.min(x / xx, y / yy);
        if (!ss.contains(((long) (x - cir * xx) << 30) | (y - cir * yy))) {
            return false;
        }
        for (int[] s : obstacles) {
            if (s.length != 2) continue;
            int x1 = s[0];
            int y1 = s[1];
            if (x1 > x || y1 > y) continue;
            cir = Math.min(x1 / xx, y1 / yy);
            if (ss.contains(((long) (x1 - cir * xx) << 30) | (y1 - cir * yy))) {
                return false;
            }
        }
        return true;
    }
}