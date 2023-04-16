package servicos;

import java.util.List;

import entidades.Banco;
import entidades.Pesquisa;

public class ServicoDoBancoDeDados {
	
	Banco banco = new Banco();
	
	public Pesquisa salvar(Pesquisa pesquisa) {
		
		List<Pesquisa> pesquisas = procurarTodos();
		if(!pesquisas.isEmpty()) {
			Pesquisa ultimaPesquisa = pesquisas.get(pesquisas.size() - 1);
			pesquisa.setId(ultimaPesquisa.getId() + 1);
			return banco.salvar(pesquisa);
		}
		else {
			pesquisa.setId(1);
			return banco.salvar(pesquisa);
		}
	}
	
	public Pesquisa atualizar(Pesquisa pesquisaPopulada) {
		return banco.atualizar(pesquisaPopulada);
	}
	
	public void deletar(int id) {
		banco.deletar(id);
	}
	
	public List<Pesquisa> procurarTodos(){
		return banco.getPesquisas();
	}
	
	public Pesquisa procurarPeloId(int id) {
		return banco.procurarPeloId(id);
	}
	
	public Pesquisa procurarPeloEmail(String email) {
		return banco.procurarPeloEmail(email);
	}
	
}
