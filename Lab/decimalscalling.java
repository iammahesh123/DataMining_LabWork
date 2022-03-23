import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
class Decimalscalling{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter v value:");
double v=sc.nextDouble();
System.out.println("Enter j value");
int j=sc.nextInt();
double p=Math.pow(10,j);
double vl=(v/p);
System.out.println("The value of vl="+vl);
}
}
