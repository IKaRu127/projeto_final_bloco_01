package projeto_final_bloco_01;

import java.util.Scanner;

import loja.model.ProdutoCelular;
import loja.model.ProdutoComputador;
import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//TESTES COM MÉTODOS DA LOJA
		ProdutoCelular procelu1 = new ProdutoCelular(1,"Fone de ouvido",1,"Samsung",44.99f,"todas");
		ProdutoCelular procelu2 = new ProdutoCelular(2,"Capinha",1,"Sem marca",10.50f,"Iphone");
		ProdutoComputador propc1 = new ProdutoComputador(3,"Microfone",2,"ECHO",49.90f, "todos");
		procelu1.visualizar();
		procelu2.visualizar();
		propc1.visualizar();
		
		
		// VÁRIAVEIS
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		
		while (true) {
			
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
			System.out.println("            [3] - Atualizar produto                       ");
			System.out.println("            [4] - Excluir produto                         ");
			System.out.println("            [5] - Sair                                    ");
			System.out.println("                                                          ");
			System.out.println("**********************************************************");
			System.out.println("Selecione a opção desejada:                               ");
			System.out.println("                                                          " + Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				// SAIR DO PROGRAMA
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAgradecemos sua visita! \nSuperGadgets");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1: 
					System.out.println(Cores.TEXT_WHITE_BOLD +  "  -CADASTRAR PRODUTOS-\n\n");
					break;                        
				case 2:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -LISTAR PRODUTOS CADASTRADOS-\n\n");
					break;                           
				case 3:                
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -ATUALIZAR PRODUTO-\n\n");
					break;            
				                      
				case 4:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "  -EXCLUIR PRODUTO-\n\n");
					break;          
				default:               
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nOPÇÃO INVÁLIDA!\nDigite um número válido");
					break;			
			}
			
			//FECHAR PROGRAMA
			leia.close();
			System.exit(0);
			
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
