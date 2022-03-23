import java.util.*;
import java.io.*;
import java.lang.*;
class Zscore
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of values:");
        int n=sc.nextInt();
        double v[]=new double[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++)
        v[i]=sc.nextDouble();
        double sum=0;
        double mean,d=0.0,sd;
        for(int i=0;i<n;i++)
        sum=sum+v[i];
        mean=sum/n;
        System.out.println("Mean of given values is:"+mean);
        for(int i=0;i<n;i++)
        d+=Math.pow(v[i]-mean,2);
        sd=Math.sqrt(d/n);
        System.out.println("Standard Deviation is:"+sd);
        System.out.println("Enter the required value:");
        double val=sc.nextDouble();
        double vl=(val-mean)/sd;
        System.out.println("Z-score Normalized value is:"+vl);
    }
}