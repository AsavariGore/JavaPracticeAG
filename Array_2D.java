package ex_11042024;

public class Array_2D {


    public static void main(String[] args) {

        int array_2D[][]={

                {1,44,10},
                {10,30,50},

        };

        for(int i=0;i< array_2D.length;i++)
        {
            for(int j=0;j< array_2D[i].length;j++)
            {
                System.out.println(array_2D[i][j]);
            }
        }


        int array_2D2[][]={

                {1,44},
                {10,30},
                {70,90}

        };
        System.out.println("****** ");
        for(int i=0;i< array_2D2.length;i++)
        {
            for(int j=0;j< array_2D2[i].length;j++)
            {

                System.out.println(array_2D2[i][j]);
            }
        }


    }
}
