package ex_11042024;

public class ternaryOperator {
    public static void main(String[] args) {

        int aa = true? 10 : 20;
        System.out.println(aa);

        int a1 = (20>50) ? 10 : 40;
        System.out.println(a1);

        String str = 10>20 ? "10" :"Twenty";
        System.out.println(str);


        //find max number using ternary operator

        int a=10;
        int b=40;

        int max = a>b? a :b;
        int min = b<a? b :a;

        System.out.println(max);
        System.out.println(min);


    }
}
