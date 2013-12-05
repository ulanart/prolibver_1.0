package DAO;

import java.sql.SQLException;
import java.util.Collection;

import lv.Models.User;


public interface UserDAO 
{
	public void addUser(User user) throws SQLException;
	public void updateUser(User id, User user) throws SQLException;
	public void deleteUser(User user) throws SQLException;
	public User getUserId(User user) throws SQLException;
	public Collection getAllUsers() throws SQLException;
}
