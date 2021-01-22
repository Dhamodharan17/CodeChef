/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	
	for(int i=0;i<n;i++)
	{
	   	String number=input.next();
	   	String arr[]=number.split("");
	   	int sum=0;
	   	
	   	
	   	for(int j=0;j<arr.length;j++)
	   	{
	   	    sum+=Integer.parseInt(arr[j]);
	   	    //System.out.print((arr[j]));
	   	   // System.out.println(" ");
	   	   
	   	}
	   	 System.out.println(sum);
	}


	
	}
}
