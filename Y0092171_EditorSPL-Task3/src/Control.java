import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;


public class Control {
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JTextArea mainTextArea;
	private Font currentFont;
	
	
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
		
		this.mainTextArea = new JTextArea();
		this.mainTextArea.setFont(this.currentFont);
		this.mainTextArea.setText("This is an example text.");
		
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
	
	
	
	
}