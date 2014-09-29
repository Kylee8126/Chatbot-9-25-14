package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverBot;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot("Mr. not so clever");
		
	}
	
	/**
	 * Allows other objects access to the notSoCleverbot.
	 * @return The Chatbot for this app.
	 */
	public Chatbot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	/**
	 * Starts the Chatbot Application.
	 */
	public void start()
	{
		String message  = JOptionPane.showInputDialog(null, " I'm Chatbot.  What's your name?");
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatbotConversations(message);
			
		}
				
		{
			quit();
			
		}
		JOptionPane.showMessageDialog(null, "We are not done yet...");
		
		
	}
	/**
	 * Gives the user a quitting message.
	 */
	private void quit ()
	{
		JOptionPane.showMessageDialog(null, "bye");
		System.exit(0);
		
	}
	
	
}
