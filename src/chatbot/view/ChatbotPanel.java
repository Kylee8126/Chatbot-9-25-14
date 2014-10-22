package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
	private JButton randomButton;
	private JTextField sampleField;
	/**
	 * This is the base spring layout constructor.
	 */
	private JTextArea chatArea;
	private JScrollPane chatPane;

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
		randomButton = new JButton("You won't like me when I'm angry.");
		chatArea = new JTextArea(5,25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 0, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, 6, SpringLayout.EAST, randomButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleButton, -62, SpringLayout.NORTH, chatPane);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollpane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
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
		this.add(chatPane);
		this.add(randomButton);
	}
	/**
	 * This gives the information as to where the button is. Also the junk yard.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -43, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 85, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 90, SpringLayout.WEST, this);
	}
	/**
	 * This is the section that sets up the listeners.
	 */
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + " this will now implode... ");
			}
		});
		
		randomButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent click)
			{
				sampleField.setText(sampleField.getText() + " Hey man, don't push my buttons. ");
			}
			
		});
	}
	
}
