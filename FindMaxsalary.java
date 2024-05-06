package ex_11042024;

public class FindMaxsalary {
    public static void main(String[] args) {

        int []salary = {100,40,30,500,10,1000,300,200};

        int max_sal= Integer.MIN_VALUE;

        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max_sal)
            {
                max_sal=salary[i];
            }

        }

        System.out.println("Max salary is : "+max_sal);
        int j=0;
        int max_sal1=0;
        while(j<salary.length)
        {
            if(salary[j]>max_sal1) {
                max_sal1 = salary[j];
            }
            j++;
        }

        System.out.println("max salary is : "+max_sal1);

    }
}
