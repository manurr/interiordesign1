package com.src.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.factory.factory;
import com.src.model.RegisterModel;



/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String property=request.getParameter("property");
		String city=request.getParameter("city");
		String propertypin=request.getParameter("propertypin");
		String design=request.getParameter("design");
		
		
		HashMap<String,String> errors =new HashMap<>();
		
		if(name==null|name.length()<=0)
		{
			errors.put("name_error", "name must not be blank");
			
		}
		else
		{
			 request.setAttribute("name", name);
		}
		
		if(email==null|email.length()<=0)
		{
			errors.put("email_error", "email must not be blank");
			
		}
		else
		{
			 request.setAttribute("email",email);
		}
		if(mobile==null|mobile.length()<=0|mobile.length()>10)
		{
			errors.put("mobile_error","mobile must not be blank");
			
		}
		else
		{
			 request.setAttribute("mobile",mobile);
        }
		if(property==null|property.length()<=0)
		{
			errors.put("property_error","property must not be blank");
			
		}
		else
		{
			 request.setAttribute("property",property);
		}
		if(city==null|city.length()<=0)
		{
			errors.put("city_error","city must not be blank");
			
		}
		else
		{
			 request.setAttribute("city",city);
		}
		if(propertypin==null|propertypin.length()<=0)
		{
			errors.put("propertypin_error","propertypin must not be blank");
			
		}
		else
		{
			 request.setAttribute("propertypin",propertypin);
		}
		
		if(design==null|design.length()<=0)
		{
			errors.put("design_error","design must not be blank");
			
		}
		else
		{
			 request.setAttribute("design",design);
		}
		
		
		if(errors.isEmpty()){
			
			RegisterModel rm=new RegisterModel();
			rm.setName(name);
			rm.setEmail(email);
			rm.setMobile(mobile);
			rm.setProperty(property);
			rm.setCity(city);
			rm.setPropertypin(propertypin);
			rm.setDesign(design);
			try{
				int row=factory.getinstance().insert(rm);
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			request.setAttribute("registerdata",rm);
			request.getRequestDispatcher("Thank.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("errors", errors);
				request.getRequestDispatcher("enter.jsp").forward(request, response);
			}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
