package ex_11042024;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no 1 ");
        int n1= sc.nextInt();
        System.out.println("Enter no 2 ");
        int n2= sc.nextInt();

        int sum= sumoftwo(n1,n2);
        System.out.println(sum);
        int sub=suboftwo(n1,n2);
        System.out.println(sub);
        int mul= muloftwo(n1,n2);
        System.out.println(mul);
        int div= divoftwo(n1,n2);
        System.out.println(div);


    }

    static int divoftwo(int n1, int n2) {
        if(n2==0){
            return 0;
        }
        else {
           return n1/n2;
        }
    }

    static int muloftwo(int n1, int n2) {
        return n1*n2;
    }

    static int suboftwo(int n1, int n2) {
        return n1-n2;
    }

    static int sumoftwo(int n1, int n2) {

        return n1+n2;
    }

}

