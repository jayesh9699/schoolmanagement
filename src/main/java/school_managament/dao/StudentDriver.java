package school_managament.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_managament.Student;
@WebServlet("/student")
public class StudentDriver extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String name=req.getParameter("name");
		String stream=req.getParameter("stream");
		String fees=req.getParameter("fees");
		
		Student s=new Student(name, stream, fees);
		
		et.begin();
		em.persist(s);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write( "\n\n\nStudent Addded....." );
		RequestDispatcher rd=req.getRequestDispatcher("Option.html");
		rd.include(req, resp);
		resp.setContentType("text/html");
		
		
	}
}
