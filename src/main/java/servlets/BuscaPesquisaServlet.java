package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Pesquisa;
import servicos.ServicoDoBancoDeDados;

@WebServlet("/BuscaPesquisaServlet")
public class BuscaPesquisaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServicoDoBancoDeDados servicoBD = new ServicoDoBancoDeDados();
       
   
    public BuscaPesquisaServlet() {
        super();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doPost(req, resp);
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pesquisa pesquisa = new Pesquisa();
		pesquisa.setEmail(request.getParameter("p_email"));
		
		pesquisa = servicoBD.procurarPeloEmail(pesquisa.getEmail());
		
		RequestDispatcher rd = request.getRequestDispatcher("/atualizarPesquisa.jsp");
		request.setAttribute("pesquisa", pesquisa);
		rd.forward(request, response);
	}

}
