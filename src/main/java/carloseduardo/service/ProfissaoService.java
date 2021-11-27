package carloseduardo.service;

import java.util.List;

import carloseduardo.domain.Profissao;

public interface ProfissaoService {

	void salvar(Profissao profissao);
	
	void editar(Profissao profissao);
	
	void excluir(Long id);
	
	Profissao buscarPorId(Long id);
	
	List<Profissao> buscarTodos();

	boolean profissaoTemCliente(Long id);
}