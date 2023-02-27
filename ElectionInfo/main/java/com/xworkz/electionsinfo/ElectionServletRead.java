package com.xworkz.electionsinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.electionsinfo.dto.ElectionsInfoDto;
import com.xworkz.electionsinfo.service.ElectionInfoServiceImpl;
import com.xworkz.electionsinfo.service.ElectionsInfoService;

@WebServlet(value="/electionsFormRead")
public class ElectionServletRead extends HttpServlet {

	ElectionsInfoService service=new ElectionInfoServiceImpl();	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
	PrintWriter	out=res.getWriter();
	
List<ElectionsInfoDto> list=service.readAll();

out.print("<Table>");
for(ElectionsInfoDto dto:list) {

	
	out.print("<tr>");
	out.print("<td>");
	out.print(dto.getId());
	out.print("</td>");
	
out.print("<tr>");
out.print("<td>");
out.print(dto.getName());
out.print("</td>");


out.print("<tr>");
out.print("<td>");
out.print(dto.getAdrress());
out.print("</td>");

out.print("<tr>");
out.print("<td>");
out.print(dto.getAge());
out.print("</td>");

out.print("<tr>");
out.print("<td>");
out.print(dto.getMobileNo());
out.print("</td>");

out.print("<tr>");
out.print("<td>");
out.print(dto.getPinCode());
out.print("</td>");

}
	
out.print("</Table>");	
out.print("Data is reading succesfully");
out.print(list);
	
	}	
	
}
