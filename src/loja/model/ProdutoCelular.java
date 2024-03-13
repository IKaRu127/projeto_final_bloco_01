package loja.model;

public class ProdutoCelular extends Produto{
	
	// VÁRIAVEIS
	String marcaCelular;
	
	// MÉTODO CONSTRUTOR
	public ProdutoCelular(int id, String nome, int tipo, String marca, float preco, String marcaCelular) {
		super(id, nome, tipo, marca, preco);
		this.marcaCelular = marcaCelular;		
	}

	
	// MÉTODOS DE ACESSO - GETTERS E SETTERS
	
	public String getMarcaCelular() {
		return marcaCelular;
	}

	public void setMarcaCelular(String marcaCelular) {
		this.marcaCelular = marcaCelular;
	}
	
	// AÇÕES E MÉTODOS ESPECÍFICOS
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Marca do celular: " + this.marcaCelular);
		System.out.println("*************************************************");
		System.out.println("                                                           ");
	}
	

}
