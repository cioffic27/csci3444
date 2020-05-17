package p3.jdbctemplate.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class CatRowMapper implements RowMapper<Cat>{

	@Override
	public Cat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cat c1 = new Cat();
		c1.setId(rs.getLong("id"));
		c1.setColor(rs.getString("Color"));
		c1.setType(rs.getString("Type"));
		return c1;
	}

	

}
