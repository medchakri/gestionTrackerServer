package ma.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Tracker implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5929068404666181386L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String simNumber	;
	@Transient
	@ManyToOne @JoinColumn(name="idPosition")
	private Position position;
	
	public Tracker() {
		super();
	}


	public Tracker(int id, String simNumber) {
		super();
		this.id = id;
		this.simNumber = simNumber;
	}

	public Tracker( String simNumber) {
		super();
		this.simNumber = simNumber;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSimNumber() {
		return simNumber;
	}


	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}
	
	

}
