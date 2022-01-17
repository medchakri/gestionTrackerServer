package ma.models;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class VehiculeTrackerKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6028645878946070791L;

	@Column(name = "Vehicule_id")
	int vehiculeId;

	@Column(name = "GPSTracker_id")
	int gpsTrackerId;
	
	

}
