package ex_11042024;

public class double_arrayvalues {

    public static void main(String[] args) {

        int a1[]= {2,4,10,20};
        int a2 [] = new int[a1.length];
        for (int i=0;i<a1.length;i++)
        {
             a2[i]=a1[i]*2;
        }

        System.out.println("array is : ");
        for(int j=0;j<a2.length;j++)
        {
            System.out.println(a2[j]);
        }
    }
}
