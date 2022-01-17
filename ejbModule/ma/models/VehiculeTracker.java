package ma.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class VehiculeTracker implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -309507751217162819L;

	/**
	 * 
	 */
	

	@EmbeddedId
	VehiculeTrackerKey id;

	@ManyToOne
	@MapsId("vehiculeId")
	@JoinColumn(name = "Vehicule_id")
	private Vehicule vehicule;

	@ManyToOne
	@MapsId("gpsTrackerId")
	@JoinColumn(name = "GPSTracker_id")
	private Tracker Tracker;

	private Date dateDebut;
	private Date dateFin;

	public VehiculeTracker() {
		super();
	}

	public VehiculeTracker(VehiculeTrackerKey id, Vehicule vehicule, Tracker Tracker, Date dateDebut,
			Date dateFin) {
		super();
		this.id = id;
		this.vehicule = vehicule;
		this.Tracker = Tracker;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public VehiculeTrackerKey getId() {
		return id;
	}

	public void setId(VehiculeTrackerKey id) {
		this.id = id;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Tracker getTracker() {
		return Tracker;
	}

	public void setTracker(Tracker Tracker) {
		this.Tracker = Tracker;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
