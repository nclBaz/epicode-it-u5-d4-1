package riccardogulin.u5d4jdbc.dao;

import java.util.List;

import riccardogulin.u5d4jdbc.entities.User;

public interface UsersDAO {
	public List<User> findAll();

	public User findById(int id);

	public void save(User user);

	public int findByIdAndUpdate(int id, User user);

	public int findByIdAndDelete(int id);

	public int count();

}
