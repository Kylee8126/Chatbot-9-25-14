package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;

	/**
	 * Creates a Chatbot object with a specified name Initializes the total
	 * chats 0.
	 * @param name  The name of the chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
	}

	/**
	 * Gets Chatbot name for user.
	 * 
	 * @return
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
	 * Checks if user is ready to quit by their input.
	 * @param input
	 * @return
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

}
