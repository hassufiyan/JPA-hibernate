package com.xworkz.electionsinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;
import com.xworkz.electionsinfo.service.ElectionInfoServiceImpl;
import com.xworkz.electionsinfo.service.ElectionsInfoService;

@WebServlet(value="/electionsave")
public class ElectionServletSave extends HttpServlet {
	
ElectionsInfoService service=new ElectionInfoServiceImpl();	
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	res.setContentType("text/html");
PrintWriter	out=res.getWriter();

out.print("get method is used to readAll operation");

}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	res.setContentType("text/html");
PrintWriter	out=res.getWriter();

String name=req.getParameter("name");
String adress=req.getParameter("address");
String age=req.getParameter("age");
String number=req.getParameter("number");
String pincode=req.getParameter("pincode");

ElectionsInfoDto dto=new ElectionsInfoDto(name, adress, age, number, pincode);
boolean status=service.save(dto);
out.print(status);
System.out.println(status);

if(status) {
	req.getRequestDispatcher("read.jsp").forward(req, res);

}

else {
	
	req.getRequestDispatcher("ElectionsInfoForm.jsp").include(req, res);
	out.print("data not saved,please recheck");
	}
   
}
}
