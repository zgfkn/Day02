package eg01;

/**
 * 算术四则运算
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        //一般情况
        int a = 4, b = 100;
        System.out.println(a + b);
        //溢出问题
        a = Integer.MAX_VALUE;
        b = 1;
        System.out.println(a + b);//溢出不报错

        //解决溢出问题,采用更大范围表示
        long l = a + b;//两个int型结果还是int,要把结果变为long型
        System.out.println(l);
        long l1 = a + (long) b;
        System.out.println(l1);
        //整除
        a = 9;
        b = 2;
        System.out.println(a / b);
        double d = (double) a / b;
        System.out.println(d);
        //byte short char在运算中会自动转换为int
        byte b1 = 5;
        short s1 = 2;
        //short s2=b1+s1;//出现错误,结果为int
        int i1 = b1 + s1;
        System.out.println(i1);
        byte b2 = 3 + 100;//3和100都为int,但结果没超过byte的表示范围,就允许赋值
    }
}
