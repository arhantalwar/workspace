package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class DAO {
	
	String db_username = "root";
	String db_password = "%100@Sql.com";
	
	// db_allowed_students_validate_start
	
	String db_allowed_members_url = "jdbc:mysql://localhost:3306/allowed_students";
	String sql_EmailAuthChecker = "select * from allowed_members where email=? and Authokey=?";
	
	public boolean EmailAuthChecker(String email, String authokey) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_allowed_members_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_EmailAuthChecker);
			st.setString(1, email);
			st.setString(2, authokey);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	//db_allowed_students_validate_end
	
	
	//db_reg_students_validate_start
	
	String db_reg_members_url = "jdbc:mysql://localhost:3306/reg_students";
	String sql_AddUserData = "insert into reg_members (First_Name, Last_Name, Email_SGGS, uname, pass) values(?,?,?,?,?)";
	
	public void addUserData(String firstName, String lastName, String email, String username, String password) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_reg_members_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_AddUserData);
			st.setString(1, firstName);
			st.setString(2, lastName);
			st.setString(3, email);
			st.setString(4, username);
			st.setString(5, password);
			st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//db_reg_students_validate_end
	
	//db_reg_students_validate_login_start
	
	String db_reg_members_login_url = "jdbc:mysql://localhost:3306/reg_students";
	String sql_LoginUsernamePasswordChecker = "select * from reg_members where uname=? and pass=?";
	
	public boolean LoginUsernamePasswordChecker(String username, String password) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_reg_members_login_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_LoginUsernamePasswordChecker);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			return false;
		
	}
	
	//db_reg_students_validate_login_end
	
	//db_reg_students_change_state_online_start
	
	String db_reg_members_state_online_url = "jdbc:mysql://localhost:3306/reg_students";
	String sql_State_online = "update reg_members set state=? where uname=?";
	
	public void state_online(String username) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_reg_members_state_online_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_State_online);
			st.setString(1, "online");
			st.setString(2, username);
			st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//db_reg_students_change_state_online_end
	
	//db_reg_students_change_state_offline_start
	
	String db_reg_members_state_offline_url = "jdbc:mysql://localhost:3306/reg_students";
	String sql_State_offline = "update reg_members set state=? where uname=?";
	
	public void state_offline(String username) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_reg_members_state_offline_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_State_offline);
			st.setString(1, "offline");
			st.setString(2, username);
			st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//db_reg_students_change_state_offline_end
	
	//db_reg_students_fetch_first_name_start
	
	String db_reg_members_fetch_first_name_url = "jdbc:mysql://localhost:3306/reg_students";
	String sql_fetch_first_name = "select uname from reg_members";
	
	public void FirstName(LinkedList<String> FirstName) {
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_reg_members_fetch_first_name_url, db_username, db_password);
			PreparedStatement st = con.prepareStatement(sql_fetch_first_name);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				
				String FirstN = rs.getString("uname");
				FirstName.add(FirstN);
			
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
