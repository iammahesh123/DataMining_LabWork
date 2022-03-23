import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
class Correlation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double corr,sxy=0,sxx=0,syy=0,meanx=0,meany=0;
System.out.println("Enter the no of values:");
int n=sc.nextInt();
double x[]=new double[n];
double y[]=new double[n];
System.out.println("Enter x values:");
for(int i=0;i<n;i++)
x[i]=sc.nextDouble();
System.out.println("Enter y value");
for(int i=0;i<n;i++)
y[i]=sc.nextDouble();
for(int i=0;i<n;i++){
meanx+=x[i];
meany+=y[i];
}
meanx=meanx/n;
meany=meany/n;
System.out.println("Meanx="+meanx+"\nmeany="+meany);
for(int i=0;i<n;i++)
sxy=sxy+((x[i]-meanx)*(y[i]-meany));
sxy=sxy/(n-1);
for(int i=0;i<n;i++){
sxx=sxx+((x[i]-meanx)*(x[i]-meanx));
syy=syy+((y[i]-meany)*(y[i]-meany));
}
sxx=sxx/n;
syy=syy/n;
System.out.println("sxx="+sxx+"\nSyy="+syy);
}
}