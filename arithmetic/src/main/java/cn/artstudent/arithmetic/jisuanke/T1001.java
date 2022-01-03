package cn.artstudent.arithmetic.jisuanke;

import java.util.Scanner;

/**
 * @Author : zhq
 * @Time : 2021/7/2 16:29
 * @Description : 你需要写一个程序，实现从标准输入中输入两个整数 AA 和 BB，然后把 A + BA+B 的结果输出到标准输出。
 */
public class T1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        System.out.println(A + B);
    }
}
