import java.util.Scanner;

class MinMax
{
    public static void main(String args[])
    {
        System.out.println("enter the MAX value:");
        Scanner sc=new Scanner(System.in);
        double max=sc.nextInt();
        System.out.println("enter the MIN value:");
        double min=sc.nextInt(); 
        System.out.println("enter the newMAX value:");
        double newmax=sc.nextDouble();
        System.out.println("enter the newMIN value:");
        double newmin=sc.nextDouble();
        System.out.println("enter the required value:");
         double req=sc.nextDouble();
        double v=((req-min)*(newmax-newmin)/(max-min)+newmin);
        System.out.print("normalize value:"+v);
    }
}