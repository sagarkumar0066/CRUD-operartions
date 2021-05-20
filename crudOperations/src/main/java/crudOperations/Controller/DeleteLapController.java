package crudOperations.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudOperations.dao.LaptopDao;

@WebServlet("/deleteLap")
public class DeleteLapController extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
	   String id = req.getParameter("id");
	   
	   String str =null;
	try 
	{
		str = new LaptopDao().deleteData(id);
	}
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	   RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
	   rd.forward(req, res);
   }
}
