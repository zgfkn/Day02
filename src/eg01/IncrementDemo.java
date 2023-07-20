package eg01;

/**
 * 自增自减运算
 */
public class IncrementDemo {
    public static void main(String[] args) {
        int i=1;
        System.out.println(i++);//先取值,再自增
        System.out.println(i);
        System.out.println(++i);//先自增,再取值

        int a=1;
        System.out.println(a--);//先取值,再自减
        System.out.println(a);
        System.out.println(--a);//先自减,再取值
    }
}
