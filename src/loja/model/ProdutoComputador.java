package loja.model;

public class ProdutoComputador extends Produto{
	
	// VARIÁVEIS
	String tipoComputador;
	
	// MÉTODOO CONSTRUTOR
	public ProdutoComputador(int id, String nome, int tipo, String marca, float preco, String tipoComputador) {
		super(id, nome, tipo, marca, preco);
		this.tipoComputador = tipoComputador;		
	}

	
	// MÉTODOS GETTERS AND SETTERS
	public String getTipoComputador() {
		return tipoComputador;
	}

	public void setTipoComputador(String tipoComputador) {
		this.tipoComputador = tipoComputador;
	}
	
	// AÇÕES E MÉTODOS ESPECÍFICOS
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo do computador: " + this.tipoComputador);
		System.out.println("*************************************************");
		System.out.println("                                                           ");
	}
	

	
}
