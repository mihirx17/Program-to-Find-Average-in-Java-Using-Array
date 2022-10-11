import java.util.*;
public class Main {
    public static int  average_Array(int a[])
    {
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        int average=sum/a.length;
        return average;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your range of array---------------");
        int range_of_array_=sc.nextInt();
        Scanner sc1 =new Scanner(System.in);
        int array[]=new int[range_of_array_];
        for (int i=0;i<array.length;i++)
        {
            System.out.println("Enter your number---------");
            array[i]=sc1.nextInt();
        }
        System.out.print("your output is  ===== " + " " +average_Array( array));
    }
}