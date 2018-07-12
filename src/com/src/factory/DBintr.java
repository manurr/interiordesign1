package com.src.factory;

import java.sql.SQLException;

import com.src.model.BedroomModel;
import com.src.model.DiningModel;
import com.src.model.LivingModel;
import com.src.model.RegisterModel;

public interface DBintr {
	public int insert(RegisterModel rm1) throws SQLException;
	 public LivingModel getdesigner(String name) throws SQLException;
	 public BedroomModel getbeddesigner(String name) throws SQLException;
	 public DiningModel getkitdesigner(String name) throws SQLException;

}
