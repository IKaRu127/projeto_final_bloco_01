package loja.controller;

import java.util.ArrayList;

import loja.model.Produto;
import loja.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	// VARIÁVEIS
	public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int num = 0;
	
	
	//PROCURAR PRODUTOS PELO ID
	@Override
	public void procurarPorId(int numero) {
		var produto = buscarNaLista(numero);
		if(produto != null) { //mudança verificar
			produto.visualizar();
		} else {
			System.out.println("\nO produto com o ID " + numero + " não foi encontrado!");
		}
		
	}
		//CADASTRAR PRODUTO
		
		@Override
		public void cadastrarProduto(Produto produto) {
			listaProdutos.add(produto);
			System.out.println("\n O produto " + produto.getNome() + " foi cadastrado com sucesso!");
		}
	
		//LISTAR PRODUTOS
		@Override
		public void listarProdutos() {
			for(var produto: listaProdutos) {
				produto.visualizar();
			}
		}
		
		// ATUALIZAR PRODUTO
		@Override
		public void atualizarProduto(Produto produto) {
			var buscaProduto = buscarNaLista(produto.getId());
			
			if(buscaProduto != null) {
				listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
				System.out.println("\nO produto com ID: " + produto.getId() + " foi atualizado!");
			} else {
				System.out.println("\nO produto com ID: " + produto.getId() + " não foi encontrado! Tente novamente");
			}
			
		}
		
		// DELETAR PRODUTO
		
		@Override
		public void deletarProduto(int numero) {
			var produto = buscarNaLista(numero);
			if(produto != null) {
				if(listaProdutos.remove(produto) == true) {
					System.out.println("\nO produto do ID: " + numero + " foi excluído com sucesso!");
				} else {
					System.out.println("\nO produto com ID: " + numero + " não foi encontrado! Tente novamente");
				}
			}
			
		}
		
		
		
		
		public Produto buscarNaLista(int numero) {
			for (var produto : listaProdutos) {
				if(produto.getId() == numero) return produto;
			}
			
			return null;
		}	
	
}
