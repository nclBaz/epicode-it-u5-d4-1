package riccardogulin.u5d4jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import riccardogulin.u5d4jdbc.entities.User;

@Repository
public class UsersDAOImpl implements UsersDAO {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<User> findAll() {
		String sql = "SELECT * FROM users";
		return jdbc.query(sql, new UsersRowMapper());
	}

	@Override
	public User findById(int id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		return jdbc.queryForObject(sql, new UsersRowMapper(), id);
	}

	@Override
	public void save(User user) {
		String sql = "INSERT INTO users (name, surname, email) VALUES (?, ?, ?)";

		jdbc.update(sql, user.getName(), user.getSurname(), user.getEmail());

	}

	@Override
	public int findByIdAndUpdate(int id, User user) {
		String sql = "UPDATE users SET name=?, surname=?, email=? WHERE id=?";
		return jdbc.update(sql, user.getName(), user.getSurname(), user.getEmail(), id);

	}

	@Override
	public int findByIdAndDelete(int id) {
		String sql = "DELETE FROM users WHERE id=?";
		return jdbc.update(sql, id);

	}

	@Override
	public int count() {
		String sql = "SELECT COUNT(*) FROM users";

		return jdbc.queryForObject(sql, Integer.class);
	}

}
