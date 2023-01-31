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
@WebServlet("/rmvstd")
public class RemoveStudent extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		Student s1=em.find(Student.class, id);
		
		et.begin();
		em.remove(s1);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write( "Student Removed....." );
		RequestDispatcher rd=req.getRequestDispatcher("Option.html");
		rd.include(req, resp);
		resp.setContentType("text/html");
		
		
		
		
	}
	
}
