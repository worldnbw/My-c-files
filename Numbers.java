 // Fredy Antoun
 // Section # 3125
 // HW 1B
 // Date 2/17/04

 import javax.swing.*;
 import java.util.*;

 public class Numbers
 {
 public static void main(String [] arg)
 {

 int [] num= new int[10];
 for (int i =0; i <num.length; i++) 
 {
 num[i] =Integer.parseInt(JOptionPane.showInputDialog (" Enter Your integer:"));

 System.out.println(i + ": " + num[i]);
 if (num [i] == 0)
 break;
 }
 System.out.println("");
 Arrays.sort(num);
 for (int n=0; n <num.length; n++)
 {
 if (num[n] == 0)
 continue;
 System.out.println(num[n]);
 }
 System.exit(0);                
 }
 }
