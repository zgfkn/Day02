package eg01;

public class ArithmeticDemo {
    public static void main(String[] args) {
        //一般情况
        int a=4,b=100;
        System.out.println(a+b);
        //溢出问题
        a=Integer.MAX_VALUE;
        b=1;
        System.out.println(a+b);
    }
}
