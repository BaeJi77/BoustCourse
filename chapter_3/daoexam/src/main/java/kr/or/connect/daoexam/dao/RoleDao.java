package kr.or.connect.daoexam.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.daoexam.dto.Role;

import static kr.or.connect.daoexam.dao.RoleDaoSqls.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

@Repository
public class RoleDao {	
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);
	
	public RoleDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap() , rowMapper);
	}
	
	public int insert(Role role) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(role);
		return insertAction.execute(param);
	}
	
	public int update(Role role) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE, param);
	}
}
