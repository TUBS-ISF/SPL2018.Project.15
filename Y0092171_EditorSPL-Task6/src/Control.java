import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Control implements ActionListener
{
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JTextArea mainTextArea;
	private Font currentFont;
	private JButton btnPI;
	private JButton btnSINUS;
	private JButton btnCOSINUS;
	private JButton btnTANGENT;
	
	
	public Control()
	{
		this.mainFrame = new JFrame();
		this.mainPanel = new JPanel();
		this.currentFont = new Font("Arial", Font.PLAIN, 14);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(new EtchedBorder());
		this.initMainFrame();
	}
	
	private void initMainFrame()
	{
		this.mainFrame.setSize(300, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.mainFrame.setLocation(dim.width/2-this.mainFrame.getSize().width/2, dim.height/2-this.mainFrame.getSize().height/2);
		
		btnPI = new JButton("PI");
		btnPI.setVisible(false);
		btnPI.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
		        // Die Quelle wird mit getSource() abgefragt und mit den
		        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
		        // der Buttons ist, wird der Text des JLabels entsprechend geändert
		        if(ae.getSource() == btnPI){
		        	String text = mainTextArea.getText();
		        	String pi = "π";
		    		mainTextArea.setText(text + " " + Math.PI);
		        }
		    }
		
		});
		
		btnSINUS = new JButton("SINUS");
		btnSINUS.setVisible(false);
		btnSINUS.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
		        // Die Quelle wird mit getSource() abgefragt und mit den
		        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
		        // der Buttons ist, wird der Text des JLabels entsprechend geändert
		        if(ae.getSource() == btnSINUS){
		        	String completeText = mainTextArea.getText();
		        	String text = mainTextArea.getSelectedText();
		        	String pi = "π";		        	
		    		mainTextArea.setText(completeText + " sin(" + text + ") = " + Math.sin(Double.parseDouble(text)));
		        }
		    }
		
		});
		btnCOSINUS = new JButton("COSINUS");
		btnCOSINUS.setVisible(false);
		btnCOSINUS.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
		        // Die Quelle wird mit getSource() abgefragt und mit den
		        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
		        // der Buttons ist, wird der Text des JLabels entsprechend geändert
		        if(ae.getSource() == btnCOSINUS){
		        	String completeText = mainTextArea.getText();
		        	String text = mainTextArea.getSelectedText();
		        	String pi = "π";		        	
		    		mainTextArea.setText(completeText + " cos(" + text + ") = " + Math.cos(Double.parseDouble(text)));
		        }
		    }
		
		});
		btnTANGENT = new JButton("TANGENT");
		btnTANGENT.setVisible(false);
		btnTANGENT.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
		        // Die Quelle wird mit getSource() abgefragt und mit den
		        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
		        // der Buttons ist, wird der Text des JLabels entsprechend geändert
		        if(ae.getSource() == btnTANGENT){
		        	String completeText = mainTextArea.getText();
		        	String text = mainTextArea.getSelectedText();
		        	String pi = "π";		        	
		    		mainTextArea.setText(completeText + " tan(" + text + ") = " + Math.tan(Double.parseDouble(text)));
		        }
		    }
		
		});
		
		this.mainTextArea = new JTextArea();
		this.mainTextArea.setFont(this.currentFont);
		this.mainTextArea.setText("This is an example text.");

		this.mainPanel.add(btnPI, BorderLayout.NORTH);
		this.mainPanel.add(btnSINUS, BorderLayout.NORTH);
		this.mainPanel.add(btnCOSINUS, BorderLayout.NORTH);
		this.mainPanel.add(btnTANGENT, BorderLayout.NORTH);
        this.mainPanel.add(mainTextArea);
		this.mainFrame.add(mainPanel);
		
		this.mainFrame.setVisible(true);
	}
	
	public void setBackgroundColor(Color color)
	{
		this.mainTextArea.setBackground(color);
	}
	
	public void setTextColor(Color color)
	{
		this.mainTextArea.setForeground(color);
	}
	
	public void setFontToBold()
	{		
		if(this.currentFont.isPlain())
		{
			this.currentFont = new Font("Arial", Font.BOLD, 14);
		}
		else if(this.currentFont.isItalic())
		{
			this.currentFont = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
		}		

		this.mainTextArea.setFont(this.currentFont);
	}
	
	public void setFontToCursiv()
	{		
		if(this.currentFont.isPlain())
		{
			this.currentFont = new Font("Arial", Font.ITALIC, 14);
		}
		else if(this.currentFont.isBold())
		{
			this.currentFont = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
		}		

		this.mainTextArea.setFont(this.currentFont);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void showBtnPI()
	{
		this.btnPI.setVisible(true);
	}
	
	public void showBtnSINUS()
	{
		mainTextArea.setText("Mark the number and press the button! 1");
		this.btnSINUS.setVisible(true);
	}
	
	public void showBtnCOSINUS()
	{
		mainTextArea.setText("Mark the number and press the button! 1");
		this.btnCOSINUS.setVisible(true);
	}
	
	public void showBtnTANGENT()
	{
		mainTextArea.setText("Mark the number and press the button! 1");
		this.btnTANGENT.setVisible(true);
	}
	
	
}