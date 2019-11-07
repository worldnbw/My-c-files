/*Laura McCallum***************Section 3125**********************Date: 2/24/04*/

import javax.swing.*;

public class Big 
{
   public static void main (String [] arg)
   {  
   String first = JOptionPane.showInputDialog("Enter first string: " );  //string one
   String second = JOptionPane.showInputDialog("Enter second number:");  //string two
   char[] num1 = new char [first.length()];										
   char[] num2 = new char [second.length()];
   int [] n1 = new int [num1.length];
   int [] n2 = new int [num2.length];
   int[] ans = new int [n1.length + n2.length];
   num1 = numval(first);															// 1st funtion call
   num2 = numval(second);	      												// 2nd funtion call
   n1 = array(num1); 																// string to int array	
   n2 = array(num2);																
   flip (num1);
   flip (num2);																		//flip function
   ans = add(n1, n2);
   out (ans);
   System.exit(0);
   }

public static char[] numval(String s)
{
    char [] a = new char [s.length()];  
    int i=0, j=0;
    for (i=0,j=0; i<= s.length()-1; i++,j++)
	{
        
	}
	System.out.println("First function complete");
    return (a);
}
public static int[] copy2int(char[] a, char[] b)
{
	
}
public static void flip(char [] a)
{
	char[] b=new char[a.length];
	
	for (int i=0, j=a.length-1; i<b.length; i++,j--)
	{
		b[i]=a[j];
	}
	for (int i=0; i<a.length; i++)
	{
        System.out.println(i +  ":" + a[i]);
        
	}
	System.out.println("Next function complete");
}

public static int [] array(char []a)
{
	if ((s.charAt(j)>='0') &&( s.charAt(j)<='9'))
		{
            a[i] =( s.charAt(j));
		}
		else
		{
		System.out.println("Error!");
		
		}int [] b = new int [a.length];
	for (int i=0; i <a.length; i++)
	{
		b[i] = (a[i] -'0');
	}
	System.out.println("Third function complete");
	return (b);
}	

public static int []  add(int [] n1, int [] n2)
{	
	int [] c = new int [n1.length + n2.length];
	for (int i=0; i<c.length; i++)		
	{
		int temp=0;
		temp += n1[i]+ n2[i];
	    if (temp>9)
		   {
		      c[i+1] += temp/10*1;
		      c[i] += temp % 10;
	      }
	    else
	      {
	      	c[i]=n1[i]+n2[i];
	      }
	}
	System.out.println("Add function complete");
	return (c);
}

public static void out(int [] ans)
{
	for (int i=0,j=ans.length-1; i<ans.length; i++,j--)
	{
		System.out.println("the answer is"+ ans[j]);
	}
}
}