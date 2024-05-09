package ex_11042024;

public class PrintdigonalElement {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 55, 66},
                {77, 33, 67},
                {87, 21, 11}
        };

        for (int i = 0; i <arr.length;i++) {
            for (int j = 0; j < arr.length; j++)
            {
                /*(if (arr[i][j]==arr[j][i])
                {
                    System.out.println(arr[i][j]);
                }*/
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                }

            }
        }
    }
}