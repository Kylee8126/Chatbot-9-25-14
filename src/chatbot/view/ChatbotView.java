package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	/**
	 * This is the base conroller's implementing method.
	 */
	private ChatbotAppController baseController;
	
	/**
	 * Constructor method for the base controller.
	 * @param baseController Is this new base controller.
	 */
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	/**
	 * Display the supplied String parameter to the user via popup and returns the users response to the controller.
	 * @param input The supplied text to be displayed.
	 * @return The users input.
	 */
	public String displayChatbotConversations(String input)
	{
		String output = "";
		
		output = JOptionPane.showInputDialog(null, input);
		
		
		return output;
		
	}
	/**
	 * Displays the supplied input via a popup window.
	 * @param input The text to be displayed/
	 */
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
		
	}
	
	
}
