package com.src.factory;

import com.src.*;


public class factory {
	private factory(){}
	static DBintr d;
	public static  DBintr getinstance(){
	   d=new DBImp();
	   return d;

}
}
