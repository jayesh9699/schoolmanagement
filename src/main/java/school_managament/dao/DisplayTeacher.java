package school_managament.dao;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;

import school_managament.Teacher;
@WebServlet("/display1")
public class DisplayTeacher extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query q=em.createQuery("select s from Teacher s");
		List<Teacher>st=q.getResultList();
		
		HttpSession hs=req.getSession();
		hs.setAttribute("teacher", st);
		
		RequestDispatcher rd=req.getRequestDispatcher("/TeacherDeatails.jsp");
		rd.forward(req, resp);
		
	}
}


