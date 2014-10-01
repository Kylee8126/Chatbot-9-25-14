package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	/**
	 * Constructor for the Chatbot's assigned name.
	 */
	private String name;
	/**
	 * Constructor for the number of chats counter.
	 */
	private int numberOfChats;
	/**
	 * Constructor for the meme list.
	 */
	private ArrayList <String> memeList;
	
	/**
	 * Creates a Chatbot object with a specified name Initializes the total
	 * chats 0. Fills the memeList.
	 * @param name  The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		
		memeList = new ArrayList <String>();
		fillTheMemeList();
	}

	/**
	 * Gets Chatbot name for user.
	 * 
	 * @return The chatbot's assigned name for user.
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Gets percise number of chats or messages for user.
	 * @return
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * Gets this SetName for user.
	 * @param name The new name for the Chatbot.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Increments the number of chats or messages.
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	/**
	 * Fills the contents of the internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u mad bro ");
		memeList.add("ain't nobody got time for that! ");
		memeList.add("Toddler fist ");
		memeList.add("Kitties ");
		memeList.add("Hipser ");
		memeList.add("Stupid Teacher ");
			
	}
	
	/**
	 * Processed the supplied text from the user to provide a message from the Chatbot.
	 * @param userText The user supplied text.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		
		if(memeChecker(userText))
		{
			processedText = "Hey, you found a meme: " + userText;
			processedText += "isn't that fancy.";
			
		}
		else
		{
			processedText = "Boring, that wasn't really a meme.";	
		}
		
		
		return processedText;
	}
	
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if(memeList.get(loopCount).equalsIgnoreCase(currentText))
			{
				isAMeme= true;
			}
		}
		
		
		return isAMeme;
	}
	
	/**
	 * Checks if user is ready to quit by their input.
	 * @param input Input is used for quit checker.
	 * @return Quit message or alternative route message.
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && (input.equalsIgnoreCase("Goodbye") || input.equalsIgnoreCase("No") || input.equalsIgnoreCase ("super no") || input.equalsIgnoreCase ("Super nope") || input.equalsIgnoreCase ("nah")))
		{
			okToQuit = true;
		}

		return okToQuit;
	}

	public int stringChecker()
	{
		boolean 
		return stringChecker();
		
	
	}
	public boolean contentChecker(String input)
	{
		return contentChecker(input);
		
		
	}
	
}
