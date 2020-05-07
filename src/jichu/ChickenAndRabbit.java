package jichu;

import java.util.Scanner;

public class ChickenAndRabbit {
    static int chicken, rabbit;

    public static int solution(int head, int foot) {
        int ans = 0;
        int j;
        for (int i = 0; i < head; i++) {
            j = head - i;
            if (2 * i + 4 * j == foot) {
                ans = 1;
                chicken = i;
                rabbit = j;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int head, foot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("鸡兔同笼问题穷举算法");
        System.out.print("请输入头数：");
        head = scanner.nextInt();
        System.out.print("请输入脚数：");
        foot = scanner.nextInt();
        int ans = solution(head, foot);
        if (ans == 1) {
            System.out.println("鸡有" + chicken + "只");
            System.out.println("兔有" + rabbit + "只");
        }
    }
}
