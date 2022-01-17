package ma.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.*;

import ma.dao.IVehicule;
import ma.models.Vehicule;

@Stateless
public class VehiculeService extends UnicastRemoteObject implements IVehicule{

	final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GPS-SER");



	public VehiculeService() throws RemoteException {
	super();
	// TODO Auto-generated constructor stub
	}



	@Override
	public void ajouter(Vehicule obj) {
	// TODO Auto-generated method stub
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(obj);
	entityManager.getTransaction().commit();
	entityManager.close();

	}



	@Override
	public void modifier(Vehicule obj) {
	// TODO Auto-generated method stub
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Vehicule v=entityManager.find(Vehicule.class, obj.getId());
	v.setMarque(obj.getMarque());
	v.setMatricule(obj.getMatricule());
	v.setType(obj.getType());
	v.setIdGps(obj.getIdGps());
	entityManager.getTransaction().commit();
	entityManager.close();
	}



	@Override
	public void supprimer(Vehicule obj) {
	// TODO Auto-generated method stub
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();



	if (entityManager.contains(obj)) {
	entityManager.remove(obj);
	} else {
	entityManager.remove(entityManager.merge(obj));
	}



	entityManager.getTransaction().commit();
	entityManager.close();



	}



	@Override
	public Vehicule findById(int id) {
	// TODO Auto-generated method stub
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();



	@SuppressWarnings("unchecked")
	Vehicule response = (Vehicule) entityManager.find(Vehicule.class, id);
	entityManager.getTransaction().commit();
	entityManager.close();
	return response;

	}



	@SuppressWarnings("unchecked")
	@Override
	public List<Vehicule> findAll() {
	// TODO Auto-generated method stub

	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();



	Query query = entityManager.createQuery("from Vehicule");
	@SuppressWarnings("unchecked")
	List<Vehicule> liste = (List<Vehicule>) query.getResultList();



	entityManager.getTransaction().commit();
	entityManager.close();
	return liste;
	}

	@PostConstruct
	public void init() {
	/*this.ajouter(new Vehicule("VD1222", "DACIA", "2*4"));
	this.ajouter(new Vehicule("VD1272", "DACIA LOGAN", "DF4"));
	this.ajouter(new Vehicule("VD125", "DUSTER", "TYPE C"));*/
	}

}
