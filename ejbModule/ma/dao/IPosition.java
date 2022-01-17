package ma.dao;

import java.util.List;

import javax.ejb.Remote;

import ma.models.Position;


@Remote
public interface IPosition {
	public void ajouter(Position p);
	public void modifier(Position p);
	public void supprimer(Position p);
	public Position findById(int id);
	public List<Position> findAll();
}
