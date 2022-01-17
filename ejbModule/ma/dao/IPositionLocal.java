package ma.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import ma.models.Position;

@Local
public interface IPositionLocal {
	public void ajouter(Position p);
	public void modifier(Position p);
	public void supprimer(Position p);
	public Position findById(int id);
	public List<Position> findAll();
}
