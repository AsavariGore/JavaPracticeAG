package ex_11042024;

public class ArrayTranspose {

    public static void main(String[] args) {
        int arr[][]={
                {1,44,52}, //00 01 02  //00 10 20
                {65,21,99},//10 11 12  //01 11 21
                {98,36,28}//20 21 22   //02 12 22
        };

        int newarr[][]= new int[arr.length][arr.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                newarr[i][j]=arr[j][i];
            }
        }

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
