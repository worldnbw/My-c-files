/*Laura McCallum***************Section 3125*****************Date: 2/24/04*/

import javax.swing.*;

public class NumLarge 
{
   public static void main (String [] arg)
   {  
   String sone = JOptionPane.showInputDialog("Enter a number of any size: " ); 
 //string one
   
   String stwo = JOptionPane.showInputDialog("Enter a stwo number of equal size:");  //string two
   System.out.println("Both Strings entered");
      
  char[] s1 = new char [sone.length()];				//char array created								
  char[] s2 = new char [stwo.length()];	
  
  int [] num1=new int[s1.length];						//int array created
  int [] num2=new int[s2.length];
  
  s1 = numval(sone);				// 1st funtion call- moves string to an array
  s2 = numval(stwo);	      			// if valid numbers are found    
  System.out.println("Both String arrays created");
  
  toscreen(num1);
	toscreen(num2);										
    
   
   num1=turn(s1); 				// string to int array				                  
   num2=turn(s2);			
	System.out.println("Both String arrays turned to int arrays");	
	 
   
 int[] ans;
  
	if (num1.length > num2.length)
	    {
   	ans = new int [num1.length+1];
   }
   else if (num2.length > num1.length)
   {
   	ans= new int [num2.length+1];
   }
   else
   {
   	ans= new int [num2.length+1];
   }
   
   
   ans = addit(num1, num2);			//add nums together from back to front
   
   ans= reverse (ans);
   out (ans);					//print out answer
      
   System.exit(0);				//exit program
   }

public static char[] numval(String s)		//Function string to array
{
    char [] a = new char [s.length()];  
    int i=0;
for (i=0; i<s.length(); i++)
	{
        if ((s.charAt(i)>='0') &&( s.charAt(i)<='9'))
		{
            a[i] =s.charAt(i);
		}
		else
		{
		System.out.println("Error occurred!  Not a valid number");
		System.exit(0);
		}
	}
    return (a); }

public static int [] turn(char []a)			
{
	int [] b = new int [a.length];
	for (int i=0,j=a.length-1; i <a.length; i++,j--)
	{
		b[i] = (a[j] -'0');
	}
	System.out.println("Next function complete");
		
  return (b);
}	
public static int []  addit(int [] num1, int [] num2)
{	
	int d=((num1.length>num2.length) ? num1.length:num2.length)+1;
	int [] c=new int[d];
	for (int i=o; i<num1.length;i++)
	c[i]+=num1[i];
	
	for (int i=o; i<num2.length; i++)
	c[i]+=num2[i];
	
	for (int i=0; i<d-2; i++)
	{
		c[i+1]+=c[i]/10;
		c[i]%=10;
	}
	System.out.println("Addit function complete");
	return (c);
}
public static int[] reverse (int[]a)
{
	int[] b=new int[a.length];
	for (int i=0,j=a.length-1; i<a.length;i++,j--)
	{
		b[i]=a[j];	
	}
	return (b);
}



public static void out(int [] ans)	//Funtion to print answer reversd
{
	int length=ans.length;
	System.out.println("The answer is : ");
	for (int i=0; i<length; i++)
	{
		if(ans[ans.length]==0)
		continue;
		System.out.print (" " + ans[i]);
	}
}

public static void toscreen(int [] a)
{
for (int i=0; i<a.length; i++)
	{
        System.out.println(i +  ":" + a[i]);
        
        
	}
	System.out.prinln("to screen complete"); 
}
}