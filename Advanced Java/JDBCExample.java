package com.jdbexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Connection c = null;
		try {
			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Enter the ID you want to retreive");
			int id = s.nextInt();

			// 2.establish connection
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "MySQL123$$");

			// 3.create statement
			// Statement s1=c.createStatement();

			PreparedStatement ps = c.prepareStatement("select * from emp where id =? ");
			ps.setInt(1, id);
			// execute query
			// s.executeUpdate("insert into emp
			// values(4,'guna',1023)");//insert,update,delete
			// System.out.println("inserted");

			// Getting data from Database
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				System.out.println("ID =" + rs.getInt(1));
				System.out.println("Name =" + rs.getString("name"));
				System.out.println("Salary =" + rs.getDouble("sal"));
			} else {
				System.out.println("Id not found");
			}
			// update query
			// s.executeUpdate("update emp set name='dingi' wher id=3");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException b) {
			b.printStackTrace();
		} finally {
try {
	if(c!= null)
	{
	c.close();
	System.out.println("Connection closed successfully");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}

	}
}
