package com.ciq.Queries;

public interface Queries {
	
	String insert="insert into software values (?,?,?,?)";
	String update="update software set name=?,des=?,salary=? where id=?";
	String delete="delete from software where id=?";
	String GetAll="select * from software";
	String findbyid="select *from software where id=?";

}
