package ex_11042024;

import java.util.Scanner;

public class FindElement2dArray {

    public static void main(String[] args) {

        int arr[][]={
                {3,55,12},
                {66,76,99},
                {0,77,34}
        };

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter element to find :");
        int input= sc.nextInt();
        boolean check=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==input)
                {

                    check = true;
                }

            }
        }





    }
}
