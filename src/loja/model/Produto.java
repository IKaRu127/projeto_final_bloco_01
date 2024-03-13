package loja.model;

public abstract class Produto {
	
	// DECLARAÇÃO DE VARIÁVEIS
	int id;
	String nome;
	int tipo; // celular, computador, ambos
	String marca;
	float preco;
	
	
	public Produto(int id, String nome, int tipo, String marca, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}

	
	// MÉTODOS DE ACESSO - GETTERS E SETTERS
	public int getId() { //PASSIVO A SER REMOVIVEL POIS O ID SERÁ REALIZADO AUTOMATICAMENTE
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	// AÇÕES E MÉTODOS
	
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Produto para celular";
			break;
		case 2:
			tipo = "Produto para computador";
			break;
		case 3:
			tipo = "Produto para celular e computador";
		}
		
		System.out.println("\n\n*************************************************");
		System.out.println("            --DADOS DO PRODUTO--                     \n");
		//System.out.println("*************************************************");
		System.out.println("ID do produto: " + this.id);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Marca do produto: " + this.marca);
		System.out.println("Preço do produto: R$" + this.preco);		
		System.out.println("Tipo do produto: " + tipo);
	}
	
	
	
}
