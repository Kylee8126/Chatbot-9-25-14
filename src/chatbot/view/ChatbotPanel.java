package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;

/**
 * This is the the GUI panel.
 * @author kchr8126
 *
 */
public class ChatbotPanel extends JPanel
{
	/**
	 * This is the Button constructor.
	 */
	private JButton sampleButton;
	/**
	 * This is the Text field constructor.
	 */
	private JTextField sampleField;
	/**
	 * This is the base spring layout constructor.
	 */
	private SpringLayout baseLayout;
	/**
	 * The constructor for the base controller.
	 */
	private ChatbotAppController baseController;
	/**
	 * The controller section for this Panel.
	 * @param baseController
	 */
	public ChatbotPanel(ChatbotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("The red button. DON'T CLICK ME!");
		sampleField = new JTextField(25);

		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 *This gives the information to how the window looks.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}
	/**
	 * This gives the information as to where the button is. Also the junk yard.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 49, SpringLayout.SOUTH, sampleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 26, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, 33, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 98, SpringLayout.WEST, this);
	}
	/**
	 * This is the section that sets up the listeners.
	 */
	private void setupListeners()
	{
		
	}
	
}
