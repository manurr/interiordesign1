package com.src.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.factory.factory;
import com.src.model.LivingModel;



/**
 * Servlet implementation class LivingController
 */
@WebServlet("/LivingController")
public class LivingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivingController() {
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
		LivingModel m=new LivingModel();
		try{
			m=factory.getinstance().getdesigner(name);
			request.setAttribute("Living",m);
			//System.out.println(m);
			
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		request.setAttribute("iname", name);
		request.getRequestDispatcher("second.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
