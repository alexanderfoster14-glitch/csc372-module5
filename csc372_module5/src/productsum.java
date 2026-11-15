
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class productsum extends JFrame implements ActionListener{
	
	private JLabel productSumTotalLabel;
	private JButton exitButton;
	private JButton calcButton;
	private static double[] numbs = new double[5];
	JFormattedTextField number1Field;
	JFormattedTextField number2Field;
	JFormattedTextField number3Field;
	JFormattedTextField number4Field;
	JFormattedTextField number5Field;
	static JTextField productSumTotalField;
	double sumTotal = 1;
	
	productsum() {
		setSize(400, 600);						//Set the frame's width to 400 and height to 300 pixels
		setTitle("Product Sum");				//Set the frame's title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Set program to exit when the frame is closed

		setLayout(new GridBagLayout());
		GridBagConstraints layoutConst = new GridBagConstraints();
		
		//jPanel ---------------------------------------------
		JPanel jPanel = new JPanel(new GridBagLayout());

		//jPanel layout --------------------------------------
		GridBagConstraints panelConst = new GridBagConstraints();
		panelConst.gridx = 0;
		panelConst.gridy = 0;
		add(jPanel, panelConst);
		
		//Instructions -----------------------------------------
		JTextArea outputArea = new JTextArea();
		outputArea.setText("Instructions: Enter 5 numbers into fields below.");
		outputArea.setEditable(false);
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 2;
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(outputArea, layoutConst);

		//Number 1 -----------------------------------------------------------
		number1Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
		number1Field.setColumns(10);
		JLabel number1Label = new JLabel("Number 1:");
		
		//Positioning for number 1 -------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number1Label, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number1Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
		
		number1Field.setText("0");

		//Number 2 -----------------------------------------------------------
		number2Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
		number2Field.setColumns(10);
		JLabel number2Label = new JLabel("Number 2:");
		
		//Positioning for number 2 -------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number2Label, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number2Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
		
		number2Field.setText("0");
		
		//Number 3 -----------------------------------------------------------
		number3Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
		number3Field.setColumns(10);
		JLabel number3Label = new JLabel("Number 3:");
		
		//Positioning for number 3 -------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 3;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number3Label, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 3;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number3Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
		
		number3Field.setText("0");
		
		//Number 4 -----------------------------------------------------------
		number4Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
		number4Field.setColumns(10);
		JLabel number4Label = new JLabel("Number 4:");
		
		//Positioning for number 4 -------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 4;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number4Label, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 4;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number4Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
		
		number4Field.setText("0");
		
		//Number 5 -----------------------------------------------------------
		number5Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
		number5Field.setColumns(10);
		JLabel number5Label = new JLabel("Number 5:");
		
		//Positioning for number 5 -------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 5;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number5Label, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 5;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(number5Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
		
		number5Field.setText("0");
		
		//Button to calculate product sum -------------------------------------------------------
		calcButton = new JButton("Calculate total product sum");
		calcButton.addActionListener(this);
		
		//Add button to panel ------------------------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 6;
		layoutConst.gridwidth = 2;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(calcButton, layoutConst);
		
		//Product sum total -----------------------------------------------------------------
		productSumTotalField = new JTextField(10);
		productSumTotalLabel = new JLabel("Product sum Total:");
	
		//Positioning for currentBlance ---------------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 7;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		jPanel.add(productSumTotalLabel, layoutConst);
	
		layoutConst.gridx = 1;
		layoutConst.gridy = 7;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		jPanel.add(productSumTotalField, layoutConst);

		//Button to update account ------------------------------------------------------
		exitButton = new JButton("Exit program");
		exitButton.addActionListener(this);
		
		//Add button to panel -----------------------------------------------------------
		layoutConst.gridx = 0;
		layoutConst.gridy = 8;
		layoutConst.gridwidth = 2;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(exitButton, layoutConst);

		pack();								//Auto size the program to fit everything
		setVisible(true);
		
	}
	
	public static void sumProduct(double[] numbs, int elementPosition, double sumTotal) {
		
		if (elementPosition > 4) {
			//System.out.println("Product of numbers is: " + sumTotal);	//Testing output at console
			productSumTotalField.setText(String.valueOf(sumTotal));
		}
		else {
			sumTotal = sumTotal * numbs[elementPosition];
			sumProduct(numbs, elementPosition + 1, sumTotal);
		}
	}
	
	public static void main (String args[]) {
		new productsum();
		
		/*
		double sumTotal = 1;
		numbs[0] = 2;
		numbs[1] = 3;
		numbs[2] = 4;
		numbs[3] = 5;
		numbs[4] = 6;
		System.out.println("Numbs are: " + numbs[0] + " "
		+ numbs[1] + " " + numbs[2] + " "
		+ numbs[3] + " " + numbs[4]);
		System.out.println("Product of numbers is: "
			+ numbs[0] * numbs[1] * numbs[2] * numbs[3] * numbs[4]);
		sumProduct(numbs, 0, sumTotal);
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == calcButton) {
			numbs[0] = ((Number) number1Field.getValue()).doubleValue();
			numbs[1] = ((Number) number2Field.getValue()).doubleValue();
			numbs[2] = ((Number) number3Field.getValue()).doubleValue();
			numbs[3] = ((Number) number4Field.getValue()).doubleValue();
			numbs[4] = ((Number) number5Field.getValue()).doubleValue();
			sumProduct(numbs, 0, sumTotal);
		}
		else if (e.getSource() == exitButton) {
			System.exit(0);
		}
	}
}