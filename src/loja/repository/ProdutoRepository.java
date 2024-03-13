package loja.repository;

import loja.model.Produto;

public interface ProdutoRepository {

	//CRUD DOS PRODUTOS
	
	public void procurarPorId(int id);
	public void listarProdutos();
	public void cadastrarProduto(Produto produto);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(Produto produto);
	
	//MÉTODOS GERAIS
	
}
