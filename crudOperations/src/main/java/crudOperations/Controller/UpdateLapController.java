package crudOperations.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudOperations.dao.LaptopDao;

@WebServlet("/updateLap")
public class UpdateLapController extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   String brand="",gen="",ram="";
	   String id = req.getParameter("id");
	   LaptopDao ld = new LaptopDao();
	   
	   try 
	   {
		   ResultSet rs = ld.getData(id);
		   
		   while(rs.next())
		   {
			   brand = rs.getString(2);
			   gen=rs.getString(3);
			   ram = rs.getString(4);		   
		   }
	   } 
	   catch (SQLException e) 
	   {
	    	e.printStackTrace();
	   }
	   
	   req.setAttribute("id", id);
	   req.setAttribute("brand", brand);
	   req.setAttribute("gen", gen);
	   req.setAttribute("ram",ram);
	   
	   RequestDispatcher rd = req.getRequestDispatcher("UpdateLap1.jsp");
	   rd.forward(req, res);
   }
   
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   String id = req.getParameter("id");
	   String brand = req.getParameter("brand");
	   String gen = req.getParameter("generation");
	   int ram = Integer.parseInt(req.getParameter("ram"));
	   
	   UpdateLapController ul = new UpdateLapController();
	   
	   LaptopDao ld = new LaptopDao();
	   try 
	   {
		 ld.UpdateData(id, brand, gen, ram);
	   }
	   catch (SQLException e) 
	   {
		 e.printStackTrace();
	   }
	   
	   RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
	   rd.forward(req, res);
	   
   }
}
