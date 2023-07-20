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
    }
}
