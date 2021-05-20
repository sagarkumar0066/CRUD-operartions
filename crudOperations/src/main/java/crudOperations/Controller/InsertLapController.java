package crudOperations.Controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import crudOperations.dao.LaptopDao;

@WebServlet("/insertLap")
public class InsertLapController extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
       String id = req.getParameter("id");
       String brand = req.getParameter("brand");
       String generation = req.getParameter("generation");
       int ram = Integer.parseInt(req.getParameter("ram"));
       
       String str=null;
       LaptopDao ld = new LaptopDao();
       try 
       {
		   str = ld.putData(id, brand, generation, ram);
	   } catch (SQLException e) 
       {
		   e.printStackTrace();
	   }
		
		  req.setAttribute("string", str); 
		  RequestDispatcher rd=req.getRequestDispatcher("index.jsp"); 
		  rd.forward(req, res);
		 
    }
}
