package com.grissom;

/**
 * describe
 *
 * @author Grissom
 * @since 2021/08/24
 */
public class P21_转义字符 {
    public static void main(String[] args) {
        // 制表符 \t
        System.out.println("北京\t天津\t上海");
        // 换行符 \n
        System.out.println("Jack\nRose");
        // 输出反斜杠
        System.out.println("\\");
        System.out.println("\\\\");
        // 输出引号
        System.out.println("\"");
        System.out.println(" ' ");


        /* 小练习 输出如下样式
        书名	价格	数量
        西游记	100		12
        * */
        System.out.println("书名\t\t价格\t\t数量\n西游记\t100\t\t12");
    }
}
