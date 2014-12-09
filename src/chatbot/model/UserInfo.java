package chatbot.model;

public class UserInfo
{
	/**
	 * Implements the user name in a string.
	 */
	private String userName;
	/**
	 * Implements the age in an int.
	 */
	private int ageNumber;
	/**
	 * Implements if user likes Korra in boolean.
	 */
	private boolean likesKorra;
	/**
	 * Implements LikesParamore in boolean form.
	 */
	private boolean likesParamore;
	
	/**
	 * Constructs the user information listed above.
	 */
	
	public UserInfo()
	{
		this.userName = "";
		this.ageNumber = 0;
		this.likesKorra = false;
		this.likesParamore = false;
	}
	/**
	 * 
	 * Gets the user name.
	 * @return returns the user name.
	 */
	public String getUserName()
	{
		return userName;
	}
	/*
	 * Sets the user name to string.
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	/*
	 * Gets  the age in numbers.
	 */
	public int getAgeNumber()
	{
		return ageNumber;
	}
	/*
	 * Sets the age as a number and can return it to user.
	 */
	public void setAgeNumber(int AgeNumber, int ageNumber)
	{
		this.ageNumber = ageNumber;
	}
	/**
	 * Constructs the user info if likes Korra.
	 * @return if likes korra.
	 */
	public boolean isLikesKorra()
	{
		return likesKorra;
	}
	/*
	 * Sets if likes Korra as a boolean.
	 */
	public void setLikesKorra(boolean likesKorra)
	{
		this.likesKorra = likesKorra;
	}
	/*Set if likes paramore as a boolean.
	 * 
	 */
	public boolean isLikesParamore()
	{
		return likesParamore;
	}
	/*
	 *  Sets if likes Paramore with void.
	 */
	public void setLikesParamore(boolean likesParamore)
	{
		this.likesParamore = likesParamore;
	}
	
	
}