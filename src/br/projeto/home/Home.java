package br.projeto.home;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.projeto.modelo.Pessoa;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// no get ... redireciona para view
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/paginas/jpa.html");
			requestDispatcher.forward(request,response);
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		pessoa.setAgencia(request.getParameter("agencia"));
		pessoa.setTitular(request.getParameter("titular"));
		pessoa.setBanco(request.getParameter("banco"));
		
		// persistencia
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("banco");

		EntityManager manager = entityManagerFactory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(pessoa);
		manager.getTransaction().commit();
		

		manager.close();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/paginas/formulario.html");
		requestDispatcher.forward(request,response);
	}

}
