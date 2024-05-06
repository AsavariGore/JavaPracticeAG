package ex_11042024;

public class FindMax_2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {2,4,44},
                {33,20,55},
                {90,100,101}
        };


        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] >max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max no is "+max);



    }


}
