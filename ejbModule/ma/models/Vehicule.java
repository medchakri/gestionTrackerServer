package ma.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Vehicule implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3229488059974471901L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String matricule;
	private String marque;
	private String type;
	private int idGps; 
	//@OneToMany(mappedBy = "vehicule")
	//Set<VehiculeTracker> VehiculeTracker;

	public Vehicule() {
		super();
	}
	
	public Vehicule(int id, String matricule, String marque, String type,int idGps) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.type = type;
		this.idGps = idGps;
	}

	public Vehicule(int id, String matricule, String marque, String type) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.type = type;
	}
	public Vehicule( String matricule, String marque, String type) {
		super();
		
		this.matricule = matricule;
		this.marque = marque;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIdGps() {
		return idGps;
	}

	public void setIdGps(int idGps) {
		this.idGps = idGps;
	}
	
	

}
