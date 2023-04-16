package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Banco;
import entidades.Pesquisa;
import servicos.ServicoDoBancoDeDados;

@WebServlet("/ListarPesquisasServlet")
public class ListarPesquisasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServicoDoBancoDeDados servicoBd = new ServicoDoBancoDeDados();

    public ListarPesquisasServlet() {
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doPost(req, resp);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/listarPesquisas.jsp");
		request.setAttribute("pesquisas", servicoBd.procurarTodos());
		rd.forward(request, response);
	}

}
