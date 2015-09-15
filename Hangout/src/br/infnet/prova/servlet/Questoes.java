package br.infnet.prova.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.infnet.prova.dao.DAOFuncionario;
import br.infnet.prova.model.Funcionario;

public class Questoes {

	private HttpServletRequest request;
	private HttpServletResponse response;

	public Questoes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;

	}

	public void questao1() throws ServletException, IOException {
		String strNumero = request.getParameter("numero");
		int numero = Integer.parseInt(strNumero);
		String resposta;
		if (numero%3 ==0) {
			resposta = "O Numero "+strNumero+" é divisivel por 3";
		}else {
			resposta = "O Numero "+strNumero+" não é divisivel por 3";
		}
		request.setAttribute("resposta",resposta);
		request.getRequestDispatcher("questao1/index.jsp").forward(request, response);
	}
	
	public void questao2() throws ServletException, IOException {
		String strAltura = request.getParameter("altura");
		String strPeso = request.getParameter("peso");
		Double altura = new Double(strAltura);
		Double peso = new Double(strPeso);
		Double IMC = peso/(altura*altura);
		String resposta = String.format("IMC= %1$,.2f", IMC);
		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("questao2/index.jsp").forward(request, response);
	}

	public void questao3() throws ServletException, IOException {
		
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setMatricula(matricula);
		funcionario.setNome(nome);
		funcionario.setEndereco(endereco);
		funcionario.setTelefone(telefone);
		
		DAOFuncionario dao = new DAOFuncionario();
		
		dao.insertFuncionario(funcionario);
		
		request.setAttribute("resposta", "Adicionado com sucesso");
		request.getRequestDispatcher("questao3/index.jsp").forward(request, response);
		
	}

}
