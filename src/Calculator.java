import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorclicked=false;
	String oldValue; 
	String newValue;
	String result;
	int a,b;
	int c;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton,mulButton,minusButton,plusButton,clearButton;
	JButton fourButton,threeButton,twoButton,oneButton,zeroButton,dotButton,equalbutton,divButton,equalButton;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.YELLOW);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		displayLabel.setForeground(Color.BLACK);
		jf.add(displayLabel);
		

		 sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
        nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30,330,80,80);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		 twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		 divButton=new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		 mulButton=new JButton("x");
		mulButton.setBounds(330,230,80,80);
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		 minusButton=new JButton("-");
		minusButton.setBounds(330,330,80,80);
		minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(330,430,80,80);
		plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		 clearButton=new JButton("clear");
			clearButton.setBounds(430,430,80,80);
			clearButton.setFont(new Font("Arial",Font.PLAIN,40));
			clearButton.addActionListener(this);
			jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==sevenButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("7");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"7");
			 }
		 }else if(e.getSource()==eightButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("8");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"8"); 
			 }
		 }else if(e.getSource()==nineButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("9");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"9");
			 }
		 }else if(e.getSource()==fourButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("4");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"4");
			 }
		 }else if(e.getSource()==fiveButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("5");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"5");
			 }
		 }else if(e.getSource()==sixButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("6");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"6");
			 }
		 }else if(e.getSource()==oneButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("1");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"1");
			 }
		 }else if(e.getSource()==twoButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("2");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"2");
			 }
		 }else if(e.getSource()==threeButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("3");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"3");
			 }
		 }else if(e.getSource()==zeroButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText("0");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+"0");
			 }
		 }else if(e.getSource()==dotButton) {
			 if(isOperatorclicked) {
				 displayLabel.setText(".");
				 isOperatorclicked=false;
			 }else {
			 displayLabel.setText(displayLabel.getText()+".");
			 }
		 }else if(e.getSource()==equalButton) {
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			float result=oldValueF+newValueF;
			displayLabel.setText(result+"");
		 }else if(e.getSource()==divButton) {
			 
		isOperatorclicked=true;
	    oldValue=displayLabel.getText(); 
		 }else if(e.getSource()==mulButton) {
			 displayLabel.setText(c+"");
			 isOperatorclicked=true;
			    oldValue=displayLabel.getText(); 
		 }else if(e.getSource()==minusButton) { 
			 displayLabel.setText(c+"");
			 isOperatorclicked=true;
			    oldValue=displayLabel.getText();
		 }else if(e.getSource()==plusButton) {
			 displayLabel.setText(c+"");
			 isOperatorclicked=true;
			    oldValue=displayLabel.getText();
		 }else if(e.getSource()==clearButton) {  
			 displayLabel.setText(" ");
			 
		 }
			 
		 }
		 
		 
}
