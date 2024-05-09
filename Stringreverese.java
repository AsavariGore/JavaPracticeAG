package ex_11042024;

public class Stringreverese {

    public static void main(String[] args) {

        String a ="Asavai";

        stringrev(a);
    }

    private static void stringrev(String a) {

        String res ="";
        char ch;
        for(int i=0;i<a.length();i++)
        {
            ch= a.charAt(i);
            res=ch+res;
        }

        System.out.println(res);
    }
}
