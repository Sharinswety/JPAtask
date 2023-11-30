package com.example.demo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.example.demo.Model.CreateModel;
import com.example.demo.Model.Response;
import com.example.demo.service.ServicePts;

@Component
public class DaoPts implements ServicePts {
	Response res = new Response();
	
	String url="jdbc:mysql://127.0.0.1:3306/tansation";
	String username="root";
    String password="Myking@123";
@Override	
public Response newstudent(CreateModel datas) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement();) {
			String insertQuery="insert into student(id,name,dept)"
					+"values("+datas.getId()+",'"+datas.getName()+"','"+datas.getDept()+"');";
		st.executeUpdate(insertQuery);
		
		res.setResMsg("Success");
		res.setResCode(200);
		res.setData("New Student data is created");
		
		} catch (Exception e) {
			e.printStackTrace();
			
			res.setResMsg("error");
			res.setResCode(500);
			res.setData("Check query");
		}
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	
	return res;
}
}
