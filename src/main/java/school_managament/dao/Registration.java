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

import school_managament.Principal;

@WebServlet("/ca")
public class Registration extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phnno=req.getParameter("phn");
		String pass=req.getParameter("pass");
		
		Principal p=new Principal(name, email, phnno, pass);
		
		et.begin();
		em.persist(p);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Account Created.....");
		RequestDispatcher rd=req.getRequestDispatcher("loginform.html");
		rd.include(req, resp);
		resp.setContentType("text/html");
		
	}
	
	
}
