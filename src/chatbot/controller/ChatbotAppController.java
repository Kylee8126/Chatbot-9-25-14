package chatbot.controller;

import javax.swing.JOptionPane;
import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;
/**
 * Application Controller for the Chatbot String manipulation project. Responsible for controlling the View and Model packages.
 * @author kchr8126 Kylee Christensen
 * @version 1.1 10/1/14
 */
public class ChatbotAppController
{  
	/**
	 * The GUI view for the application. 
	 */
	private ChatbotView appView;
	
	/**
	 * The Chatbot Model instance.
	 */
	private Chatbot notSoCleverBot;
	
	/**
	 * The startup message for our chatbot application. 
	 */
	private String startMessage;
	
	/**
	 * Creates a ChatbotAppController and initializes the associated View and Model objects.
	 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverBot = new Chatbot(" Mr. not so clever ");
		startMessage = "Welcome to the" + notSoCleverBot.getName() + " Chatbot, type your name here.";
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
		String message = appView.displayChatbotConversations(startMessage);
		
		while(!notSoCleverBot.quitChecker(message))
		{
			message = notSoCleverBot.processText(message);
			message = appView.displayChatbotConversations(message);
		}
		
		quit();
	}
	
	/**
	 * Gives the user a quitting message.
	 */
	private void quit ()
	{
		appView.displayInformation("Bye user.");
		System.exit(0);
	}
}