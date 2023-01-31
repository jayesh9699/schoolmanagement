package school_managament.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import school_managament.Principal;
@WebServlet("/login")
public class Driver extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		String email=req.getParameter("email");		
		String pass=req.getParameter("pass");

		Query q=em.createQuery("select c from Principal c where c.email='"+email+"' and c.password='"+pass+"'");
		List<Principal>check=q.getResultList();
		
		if (!check.isEmpty()) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
		else 
		{
			PrintWriter pw=resp.getWriter();
			pw.write("Invalid Credintials");
			RequestDispatcher rd=req.getRequestDispatcher("loginform.html");
			rd.include(req, resp);
			resp.setContentType("text/html");
		}
	}
	
		
}
