package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Banco;
import entidades.Pesquisa;
import servicos.ServicoDoBancoDeDados;

@WebServlet("/PesquisaInclusaoServlet")
public class PesquisaInclusaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServicoDoBancoDeDados servicoBd = new ServicoDoBancoDeDados();

    public PesquisaInclusaoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pesquisa pesquisa = new Pesquisa();
		pesquisa.setNome(request.getParameter("p_nome"));
		pesquisa.setEmail(request.getParameter("p_email"));
		pesquisa.setSexo(request.getParameter("p_sexo"));
		pesquisa.setCheck1(request.getParameter("p_ck1"));
		pesquisa.setCheck2(request.getParameter("p_ck2"));
		pesquisa.setCheck3(request.getParameter("p_ck3"));
		pesquisa.setEstadoCivil(request.getParameter("p_estadoCivil"));
		Pesquisa pesquisaSalva = servicoBd.salvar(pesquisa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listarPesquisas.jsp");
		request.setAttribute("pesquisas", servicoBd.procurarTodos());
		rd.forward(request, response);
	}

}
