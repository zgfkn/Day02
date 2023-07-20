package eg01;

/**
 * 运算符介绍
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //运算符的优先级
        int a = 2 + 2 / 2 + 3 * 5 + 4;
        System.out.println(a);
        //优先级相同,从左到右依次计算,有括号先算括号里面的
    }
}
