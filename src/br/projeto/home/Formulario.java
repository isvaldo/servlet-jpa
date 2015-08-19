package br.projeto.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/formulario")
public class Formulario extends HttpServlet{
	
	/*
	 * A Rescrita do metodo doGet 
	 * filtra as requisições do tipo GET 
	 * */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Exemplo com uso do GET
		 */
		
		Enumeration<String> parameterNames = req.getParameterNames();
		PrintWriter writer = resp.getWriter();
		
		writer.println("Lista de parametros GET");
		
		//Verifica se existe mais parametros nessa instancia
		//enquanto houver mostra na tela e vai para o proximo
		
		while(parameterNames.hasMoreElements()){
			
			String param = parameterNames.nextElement();
			String value = req.getParameter(param);
			writer.println(param+"="+value);	
		}
	
	}
	
	/**
	 *Rescrita do metodo doPost
	 *Filtro requisições do tipo POST
	 * */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Exemplo com uso do POST
		 */
		
		PrintWriter writer = resp.getWriter();
		
		
	}

}
