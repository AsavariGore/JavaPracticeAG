package ex_11042024;

public class swaptwonumbers {

    public static void main(String[] args) {

        int a= 66;
        int b=90;

        fnswaptwonumbers(a,b);
    }

    private static void fnswaptwonumbers(int a, int b) {

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
