package execucao;

import java.util.Scanner;

import controle.Controlador;
import modelo.Autor;
import modelo.Editora;
import modelo.Endereco;
import modelo.Livro;
public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco();
		Autor autor = new Autor(1, " ", 35, endereco1);
		Controlador controlador = new Controlador();
		Editora editora;
		int idlivro = 0;
		String titulo = "";
		String genero = "";
		String nomeDoAutor = "";
		String nomeDaEditora = "";
		int opcao = 0;
		Livro livro;
		entrada = new Scanner(System.in);

		do {
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("$$$$$$$$$$$$$      LISTA DE OPÇÔES       $$$$$$$$$$$$$$");
			System.out.println("$$ 1 - Adicionar novo Livro                          $$");
			System.out.println("$$ 2 - Buscar  Livro por ID                          $$");
			System.out.println("$$ 3 - Listar Livros                                 $$");
			System.out.println("$$ 4 - Editar Livro                                  $$");
			System.out.println("$$ 5 - Remover Livro                                 $$");
			System.out.println("$$ 6 - SAIR                                          $$");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.print("Digite a operação que deseja executar:");

			opcao = entrada.nextInt();

			entrada.nextLine();

			idlivro = 0;

			switch (opcao) {
			case 1:

				System.out.println("--------------------------------------------------------");
				System.out.println("$$$$$$$$$$$$      INSERÇÃO DE LIVRO      $$$$$$$$$$$$");
				System.out.println("--------------------------------------------------------");
				System.out.println("Digite o ID do Livro:");
				idlivro = entrada.nextInt();

				entrada.nextLine();

				System.out.println("Digite o titulo: ");
				titulo = entrada.nextLine();

				System.out.println("Digite o genero: ");
				genero = entrada.nextLine();
				
				System.out.println("Digite o nome do Autor: ");
				nomeDoAutor = entrada.nextLine();
				
				System.out.println("Digite o nome da Editora: ");
				nomeDaEditora = entrada.nextLine();

				editora = new Editora(nomeDaEditora);
				autor = new Autor(nomeDoAutor);
				livro = new Livro(idlivro, titulo, genero, autor, editora);
				controlador.adicionarLivros(livro);

				break;

			case 2:
				System.out.println("--------------------------------------------------------");
				System.out.println("$$$$$$$$$$$$        BUSCA DE LIVRO        $$$$$$$$$$$$");
				System.out.println("--------------------------------------------------------");

				System.out.println("Digite o id (indentificador ) do livro a ser buscado:");
				idlivro = entrada.nextInt();

				entrada.nextLine();

				controlador.buscar(idlivro);

				break;

			case 3:
				System.out.println("--------------------------------------------------------");
				System.out.println("$$$$$$$$$$$$$$      LISTAGEM DOS LIVROS      $$$$$$$$$$$");
				System.out.println("--------------------------------------------------------");

				controlador.listarLivros();

				break;

			case 4:
				System.out.println("--------------------------------------------------------");
				System.out.println("$$$$$$$$$$$$$       EDIÇÃO DE LIVROS         $$$$$$$$$$$");
				System.out.println("--------------------------------------------------------");

				System.out.println("Digite o id do livro a ser editado:");
				idlivro = entrada.nextInt();

				entrada.nextLine();

				System.out.println("Digite o novo titulo do livr:");
				titulo = entrada.nextLine();

				System.out.println("Digite o novo genero do livro:");
				genero = entrada.nextLine();

				System.out.println("Digite o novo autor do livro:");
				String Autor = entrada.nextLine();
				
				System.out.println("Digita a nova Editora do Livro:");
				nomeDaEditora = entrada.nextLine();

				editora = new Editora(nomeDaEditora);
				controlador.editarLivro(idlivro, titulo, genero, autor,editora);

				break;

			case 5:
				System.out.println("--------------------------------------------------------");
				System.out.println("$$$$$$$$$$$$$$$      REMOÇÃO DE LIVROS      $$$$$$$$$$$$");
				System.out.println("--------------------------------------------------------");
				System.out.println("Digite o ID do Livro a ser removido:");
				idlivro = entrada.nextInt();
				entrada.nextLine();


				if (controlador.verificarSeLivroExiste(idlivro)) {
					controlador.listarLivros();
					System.out.print("Deseja realmente remover esse livro (S - SIM ou N - NÃO)?");

					String confirmacao = entrada.next();

					if(confirmacao.toLowerCase().equals("s") || confirmacao.toLowerCase().equals("sim")) {
						if(controlador.removeLivro(idlivro)) {
							System.out.println(" foi removido com sucesso!");
						} else {
							System.err.println("ERRO: o livro não foi removido!");
						}
					} else {
						System.err.println("Operação cancelada!");
					}
				}
				else {
					System.out.print("Livro não achado\n");
				}
				break;
			}
		}while(opcao!=6);
	}
}

