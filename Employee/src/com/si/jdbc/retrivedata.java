package com.si.jdbc;
import java.sql.*;
public class retrivedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM Employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString("empname");
			    int age = result.getInt("empage");
			    int salary = result.getInt("empsalary");
			    String gender = result.getString("empgender");
			 
			    String output = "User #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, name, age, salary, gender));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
