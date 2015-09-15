package br.infnet.prova.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/server")
public class Server extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		Questoes questoes = new Questoes(request,response);
		
		if (acao != null) {
			switch (acao) {
			case "questao1":
				questoes.questao1();
				break;
				
			case "questao2":
				questoes.questao2();
				break;
				
			case "questao3":
				questoes.questao3();
				break;
				
			default:
				break;
			}

		}

	}

}
