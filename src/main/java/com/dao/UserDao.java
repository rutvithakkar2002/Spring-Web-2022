package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.UserBean;

public class UserDao {

	@Autowired
	JdbcTemplate stmt;	
	
	public void insertUser(UserBean user)
	{
		stmt.update("insert into users (firstname,email,password,gender,hobby,isdelete) values(?,?,?,?,?,?)" , user.getFirstName(),user.getEmail(),user.getPassword(),user.getGender(),user.getHobby(),user.isIsdelete());
	
		//update--> insert update delete
	}

	public List<UserBean> getAllUsers() {
		List<UserBean> users = stmt.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
		return users;
	
	}

	public void deleteuser(int userId) {
		stmt.update("delete from users where userId=?", userId);
		
	}

	public UserBean getuserbyid(int userId) {
		UserBean user=stmt.queryForObject("select * from users where userId=?", new BeanPropertyRowMapper<UserBean>(UserBean.class), new Object[] {userId});
		return user;
	}
	
	public void updateUser(UserBean user) {
		stmt.update("update users set firstname = ? , email = ? ,hobby=? where userid = ? ",user.getFirstName(),user.getEmail(),user.getHobby(),user.getUserId());
	}

	public List<UserBean> getUserByName(String search) {
		List<UserBean> users = stmt.query("select * from users where firstname like ? ",
				new BeanPropertyRowMapper<UserBean>(UserBean.class), new Object[] { search });
		return users;
	}
	
	
}
