// Fredy Antoun
// Section 3125
// Due Date 5/25/04

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shop extends JApplet {
	private Container myCont;
	private JPanel myP;
	private JPanel myP2;
	private JPanel myP3;
	private JLabel myLabel;
	private JButton myButton;
	private JButton myButton1;
	private JMenuBar myMenuBar;
	private JMenu myMenu;
	private JMenuItem myItem;
	private JMenuItem myItem1;
	private JTextField myText;
	private JComboBox myBox;
	private ButtonGroup myShippingGroup;
	private JRadioButton myFreeButton;
	private JRadioButton myExpressButton;
	private String [] myItems;
	private JCheckBox [] myItemsBox;

	public void init(){
	    myCont = getContentPane();
		myCont.setLayout(new BorderLayout());
	    myP =  new JPanel (new FlowLayout());
		myP2 = new JPanel (new FlowLayout());
		myP3 = new JPanel(new FlowLayout());
		myCont.add(myP, BorderLayout.NORTH);
		myCont.add(myP2, BorderLayout.CENTER);
		myButton = new JButton ("Bill");
		myButton1 = new JButton ("Calculate");
		myP2.add(myButton);
		myP2.add(myButton1);
		myButton.addActionListener(new ActionListener(){
			public void actionPerformed	(ActionEvent e){
				billCommand();
			} // actionperformed
		}); // myButton
		myButton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				calculateCommand();
			} // actionperformed
		}); // myButton1
		myMenuBar = new JMenuBar();
		setJMenuBar (myMenuBar);
		myMenu = new JMenu("Tools");
		myMenu.setMnemonic('T');
		myMenuBar.add(myMenu);
		myItem = new JMenuItem("Bill", 'B');
		myItem1 = new JMenuItem("Calculate", 'C');
		myMenu.add(myItem);
		myMenu.add(myItem1);
		myItem.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				billCommand();
			} // actionperformed
		}); // myItem
		myItem1.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				calculateCommand();
			} // actionperformed
		}); // myItem1
		myLabel = new JLabel ("Quantity");{
						myP.add(myLabel);
		}// myLabel
		myText = new JTextField (5);
		myText.setText("0");
		myP.add(myText);
		myBox = new JComboBox();
		myBox.addItem("Bed(s), 150$/E");
		myBox.addItem("Mattress, 200$/E");
		myBox.addItem("Stand(s), 50$/E");
		myBox.addItem("Desk(s), 250$/E");
		myBox.addItem("Chair(s), 45$/E");
		myBox.addItem("Pillow(s), 10$/E");
		myP.add(myBox);
		myShippingGroup = new ButtonGroup();
		myFreeButton = new JRadioButton("Free Shipping", true);
		myShippingGroup.add( myFreeButton);
		myP3.add( myFreeButton);
		myExpressButton = new JRadioButton("Express Shipping, $150", false);
		myShippingGroup.add( myExpressButton);
		myP3.add (myExpressButton);


		myItems = new String[]{
		 "Black", "White"};
		myItemsBox = new JCheckBox [myItems.length];
		for (int i = 0; i <myItems.length; i++){
			myItemsBox[i] = new JCheckBox (myItems[i]);
			myP3.add(myItemsBox[i]);
			myCont.add(myP3, BorderLayout.SOUTH);
		}
	} // init

	private void billCommand(){
		JOptionPane.showMessageDialog(null, "Your purchase of " + myText.getText() +  " " + myBox.getSelectedItem() + " has been recorded");
	} // billcommand

	private void calculateCommand(){
		if( myItemsBox[0].isSelected()  && myItemsBox[1].isSelected()) JOptionPane.showMessageDialog( null, "The color of your Furniture is Black & White" );

		else if( myItemsBox[0].isSelected()  ) JOptionPane.showMessageDialog( null, "The color of your Furniture is Black" );
		else if( myItemsBox[1].isSelected()  ) JOptionPane.showMessageDialog( null, "The color of your Furniture is White" );


		if (myBox.getSelectedItem() == "Bed(s), 150$/E")
		{
			 JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 150);
	 	}
	 	else if (myBox.getSelectedItem() == "Mattress, 200$/E")
	 	{
			JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 200);
	   	}
	  	else if (myBox.getSelectedItem() == "Stand(s), 50$/E")
	  	{
			JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 50);
		}
		else if (myBox.getSelectedItem() == "Desk(s), 250$/E")
		{
			JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 250);
		}
		else if (myBox.getSelectedItem() == "Chair(s), 45$/E")
		{
			JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 45);
		}
		else
		{
			JOptionPane.showMessageDialog (null, " your total is: " + Integer.parseInt(myText.getText()) * 10);
		}
	}// calculatecommand
}