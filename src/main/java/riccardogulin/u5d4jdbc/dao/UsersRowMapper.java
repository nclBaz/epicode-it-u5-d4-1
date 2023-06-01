package riccardogulin.u5d4jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import riccardogulin.u5d4jdbc.entities.User;

public class UsersRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Metodo usato ogni qualvolta io vada a leggere righe dal db per mappare ogni
		// riga in un oggetto User
		User fromDb = User.builder().id(rs.getInt("id")).name(rs.getString("name")).surname(rs.getString("surname"))
				.email(rs.getString("email")).build();
		return fromDb;
	}

}
