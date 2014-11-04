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
	
	private UserInfo myUser;
	
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
		
		int randomChoice = (int)(Math.random() *5);
		
		if(numberOfChats < 10)
		{
			//you will need to use some if's or a switch
		}
		if (randomChoice == 0)
		{
			if(stringChecker(userText))
			{
				processedText = "Woah man, I know I'm a chat bot.. but you're getting a little too chatty.";
			}
			
		}
		else if (randomChoice == 1)
		{
			if(contentChecker(userText))
			{
				processedText = "Dude I love " + userText + " you're freaking rad!";
			}
			else if(korraChecker(userText))
			{
				processedText = "Ah yes " + userText + "! Avatar! What did you think about book 4?";
			}
		
		}
		else if(randomChoice == 2)
			
		{
			if(memeChecker(userText))
			{
				processedText = "Hey, you found a meme: " + userText;
				processedText += "isn't that fancy.";
			
			}
			else
			{
				processedText = "Boring, that wasn't really a meme.";	
			}
		}
		else if(randomChoice == 3)
		{
			
		}
		
		return processedText;
	}
	/**
	 * Checks the string to see if it is a meme.
	 * @param currentText
	 * @return
	 */
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

		if (input != null && (input.equalsIgnoreCase("Goodbye") || input.equalsIgnoreCase("No") || input.equalsIgnoreCase ("super no") || input.equalsIgnoreCase ("Super nope") || input.equalsIgnoreCase ("nah") || input.equalsIgnoreCase("Bye")))
		{
			okToQuit = true;
		}

		return okToQuit;
	}
	/**
	 * Checks the string length to see if it is less than 35 characters. 
	 * @param lengthText
	 * @return
	 */
	private boolean stringChecker(String input)
	{
		boolean stringChecker = false;
		
		if (input.length() >= 35 )
		{
			stringChecker = true;
		}
		else 
		{
			stringChecker = false;
		}
		return stringChecker;
	}
	/**
	 * Checks if the supplied String contains the content of the chatbot.
	 * @param input Input content checker.
	 * @return ContentChecker.
	 */
	public boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
		if(input.toLowerCase().contains("Hayley Williams")|| input.toLowerCase().contains("Paramore".toLowerCase()) || input.toLowerCase().contains("We are the in crowd".toLowerCase()) || input.toLowerCase().contains("Tay Jardine".toLowerCase()) || input.contains("Korra") || input.contains("The legend of Korra") || input.toLowerCase().contains("Mako"))
		{
			hasMyContent = true;
		}
		return hasMyContent;
	
			
	}
	/**
	 * Checks if the supplied String contains the content listed in Korra checker.
	 * @param input Input korra Checker.
	 * @return KorraChecker.
	 */
	private boolean korraChecker(String input)
	{
		boolean hasMyKorra = false;
		if(input.toLowerCase().contains("Korra") || input.toLowerCase().contains("Naga") || input.toLowerCase().contains("Bolin") || input.toLowerCase().contains("Opal") || input.toLowerCase().contains("opal and bolin") || input.toLowerCase().contains("Jinora") || input.toLowerCase().contains("Kai") || input.toLowerCase().contains("Jinora and Kai") || input.toLowerCase().contains("Amon") || input.toLowerCase().contains("freedom fighters") || input.toLowerCase().contains("triad") || input.toLowerCase().contains("triple threat triad") || input.toLowerCase().contains("hermonic convergience") || input.toLowerCase().contains("vaatu") || 
		   input.toLowerCase().contains("wan") || input.toLowerCase().contains("raava") ||  input.toLowerCase().contains("avatar") ||   input.toLowerCase().contains("tonraq") || input.toLowerCase().contains("Varrick") || input.toLowerCase().contains("Asami") || input.toLowerCase().contains("future industries") || input.toLowerCase().contains("Lin") || input.toLowerCase().contains("Beifong") || input.toLowerCase().contains("Toph") || input.toLowerCase().contains("Aang") ||input.toLowerCase().contains("Varrick") || input.toLowerCase().contains("Sato") ||  input.toLowerCase().contains("Tenzin") || input.toLowerCase().contains("Tarrlok") ||
		   input.toLowerCase().contains("Shiro Shinobi") || input.toLowerCase().contains("Saikhan") || input.toLowerCase().contains("metal clan") || input.toLowerCase().contains("hiroshi sato") || input.toLowerCase().contains("Pabu") || input.toLowerCase().contains("Ikki") || input.toLowerCase().contains("Eska") || input.toLowerCase().contains("Desna") || input.toLowerCase().contains("Kya") || input.toLowerCase().contains("Bumi") || input.toLowerCase().contains("Pema") || input.toLowerCase().contains("Senna") || input.toLowerCase().contains("Mako") ||
		   input.toLowerCase().contains("Water benders") ||  input.toLowerCase().contains("water bending") ||  input.toLowerCase().contains("water bender") ||  input.toLowerCase().contains("water bender's") || input.toLowerCase().contains("water bended") || input.toLowerCase().contains("water bend") || 
		   input.toLowerCase().contains("Fire benders") || input.toLowerCase().contains("fire bender") || input.toLowerCase().contains("fire bender's") || input.toLowerCase().contains("fire bending") || input.toLowerCase().contains("fire benders") || input.toLowerCase().contains("fire bended") || input.toLowerCase().contains("fire bend") || input.toLowerCase().contains("eath bend") || input.toLowerCase().contains("earth bender") || input.toLowerCase().contains("earth bender's") || input.toLowerCase().contains("earth benders") ||
		   input.toLowerCase().contains("earth bending") || input.toLowerCase().contains("earth bended") || input.toLowerCase().contains("air bend") || input.toLowerCase().contains("air bender") || input.toLowerCase().contains("air benders") ||input.toLowerCase().contains("air bender's") || input.toLowerCase().contains("air bending") ||input.toLowerCase().contains("air bended") || input.toLowerCase().contains("air nomads") ||input.toLowerCase().contains("air nomad's") ||input.toLowerCase().contains("air nomad") || input.toLowerCase().contains("fire nation") || input.toLowerCase().contains("earth kingdom")|| input.toLowerCase().contains("water tribe"))
		{
			hasMyKorra = true;	
		}
		
		return hasMyKorra;
	}
	
}
