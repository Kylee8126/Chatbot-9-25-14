package chatbot.model;

public class UserInfo
{
	
	private String userName;
	private int age;
	private boolean likesKorra;
	private boolean likesParamore;
	
	
	
	public UserInfo()
	{
		this.userName = "";
		this.age = 0;
		this.likesKorra = false;
		this.likesParamore = false;
	}
	
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int Age)
	{
		this.age = age;
	}
	public boolean isLikesKorra()
	{
		return likesKorra;
	}

	public void setLikesKorra(boolean likesKorra)
	{
		this.likesKorra = likesKorra;
	}
	public boolean isLikesParamore()
	{
		return likesParamore;
	}

	public void setLikesParamore(boolean likesParamore)
	{
		this.likesParamore = likesParamore;
	}
	
	
}