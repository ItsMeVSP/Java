package com.jdbexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Batch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Connection c = null;
		System.out.println("Enter the count");
		int count=s.nextInt();
		try {
			// 1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "MySQL123$$");
			PreparedStatement ps = c.prepareStatement("insert into emp values(?,?,?)");
			for(int i=1;i<=count;i++)
			{
			System.out.println("Enter id");
			int id=s.nextInt();
			System.out.println("Enter name");
			String name=s.next();
			System.out.println("Enter sal");
			double sal=s.nextDouble();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, sal);
			
			ps.addBatch();
			}
	ps.executeBatch();
	System.out.println(count+" - data inserted");
	
		}
	 catch (ClassNotFoundException e) {
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
		}}}
