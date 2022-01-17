package ma.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import ma.dao.ITracker;
import ma.dao.ITrackerLocal;
import ma.models.Tracker;

@Stateless
public class TrackerService extends UnicastRemoteObject implements ITracker, ITrackerLocal {

	@PersistenceContext
	private EntityManager entityManager; 
	
	public TrackerService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Tracker ajouter( Tracker t) {
		// TODO Auto-generated method stub
		entityManager.persist(t);
		return t;
	}

	@Override
	public void modifier(Tracker t) {
		// TODO Auto-generated method stub
		entityManager.merge(t);
	}

	@Override
	public void supprimer(Tracker t) {
		// TODO Auto-generated method stub
		entityManager.remove(entityManager.contains(t) ? t : entityManager.merge(t));
	}

	@Override
	public Tracker findById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Tracker.class, id);
	}

	@Override
	public List<Tracker> findAll() {
		// TODO Auto-generated method stub
		Query qr = entityManager.createQuery("from Tracker");
		return qr.getResultList();
	}

}
