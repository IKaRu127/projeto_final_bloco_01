package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.ProdutoController;
import loja.model.ProdutoCelular;
import loja.model.ProdutoComputador;
import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
		
		//TESTES COM MÉTODOS DA LOJA
		ProdutoCelular procelu1 = new ProdutoCelular(1,"Fone de ouvido",1,"Samsung",44.99f,"todas");
		ProdutoCelular procelu2 = new ProdutoCelular(2,"Capinha",1,"Sem marca",10.50f,"Iphone");
		ProdutoComputador propc1 = new ProdutoComputador(3,"Microfone",2,"ECHO",49.90f, "todos");
		ProdutoComputador propc2 = new ProdutoComputador(4,"Monitor",2,"BlueCase",1400f, "Computador Desktop");
		produtos.cadastrarProduto(procelu1);
		produtos.cadastrarProduto(procelu2);
		produtos.cadastrarProduto(propc1);
		produtos.cadastrarProduto(propc2);
		
		// VÁRIAVEIS
		Scanner leia = new Scanner(System.in);
		int opcao = 0, tipo, idProduto, idProcura;
		String nome, marca, tipoComputador, marcaCelular;
		float preco;
		int idInicio = 4;
		
		
		while (opcao != 6) {
			
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("                  LOJA SUPERGADGETS                       ");
			System.out.println("                                                          ");
			System.out.println(" Só nas SuperGadgets você encontra acessórios de QUALIDADE");
			System.out.println("         por um preço BEM MENOR que no mercado!           ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("                                                          ");
			System.out.println("        SELECIONE UMA OPÇÃO PARA GESTÃO DE PRODUTOS       ");
			System.out.println("                                                          ");
			System.out.println("            [1] - Cadastrar produto                       ");
			System.out.println("            [2] - Listar produtos cadastrados             ");
			System.out.println("            [3] - Procurar produto                        ");
			System.out.println("            [4] - Atualizar produto                       ");
			System.out.println("            [5] - Excluir produto                         ");
			System.out.println("            [6] - Sair                                    ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("Selecione a opção desejada:                               ");
			System.out.println("                                                          " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			} catch(InputMismatchException error) {
				System.out.println("\n Digite apenas números inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			
			if (opcao == 6) {
				// SAIR DO PROGRAMA
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAgradecemos sua visita! \nSuperGadgets");
				leia.close();
				System.exit(0);
			}
			
			
			
			switch(opcao) {
				case 1: 
					System.out.println(Cores.TEXT_WHITE_BOLD +  "  -CADASTRAR PRODUTO-\n\n");
					System.out.print("Digite o nome do produto ==> ");
					nome = leia.next();
					do {
						System.out.println("Digite o tipo do produto: \n[1] - Produto para celular \n[2] - Produto para computador");
						tipo = leia.nextInt();
					} while(tipo <1 && tipo > 2);
					
					System.out.print("Digite a marca do produto ==> ");
					marca = leia.next();
					System.out.print("Digite o preço do produto ==> ");
					preco = leia.nextFloat();	
					
					switch(tipo) {
						case 1 -> {
							System.out.print("Digite a marca de celular compatível com o produto(se for compatível com todos os celulares, digite 'todas') ==> ");
							marcaCelular = leia.next();
							idInicio += 1;
							idProduto = idInicio;
							produtos.cadastrarProduto(new ProdutoCelular(idProduto, nome, tipo, marca, preco, marcaCelular));
						}
						case 2 -> {
							System.out.print("Digite o tipo de computador(notebook ou desktop) compatível com o produto (se for compatível com todos, digite 'todos') ==> ");
							tipoComputador = leia.next();
							idInicio += 1;
							idProduto = idInicio;
							produtos.cadastrarProduto(new ProdutoComputador(idProduto, nome, tipo, marca, preco, tipoComputador));
						}	
					}
					
					keyPress();
					break;
					
				case 2:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -LISTAR PRODUTOS CADASTRADOS-\n\n");
					produtos.listarProdutos();
					keyPress();
					break;                           
				
				case 3:                
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -PROCURAR PRODUTO-\n\n");
					System.out.print("Digite o ID do produto procurado ==> ");
					idProcura = leia.nextInt();
					produtos.procurarPorId(idProcura);
					keyPress();
					break;            
				
				case 4:                
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -ATUALIZAR PRODUTO-\n\n");
					System.out.print("Digite o ID do produto para atualizar ==> ");
					idProcura = leia.nextInt();
					var buscaProduto = produtos.buscarNaLista(idProcura);
					if (buscaProduto != null) {
						tipo = buscaProduto.getTipo();
						System.out.print("Digite o nome do produto ==> ");
						nome = leia.next();
						System.out.print("\nDigite a marca do produto ==> ");
						marca = leia.next();
						System.out.print("\nDigite o preço do produto ==> ");
						preco = leia.nextFloat();
						
						switch(tipo) {
							case 1 -> {
								System.out.print("Digite a marca de celular compatível com o produto(se for compatível com todos os celulares, digite 'todas') ==> ");
								marcaCelular = leia.next();
								produtos.cadastrarProduto(new ProdutoCelular(idProcura, nome, tipo, marca, preco, marcaCelular));
							}
							case 2 -> {
								System.out.print("Digite o tipo de computador(notebook ou desktop) compatível com o produto (se for compatível com todos, digite 'todos') ==> ");
								tipoComputador = leia.next();
								produtos.cadastrarProduto(new ProdutoComputador(idProcura, nome, tipo, marca, preco, tipoComputador));
							}
							default -> {
								System.out.println("Tipo de produto inválido!");
							}
					    }
					
					} else {
						System.out.println("O produto não foi encontrado!");
					}
					
					keyPress();
				 	break;
				 	
				case 5:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -EXCLUIR PRODUTO-\n\n");
					System.out.print("Digite o ID do produto ==> ");
					idProcura = leia.nextInt();
					
					produtos.deletarProduto(idProcura);
					
					keyPress();
					break;
					
				default:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOPÇÃO INVÁLIDA!\nDigite um número válido");
					break;			
			}
			
		}
		
	}
	
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			System.in.read();
		} catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente!\n Pressione Enter!");
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Anne Karolina A.C");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/IKaRu127");
		System.out.println("*********************************************************");
	}
		

}
