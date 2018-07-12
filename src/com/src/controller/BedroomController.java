package com.src.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.factory.factory;
import com.src.model.BedroomModel;
import com.src.model.LivingModel;

/**
 * Servlet implementation class BedroomController
 */
@WebServlet("/BedroomController")
public class BedroomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BedroomController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("imagename");
		System.out.println(name);
		BedroomModel m=new BedroomModel();
		try{
			m=factory.getinstance().getbeddesigner(name);
			request.setAttribute("Bedroom",m);
			//System.out.println(m);
			
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		request.setAttribute("iname", name);
		request.getRequestDispatcher("second1.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
