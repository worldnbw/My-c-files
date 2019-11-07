/***Laura McCallum************Section 3125**********Due Date 5/25/04***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cart extends JApplet {
	private String[] Clothes;
	private Double [] Prices;
	Clothes[0]="Shirts";
	Clothes[1]="Ties";
	Clothes[2]="Shoes";
	Clothes[3]="Socks";

	Prices[0]=20.00;
	Prices[1]=10.00;
	Prices[2]=30.00;
	Prices[3]=5.00;


	private Container myCP;
	private JPanel myPanel;
	private JLabel myLabel;
	private JLabel myCartLabel;
	private JButton myAddButton;
	private JButton myCalculateButton;
	private JButton myRemoveButton;
	private JMenuBar myMenuBar;
	private JMenu myMenu;
	private JMenuItem myBillItem;
	private JMenuItem myCalculateItem;
	private JMenuItem myAddItem;
	private JMenuItem myRemoveItem;
	private JTextField myText;
	private JComboBox myComboBox;
	private ButtonGroup myShippingGroup;
	private JRadioButton myFreeButton;
	private JRadioButton myExpressButton;
	private String [] myBillItems;
	private JCheckBox [] myCheckBox;
	private JTextArea myCart;
	private JScrollPane scrollPane;
	private int	myTotal =0;

	public void init(){
	    myCP = getContentPane();
		myCP.setLayout  (new BorderLayout());
	    	myPanel =  new JPanel (new FlowLayout());
		myCP.add(myPanel, BorderLayout.NORTH);
		myAddButton = new JButton ("Bill");
		myCalculateButton = new JButton ("Calculate");
		myCartLabel = new JLabel ("Shopping Cart");{
			myPanel.add(myCartLabel,BorderLayout.NORTH);
		} // myCartLabel
		myCart = new JTextArea (15,12);
		myCart.setLineWrap(true);
		scrollPane = new JScrollPane(myCart);
		myAddButton = new JButton ("Add Item");
		myRemoveButton = new JButton ("Remove  Item");
		myPanel.add(myAddButton);
		myPanel.add(myCalculateButton);
		myPanel.add(scrollPane, BorderLayout.CENTER);
		myPanel.add(myAddButton);
		myPanel.add(myRemoveButton);
		myAddButton.addActionListener(new ActionListener(){
			public void actionPerformed	(ActionEvent e){
				billCommand();
			} // actionperformed
		}); // myAddButton
		myCalculateButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				calculateCommand();
			} // actionperformed
		}); // myCalculateButton
		myAddButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				addCommand();
			} // actionperformed
		}); // myAddButton
		myRemoveButton.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				removeCommand();
			} // actionperformed
		}); // myRemoveButton
		myMenuBar = new JMenuBar();
		setJMenuBar (myMenuBar);
		myMenu = new JMenu("Tools");
		myMenu.setMnemonic('T');
		myMenuBar.add(myMenu);
		myBillItem = new JMenuItem("Bill", 'B');
		myCalculateItem = new JMenuItem("Calculate", 'C');
		myAddItem = new JMenuItem("Add Item", 'A');
		myRemoveItem = new JMenuItem("Remove Item", 'R');
		myMenu.add(myBillItem);
		myMenu.add(myCalculateItem);
		myMenu.add(myAddItem);
		myMenu.add(myRemoveItem);
		myBillItem.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				billCommand();
			} // actionperformed
		}); // myBillItem
		myCalculateItem.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				calculateCommand();
			} // actionperformed
		}); // myCalculateItem
		myAddItem.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				addCommand();
			} // actionperformed
		}); // myAddItem
		myRemoveItem.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent e){
				removeCommand();
			} // actionperformed
		}); // myRemoveItem
		myLabel = new JLabel ("Quantity");{
			myPanel.add(myLabel);
		}// myLabel
		myText = new JTextField (5);
		myText.setText("0");
		myPanel.add(myText);
		myComboBox = new JComboBox();
		myComboBox.addItem("Bed(s), 150$/E");
		myComboBox.addItem("Mattress, 200$/E");
		myComboBox.addItem("Stand(s), 50$/E");
		myComboBox.addItem("Desk(s), 250$/E");
		myComboBox.addItem("Chair(s), 45$/E");
		myComboBox.addItem("Pillow(s), 10$/E");
		myPanel.add(myComboBox);
		myShippingGroup = new ButtonGroup();
		myFreeButton = new JRadioButton("Free Shipping", true);
		myShippingGroup.add( myFreeButton);
		myPanel.add( myFreeButton);
		myExpressButton = new JRadioButton("Express Shipping, $150", false);
		myShippingGroup.add( myExpressButton);
		myPanel.add (myExpressButton);
		myBillItems = new String[]{
		 "Black", "White"};
		myCheckBox = new JCheckBox [myBillItems.length];
		for (int i = 0; i <myBillItems.length; i++){
			myCheckBox[i] = new JCheckBox (myBillItems[i]);
			myPanel.add(myCheckBox[i]);
			myCP.add(myPanel, BorderLayout.SOUTH);
		}
	} // init

	private void billCommand(){
		if( myCheckBox[0].isSelected()  && myCheckBox[1].isSelected()) JOptionPane.showMessageDialog( null, "The color of your Furniture is Black & White" );
		else if( myCheckBox[0].isSelected()  ) JOptionPane.showMessageDialog( null, "The color of your Furniture is Black" );
		else if( myCheckBox[1].isSelected()  ) JOptionPane.showMessageDialog( null, "The color of your Furniture is White" );
		String f = myCart.getText();
		JOptionPane.showMessageDialog(null,"Your Purchase of\n" + f + " has been recorded");
	} // billcommand

	private double calculateCommand(){
		int c =Integer.parseInt(myText.getText());
		String f = myCart.getText();
		double total=0.0;

		if (Clothes[0].isSelected())
			total+=Prices[0];

		if (Clothes[1].isSelected())
		total+=Prices[1];

		if (Clothes[2].isSelected())
		total+=Prices[2];

		if (Clothes[3].isSelected())
		total+=Prices[3];

		return total;

		JOptionPane.showMessageDialog (null, "Your total is " + total ) ;
	}// calculatecommand

	private void addCommand(){
		int c =Integer.parseInt(myText.getText());
		if (c != 0)
		{
			myCart.append(myText.getText() +  " " + myComboBox.getSelectedItem()+ '\n');
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Please, Enter a Quatity");
		}
	}// addCommand

	private void removeCommand(){
		if (myCart.getSelectedText() == null)
		{
			JOptionPane.showMessageDialog(null, "Please, Select item to delete");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "DO YOU WANT TO REMOVE  " + myCart.getSelectedText());
			myCart.replaceRange( null , myCart.getSelectionStart(), myCart.getSelectionEnd()+1);
		}
	}// removeCommand
}// Shop
