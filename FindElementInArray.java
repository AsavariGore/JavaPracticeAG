package ex_11042024;

import java.util.Scanner;

public class FindElementInArray {

    public static boolean main(String[] args) {

        int arr[][] = {

                {3, 8, 9},
                {15, 77, 23},
                {43, 5, 69}
        };


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element to find :");
        int input = sc.nextInt();

        // boolean check;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == input) {
                    return true;
                    // break;

                }
            }
        }
        return false;
    }
}