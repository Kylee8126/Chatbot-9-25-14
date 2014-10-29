package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotAppController;

public class ChatbotFrame extends JFrame
{
    /**
     * Variable for base panel.
     */
	private ChatbotPanel basePanel;
	/**
	 * The GUI frame constructor.
	 * @param baseController
	 */
	public ChatbotFrame(ChatbotAppController baseController)
	{
		basePanel= new ChatbotPanel(baseController);
		setupFrame();
	}
	
	 /**
	  * This sets up the settings for the frame location. 
	  */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setLocation(67, 67);
		this.setSize(455, 400);
		this.setVisible(true);
		this.setResizable(true);
	}
	
}
