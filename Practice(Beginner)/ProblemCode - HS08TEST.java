/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
 
     
	public static void main (String[] args) throws java.lang.Exception
	{
	    DecimalFormat df = new DecimalFormat("0.00"); 
	    Scanner input= new Scanner(System.in);    

         long windramAmount=input.nextLong();
        double initialBalance =input.nextFloat();

	   if(windramAmount+0.50>initialBalance)
         {
         System.out.print(df.format(initialBalance));
            }else
       if(windramAmount%5==0)
    {
        initialBalance=(initialBalance-windramAmount)-0.50;
        System.out.print(df.format(initialBalance));
    }
    else if(windramAmount%5!=0)
    {
        System.out.print(df.format(initialBalance));
    }
	     

	}
}
