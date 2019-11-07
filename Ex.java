import javax.swing.*;

public class Ex{
public static void main( String[] arg ){
    int n;
    try{
        n = getNum();
        if(  n % 2 != 0  ){
            throw new NotDiv2Exception( n );
        }
        if(  n % 3 != 0  ){
           throw new NotDiv3Exception( n );
        }
    }catch(  NotDiv2Exception e  ){
        System.out.println( "Blah " + e );
    }catch(  NotDiv3Exception e  ){
        System.out.println( "Flip " + e );
    }catch(  NumberFormatException e  ){
        System.out.println( "What " + e );
    }catch(  Exception e  ){
        System.out.println( "Gribbix " + e );
    }   //  try
    System.exit( 0 );
}   //  main
public static int getNum()
    throws NumberFormatException, Exception{
    String s = JOptionPane.showInputDialog("");
    if(  s == null  ){
        throw new Exception( "No input" );
    }   //  if
    return  Integer.parseInt( s );
}   //  getNum
}   //  class Ex

class NotDiv2Exception extends Exception{
private int myValue;
public NotDiv2Exception( int value ){
    myValue = value;
}
public String toString(){
    return
        super.toString() + "<" + myValue + ">";
}   //  toString
}   //  NotDiv2Exception extends Exception

class NotDiv3Exception extends Exception{
private int myValue;
public NotDiv3Exception( int value ){
    myValue = value;
}
public String toString(){
    return
        super.toString() + "<" + myValue + ">";
}   //  toString
}   //  NotDiv3Exception extends Exception




