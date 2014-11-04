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
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;

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
	private JSpinner firstSpinner;
	private JTextField sampleField;
	private JScrollPane chatPane;
	private JTextArea chatArea;

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
		
		sampleButton = new JButton("Enter");
		sampleButton.setForeground(Color.WHITE);
		sampleButton.setBackground(Color.RED);
		sampleField = new JTextField(25);
		randomButton = new JButton("You won't like me when I'm angry.");
		randomButton.setForeground(Color.WHITE);
		randomButton.setBackground(Color.BLUE);
		firstSpinner = new JSpinner();
		firstSpinner.setForeground(Color.WHITE);
		firstSpinner.setBackground(new Color(153, 153, 255));
		chatArea = new JTextArea(5,25);
		chatPane = new JScrollPane(chatArea);
		
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 1, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleButton, -113, SpringLayout.EAST, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatPane, -144, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -49, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, 0, SpringLayout.EAST, chatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstSpinner, -84, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstSpinner, -92, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 5, SpringLayout.WEST, this);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollpane();
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
		this.setBackground(Color.BLACK);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
		this.add(chatPane);
		this.add(randomButton);
		this.add(firstSpinner);
		
		JLabel lblNewLabel = new JLabel("beta 1.2.0");
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, -4, SpringLayout.NORTH, lblNewLabel);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -62, SpringLayout.WEST, lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, this);
		add(lblNewLabel);
		
		JLabel lblThisIsMy = new JLabel("THIS IS CHAT ROBOT ");
		baseLayout.putConstraint(SpringLayout.NORTH, lblThisIsMy, 22, SpringLayout.SOUTH, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, lblThisIsMy, 105, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, lblThisIsMy, 0, SpringLayout.EAST, chatPane);
		lblThisIsMy.setFont(new Font("Serif", Font.BOLD, 12));
		lblThisIsMy.setForeground(Color.WHITE);
		add(lblThisIsMy);
	}
	/**
	 * This gives the information as to where the button is. Also the junk yard.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 85, SpringLayout.NORTH, this);
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
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatbot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
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
	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
}
