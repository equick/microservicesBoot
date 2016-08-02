package demo.domain;

public class Player {
	
	String name;
	String postion;
	
	public Player() {
		super();
	}
	
	public Player(String name, String postion) {
		this();
		this.name = name;
		this.postion = postion;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	
	

}
