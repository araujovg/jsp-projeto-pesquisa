package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicos.ServicoDoBancoDeDados;

/**
 * Servlet implementation class ExcluirPesquisaServlet
 */
@WebServlet("/ExcluirPesquisaServlet")
public class ExcluirPesquisaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServicoDoBancoDeDados servicoBd = new ServicoDoBancoDeDados();
	
    public ExcluirPesquisaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 	int id = Integer.parseInt(request.getParameter("p_id"));
	 	servicoBd.deletar(id);
	 	
	 	RequestDispatcher rd = request.getRequestDispatcher("/listarPesquisas.jsp");
		request.setAttribute("pesquisas", servicoBd.procurarTodos());
		rd.forward(request, response);
	 	
	}

}
