package crudOperations.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LaptopDao 
{
	public Connection dbCon()
	   {
		   String url = "jdbc:mysql://localhost:3306/javalearn";
		   String name="root";
		   String pass="XAEA-12@mysql";
		   Connection con=null;
		   
		   try 
		   {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.getConnection(url,name,pass);
		   } 
		   catch (Exception e) 
		   {
			   e.printStackTrace();
		   }
		   
		   
		   return con;
	   }
	public String putData(String id, String brand, String generation, int ram) throws SQLException
	   {   
	       String query = "insert into Laptop values(?,?,?,?)";
		   
		   PreparedStatement ps = new LaptopDao().dbCon().prepareStatement(query);
		   ps.setString(1, id);
		   ps.setString(2, brand);
		   ps.setString(3, generation);
		   ps.setInt(4, ram);
		   
		   ps.executeUpdate();
		   
		   return "Inserted data...";
	   }
	public String deleteData(String id) throws SQLException
	   {
	      String query = "delete from Laptop where id=?";
		   
		   PreparedStatement ps = new LaptopDao().dbCon().prepareStatement(query);
		   ps.setString(1, id);
		   
		   ps.executeUpdate();
		   
		   return "Delete data...";
	   }
	public ResultSet getData() throws SQLException
	   {
	      String query = "select * from Laptop";
		   
		   PreparedStatement ps = new LaptopDao().dbCon().prepareStatement(query);  
		   ResultSet rs = ps.executeQuery();
		   
		   return rs;
	   }
	public ResultSet getData(String id) throws SQLException
	   {
	      String query = "select * from Laptop where id=?";
		   
		   PreparedStatement ps = new LaptopDao().dbCon().prepareStatement(query); 
		   ps.setString(1, id);
		   ResultSet rs = ps.executeQuery();
		   
		   return rs;
	   }
	public String UpdateData(String id, String brand, String gen, int ram) throws SQLException
	   {
	      String query = "update Laptop set id=?,brand=?,generation=?,ram=? where id='"+id+"'";
		   
		   PreparedStatement ps = new LaptopDao().dbCon().prepareStatement(query);
		   ps.setString(1, id);
		   ps.setString(2, brand);
		   ps.setString(3, gen);
		   ps.setInt(4, ram);
		   //ps.setString(5,id);
		   
		   ps.executeUpdate();
		   
		   return "updated data...";
	   }
}
