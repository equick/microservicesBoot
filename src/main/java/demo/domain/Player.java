package demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id @GeneratedValue
	Long id;
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
