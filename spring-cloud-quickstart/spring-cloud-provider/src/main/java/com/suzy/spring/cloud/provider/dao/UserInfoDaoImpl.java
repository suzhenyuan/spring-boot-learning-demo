package com.suzy.spring.cloud.provider.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.suzy.spring.cloud.model.UserInfoDo;

@Repository
public class UserInfoDaoImpl implements IUserInfoDao {

	@Autowired
	private JdbcTemplate biJdbcTemplate;
	@Override
	public UserInfoDo saveUser(UserInfoDo userInfoDo) {

		String sql="insert into sc_user_info(name, remark)values(?,?)";
		int cnt= biJdbcTemplate.update(sql,new Object[]{userInfoDo.getName(),userInfoDo.getRemark()});
		return userInfoDo;
	}

	@Override
	public UserInfoDo updateUser(UserInfoDo u) {
		String sql="update sc_user_info set name = ? , remark=? where id=? ";
		int cnt= biJdbcTemplate.update(sql,new Object[]{u.getName(),u.getRemark(),u.getId()});
		return u;
	}

	@Override
	public UserInfoDo findUser(int id) {
		String sql="select * from sc_user_info where id=? limit 1";
		return biJdbcTemplate.queryForObject(sql,new Object[]{id}, new BeanPropertyRowMapper<UserInfoDo>(UserInfoDo.class));
	}

	@Override
	public UserInfoDo queryLastUser() {
		String sql="select * from sc_user_info order by id desc limit 1";
		return biJdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<UserInfoDo>(UserInfoDo.class));

	}

}
