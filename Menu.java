
package oficial1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Menu {

	public static void main(String[] args)
	
	/*
	* < UNIME >
	* < B.S.I >
	* < PROGRAMAÇÃO ORIENTADA A OBJETOS 2 >
	* < PABLO ROXO >
	* < LUIS RICARDO SOUSA BORGES >
	*/
	
	
	
	{
		Scanner scanner = new Scanner (System.in);
		ArrayList<Pessoa> funcionario = new ArrayList();
		
		boolean rodando = true;
		while(rodando) {
			
			System.out.println("[1] Cadastrar funcionario");
			System.out.println("[2] Listar funcionarios");
			System.out.println("[3] Pesquisar funcionarios ");
			System.out.println("[4] Limpar Lista de funcionarios");
			System.out.println("[5] Encerrar o programa");
			System.out.println("Digite a opção: ");
			String opcao = scanner.nextLine();
			
			switch(opcao) {
			    
			   case "1":{
				   System.out.println("*** CADASTRO DE FUNCIONARIO ***");
				   System.out.println("Digite seu nome: ");
				   String nome = scanner.nextLine();
				   System.out.println("Digite a sua idade: ");
				   int idade = scanner.nextInt();
				   System.out.println("Digite sua profissão: ");
				   String profissao = scanner.next();
				   Pessoa f = new Pessoa();
				   f.setNome(nome);
				   f.setIdade(idade);
				   f.setProfissao(profissao);
				   funcionario.add(f);
				   
				   break;   
			   }
			  
			  
			   case "2":{
				   System.out.println("*** LISTA DE FUNCIONARIOS ***");
				   for (int i = 0; i< funcionario.size(); i++) {
					   Pessoa fTemp = funcionario.get(i);
					   System.out.println("Funcionario: " + i);
					   System.out.print("\tNome: " + funcionario.get(i).getNome());
					   System.out.print("\tIdade: " + funcionario.get(i).getIdade());
					   System.out.print("\tProfissao: " + funcionario.get(i).getProfissao());
					   System.out.println("");
				   }
				      
				   break;
			   }
			   case "3":{
				   System.out.println("*** PROCURAR FUNCIONARIO ***");
				   System.out.println("Digite o nome: ");
				   String nome = scanner.nextLine();
				   
				   boolean encontrado = false;
				   for (int i = 0; i< funcionario.size(); i++) {
					   Pessoa fTemp = funcionario.get(i);
					   if (nome.equals(fTemp.getNome())) {
						   System.out.println("Funcionario encontrado");
						   System.out.println("\tNome: " + fTemp.getNome());
						   encontrado = true;
						   
					      }}
				    		
				   
				       	   if (encontrado == true){
								   
								   for (int n = 0; n< funcionario.size(); n++) {
									   
									   Pessoa jTemp = funcionario.get(n);
									  
										   System.out.println("[" + n + "]" + jTemp.getNome());
										  
								   }
								   
								   
								   		System.out.println("Para atualizar um NOME digite 1, para sair digite 2: ");
								   		int attnome = scanner.nextInt();
								   		if(attnome == 1) {
										System.out.println("=== ATUALIZAÇÃO DE NOME ===");
										System.out.println("Insira o numero de referencia do funcionario:  ");
										int referencia = scanner.nextInt();
										scanner.nextLine();
										
										System.out.println("Digite o novo nome: ");
										String novoNome =  scanner.nextLine();
									   
										Pessoa j = funcionario.get(referencia);
										j.setNome(novoNome);
										System.out.println("O nome foi atualizado");
									   
									   
										   }else{
												   System.out.println("Nenhum nome foi atualizado");
											   }
								   				
								   		System.out.println("Para atualizar uma IDADE digite 1, para sair digite 2: ");
								   		int attidade = scanner.nextInt();
								   		if(attidade == 1) {
										System.out.println("=== ATUALIZAÇÃO DE IDADE ===");
										System.out.println("Insira o numero de referencia do funcionario:  ");
										int referencia = scanner.nextInt();
										scanner.nextLine();
										
										System.out.println("Digite a nova idade: ");
										int novaIdade =  scanner.nextInt();
									   
										Pessoa j = funcionario.get(referencia);
										j.setIdade(novaIdade);
										System.out.println("A idade foi atualizada");
									   
									   
										   }else{
												   System.out.println("Nenhuma idade foi atualizada");
											   }
								   		
								   		System.out.println("Para atualizar uma PROFISSÃO digite 1: ");
								   		int attprofissao = scanner.nextInt();
								   		if(attprofissao == 1) {
										System.out.println("=== ATUALIZAÇÃO DE PROFISSÃO ===");
										System.out.println("Insira o numero de referencia do funcionario:  ");
										int referencia = scanner.nextInt();
										scanner.nextLine();
										
										System.out.println("Digite a nova profissão: ");
										String novaProfissao =  scanner.nextLine();
									   
										Pessoa j = funcionario.get(referencia);
										j.setProfissao(novaProfissao);
										System.out.println("A profissão foi atualizada");
									   
									   
										   }else{
												   System.out.println("Nenhuma profissao foi atualizada");
											   }
								   		
								   		
								   		
								   				System.out.println("Para Remover um FUNCIONARIO digite 1, para sair digite 2: ");
										   		int remover = scanner.nextInt();
										   		scanner.nextLine();
										   		if(remover == 1) {
										   			System.out.println("=== REMOVER FUNCIONARIO NA POSIÇÃO ===");
										   			for (int i = 0; i< funcionario.size(); i++) {
												   
										   				Pessoa fTemp = funcionario.get(i);
												   System.out.println("[" + i + "]" + fTemp.getNome());			   
											   }
											   
											   System.out.println("Digite o numero referente ao nome do usuario que será removido: ");
											   int ok = scanner.nextInt();
											   scanner.nextLine();
											   
											   funcionario.remove(ok);
											   System.out.println("Usuario removido com sucesso !");
											   }
										   		
											   else {
												   
												   System.out.println("Nenhum usuario foi removido");
							  
			}}}break; 
			   
			   case "4":{
				   funcionario.clear();
				   System.out.println("Lista de funcionarios foi limpada !");
				   break;   
			   }
			   case "5":{
				   rodando = false;
				   System.out.println("Programa finalizado !");
				   break;   
			   }
			     
			   }
			
			}
			
		}
		
		
		 }
		
	


