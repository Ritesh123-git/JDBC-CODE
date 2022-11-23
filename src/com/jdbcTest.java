package com;

import java.sql.*;
import java.util.Scanner;
public class jdbcTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Ritesh@123");
			System.out.println("Connection establish successfully");
			Statement stmt=con.createStatement();
			System.out.println("Statement is ready");
			
			
			// insert operation
//			int res=stmt.executeUpdate("insert into employee values(7,'sam curran',12000)");
//			if(res>0) {
//				System.out.println("Record inserted Successfully");
//			}
			
			
			// delete operation
//			int res=stmt.executeUpdate("delete from employee where id=1");
//			if(res>0) {
//				System.out.println("record deleted successfully");
//			}
//			else {
//				System.out.println("record not present");
//			}
			
			
			// update operation
//			int res=stmt.executeUpdate("update employee set salary=100000 where id=5");
//			if(res>0) {
//				System.out.println("record updated successfully");
//			}
//			else {
//				System.out.println("record not updated");
//			}
			
			
			// Retrieve query
//			ResultSet rs= stmt.executeQuery("select *from employee");
//			while(rs.next()) {
//				System.out.println("id id "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			}
			
			Scanner obj= new Scanner(System.in);
			// insert operation using PreparedStatement
			
			
//			PreparedStatement pstmt= con.prepareStatement("insert into employee values(?,?,?)");
//			System.out.println("Enter the id");
//			int id=obj.nextInt();
//			pstmt.setInt(1,id);
//			System.out.println("Enter the name");
//			String name=obj.next();
//			pstmt.setString(2, name);
//			System.out.println("Enter the salary");
//			float salary= obj.nextFloat();
//			pstmt.setFloat(3, salary);
			
			// insert query
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			// delete query
//			PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?");
//			System.out.println("enter the id to delete the record ");
//			int id=obj.nextInt();
//			pstmt.setInt(1,id);
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record deleted successfully");
//			}
//			else {
//				System.out.println("record not present");
//			}
			
			
			// updateQuery
//			PreparedStatement pstmt=con.prepareStatement("update employee set name='sherdil' where id=?");
//			System.out.println("enter the id to update the record ");
//			int id=obj.nextInt();
//			pstmt.setInt(1,id);
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record updated successfully");
//			}
//			else {
//				System.out.println("record not present");
//			}
//			
			
			PreparedStatement pstmt= con.prepareStatement("select * from employee");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("id id "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
