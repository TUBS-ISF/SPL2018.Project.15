
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



abstract class Editor$$Windows implements ActionListener
{

	public static JFrame mainFrame;
	public static JPanel mainPanel;
	public static JTextArea mainTextArea;
	public static Font currentFont;
	public static JButton btnPI;
	
	public void print() {
		System.out.print("Windows");
	}

	
	public void setBackgroundColor(Color color)
	{
		mainTextArea.setBackground(color);
	}
	
	public void setTextColor(Color color)
	{
		mainTextArea.setForeground(color);
	}
	
	public void showBtnPI(Boolean visible)
	{
		btnPI.setVisible(visible);
	}
	
	public void setFontToBold()
	{		
		if(currentFont.isPlain())
		{
			currentFont = new Font("Arial", Font.BOLD, 14);
		}
		else if(currentFont.isItalic())
		{
			currentFont = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
		}		

		mainTextArea.setFont(currentFont);
	}
	
	public void setFontToCursiv()
	{		
		if(currentFont.isPlain())
		{
			currentFont = new Font("Arial", Font.ITALIC, 14);
		}
		else if(currentFont.isBold())
		{
			currentFont = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
		}		

		mainTextArea.setFont(currentFont);
	}
	
	
	public static void main(String[] args) {
		mainFrame = new JFrame();
		mainPanel = new JPanel();
		currentFont = new Font("Arial", Font.PLAIN, 14);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(new EtchedBorder());
		initMainFrame();
		new Editor().print();
	}
	
	private static void initMainFrame()	{
		mainFrame.setSize(300, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);
		

		btnPI = new JButton("PI");
		btnPI.setVisible(false);
		btnPI.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent ae){
		        // Die Quelle wird mit getSource() abgefragt und mit den
		        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
		        // der Buttons ist, wird der Text des JLabels entsprechend ge√§ndert
		        if(ae.getSource() == btnPI){
		        	String text = mainTextArea.getText();
		        	String pi = "œ?";
		    		mainTextArea.setText(text + " " + Math.PI);
		        }
		    }
		
		});
		
		mainTextArea = new JTextArea();
		mainTextArea.setFont(currentFont);
		mainTextArea.setText("This is an example text.");
		
		mainPanel.add(btnPI, BorderLayout.NORTH);
        mainPanel.add(mainTextArea);
		mainFrame.add(mainPanel);
		
		mainFrame.setVisible(true);
	}
	
	  
	
}


abstract class Editor$$PI extends  Editor$$Windows  {

	public void print() {
		super.print();
		System.out.print("PI");
		super.showBtnPI(true);
	}

}


abstract class Editor$$Bold extends  Editor$$PI  {

	public void print() {
		super.print();
		System.out.print("Bold");
		super.setFontToBold();
	}

}


abstract class Editor$$Text_Black extends  Editor$$Bold  {

	public void print() {
		super.print();
		System.out.print("Text_Black");
		super.setTextColor(Color.BLACK);
	}

}



public class Editor extends  Editor$$Text_Black  {

	public void print() {
		super.print();
		System.out.print("Background_White");
		super.setBackgroundColor(Color.WHITE);
	}

}