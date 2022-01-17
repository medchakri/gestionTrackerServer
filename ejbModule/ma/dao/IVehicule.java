package ma.dao;

import java.util.List;

import javax.ejb.Remote;


import ma.models.Vehicule;

@Remote
public interface IVehicule {
	public void ajouter(Vehicule v);
	public void modifier(Vehicule v);
	public void supprimer(Vehicule v);
	public Vehicule findById(int id);
	public List<Vehicule> findAll();
}
