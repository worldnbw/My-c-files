// Fredy Antoun
// Section 3125
// Due June 1st.

import javax.swing.*;

public class Excp {
	public static void main (String [] arg)
	{
		int i;
		try{
			i = getNum();
			if (i == 0)
			{
				throw new CannotMakeTotal0Exception(i);
			}
		}catch (CannotMakeTotal0Exception e){
			System.out.println("You cannot multiply by 0 in this case " + e);
		}catch (Exception e){
			System.out.println("OOPS" + e);
		}
		System.exit(0);
	}
	public static  int getNum()
	throws NumberFormatException, Exception{
		String m = JOptionPane.showInputDialog("");
		if (m == null){
			throw new Exception (" You Haven't entered anything");
		}
		return Integer.parseInt(m);
	}
}
class CannotMakeTotal0Exception extends Exception{
	private int myTotal;
	public CannotMakeTotal0Exception(int total){
		myTotal = total;
	}
	public String toString(){
		return super.toString()+ "<" + myTotal + ">";
	}
}