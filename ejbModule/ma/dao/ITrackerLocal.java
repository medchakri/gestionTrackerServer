package ma.dao;

import java.util.List;

import javax.ejb.Local;

import ma.models.Tracker;

@Local
public interface ITrackerLocal {
	
	public Tracker ajouter(Tracker t);
	public void modifier(Tracker t);
	public void supprimer(Tracker t);
	public Tracker findById(int id);
	public List<Tracker> findAll();
}
