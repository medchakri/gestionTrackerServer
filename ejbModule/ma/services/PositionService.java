package ma.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.dao.IPosition;
import ma.models.Position;
import ma.models.Vehicule;

public class PositionService extends UnicastRemoteObject implements IPosition{

	@PersistenceContext
	private EntityManager entityManager;
	
	public PositionService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void ajouter(Position p) {
		// TODO Auto-generated method stub
		entityManager.persist(p);
	}

	@Override
	public void modifier(Position p) {
		// TODO Auto-generated method stub
		entityManager.merge(p);
	}

	@Override
	public void supprimer(Position p) {
		// TODO Auto-generated method stub
		entityManager.remove(entityManager.contains(p) ? p : entityManager.merge(p));
	}

	@Override
	public Position findById(int id) {
		return entityManager.find(Position.class, id);
	}

	@Override
	public List<Position> findAll() {
		
		Query qr = entityManager.createQuery("from Position");
		return qr.getResultList();
	}

}
