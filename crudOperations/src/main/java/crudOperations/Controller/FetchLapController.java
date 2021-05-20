package crudOperations.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudOperations.dao.LaptopDao;

@WebServlet("/fetchLap")
public class FetchLapController extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   ResultSet rs = null;
	   try 
	   {
		  rs = new LaptopDao().getData();
	   } 
	   catch (SQLException e) 
	   {
		 e.printStackTrace();
	  }
	   
	   req.setAttribute("rs", rs);
	   RequestDispatcher rd = req.getRequestDispatcher("GetData.jsp");
	   rd.forward(req, res);
   }
}
