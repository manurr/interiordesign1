package com.src.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.src.model.BedroomModel;
import com.src.model.DiningModel;
import com.src.model.LivingModel;
import com.src.model.RegisterModel;

public class DBImp implements DBintr {
	static Connection c;
	static ResultSet r;
	static 
	{
		try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
         c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle1234");
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
	}
	public int insert(RegisterModel rm1) throws SQLException
	{
		PreparedStatement pst;
		
			pst = c.prepareStatement("insert into register_design values(?,?,?,?,?,?,?)");
			pst.setString(1,rm1.getName());
			pst.setString(2,rm1.getEmail());
			pst.setString(3,rm1.getMobile());
			pst.setString(4,rm1.getProperty());
			pst.setString(5,rm1.getCity());
			pst.setString(6,rm1.getPropertypin());
			pst.setString(7,rm1.getDesign());
			
			return pst.executeUpdate();
		} 
	
	 public LivingModel getdesigner(String name) throws SQLException {
		 
		 
		 PreparedStatement pst=c.prepareStatement("select * from living where name=?");
		 pst.setString(1,name);
		 ResultSet r=pst.executeQuery();
		LivingModel m=new LivingModel();
		while(r.next())
        {
			 m.setName(r.getString(1));
			 m.setDesigner_name(r.getString(2));
			 m.setContact_number(r.getString(3));
			 m.setMail_id(r.getString(4));
			 m.setExperience(r.getString(5));
			 m.setImplement_aprox_cost(r.getString(6));
        }
			 
		 return m;
	         
	 }
	 
	 
public BedroomModel getbeddesigner(String name) throws SQLException {
		 
		 
		 PreparedStatement pst=c.prepareStatement("select * from bedroom where name=?");
		 pst.setString(1,name);
		 ResultSet r=pst.executeQuery();
		 BedroomModel m=new BedroomModel();
		while(r.next())
        {
			 m.setName(r.getString(1));
			 m.setDesigner_name(r.getString(2));
			 m.setContact_number(r.getString(3));
			 m.setMail_id(r.getString(4));
			 m.setExperience(r.getString(5));
			 m.setImplement_aprox_cost(r.getString(6));
        }
			 
		 return m;
	         
	 }
		

public DiningModel getkitdesigner(String name) throws SQLException {
	 
	 
	 PreparedStatement pst=c.prepareStatement("select * from dining where name=?");
	 pst.setString(1,name);
	 ResultSet r=pst.executeQuery();
	 DiningModel m=new DiningModel();
	while(r.next())
   {
		 m.setName(r.getString(1));
		 m.setDesigner_name(r.getString(2));
		 m.setContact_number(r.getString(3));
		 m.setMail_id(r.getString(4));
		 m.setExperience(r.getString(5));
		 m.setImplement_aprox_cost(r.getString(6));
   }
		 
	 return m;
        
}
	
	
}
