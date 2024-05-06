package ex_11042024;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {


        String input;

        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        input=sc.next();

        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();

        if(input.equalsIgnoreCase(rev))
        {
            System.out.println("String is pallindrome");
        }
        else {
            System.out.println("String is NOT pallindrome");
        }


    }
}
