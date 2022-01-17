package ma.dao;

import java.util.List;

import javax.ejb.Remote;

import ma.models.Tracker;

@Remote
public interface ITracker {
	
	public Tracker ajouter(Tracker t);
	public void modifier(Tracker t);
	public void supprimer(Tracker t);
	public Tracker findById(int id);
	public List<Tracker> findAll();
}
