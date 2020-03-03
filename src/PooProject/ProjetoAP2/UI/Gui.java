package PooProject.ProjetoAP2.UI;

import java.util.Scanner;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.EmpresaException;
import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioEmpresaException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Fachada.Fachada;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Empresa;
import PooProject.ProjetoAP2.Modelo.Endereco;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;
import PooProject.ProjetoAP2.Repositorio.RepositorioCliente;

public class Gui {
 
 static int escolhaPrincipal;
 static int escolhaSub;
 static int tipoEscolha;
 static int tipoPesquisa;
 static int tipoEscolhaSub;
 static RepositorioCliente repositorioCliente = RepositorioCliente.getInstance();
 static Scanner scanner = new Scanner(System.in);
 static Fachada fachada = Fachada.getInstance();
 
 static int guardarCodigoProduto;
 static double guardarPreco;
 static double guardaValor;
 public static void main(String[] args) throws ClienteException, RepositorioClienteException, VendaException, RepositorioVendaException {
	 while(escolhaPrincipal != 5 ){
		 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 para Cadastro \n 2 Efetuar Compras \n 3 Area da Empresa \n 4 Area da Pesquisa "
		 		+ "\n 5 Sair");
		 escolhaPrincipal = scanner.nextInt();
		 
		 switch (escolhaPrincipal) {
		case 1:
			escolhaCadastro();
			break;
		case 2:
			escolhaEfetuarCompras();
			break;
		case 3:
			escolhaEmpresa();
			break;
		case 4:
			escolhaPesquisa();
			break;
		case 5:
			System.out.println("Você  escolheu a opção sair. Obrigado!");
			System.exit(0);
			break;
		default:
			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
			break;
		}
	 }
	
}
 public static void escolhaCadastro() throws ClienteException,RepositorioClienteException {
	 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 para Cadastra Cliente PF \n 2 Cadastrar Cliente PJ \n 3 Cadastrar a Empresa"
		 		+ "\n 4 Cadastrar Funcionario \n 5 Cadastrar Produto \n 6 Cadastrar Filiado "
		 		+ "\n 7  volta Ao Menu  Principal");
	 
	 escolhaSub = scanner.nextInt();
	switch (escolhaSub) {
		case 1:
			
			
			ClientePF cf = new ClientePF();	
			
			
			System.out.println("Digite o Código do Cliente");
			cf.setCodCliente(scanner.nextInt());
			System.out.println("Digite o Nome do Cliente");
			cf.setNome(scanner.nextLine());
			cf.setNome(scanner.nextLine());
			System.out.println("Digite o CPF do Cliente");
			cf.setCPF(scanner.next());
			System.out.println("Digite o email do Cliente");
			cf.setEmail((scanner.nextLine()));
			cf.setEmail((scanner.nextLine()));
			System.out.println("Digite a data do Nascimento do Cliente");
			cf.setDataNascimento(scanner.nextLine());
			System.out.println("Digite o telefone  do Cliente");
			cf.setTelefone(scanner.nextLine());
			
			Endereco e1  = new Endereco();
			
			fachada.cadastrarEndereco(e1);
			
			cf.setEndereco(e1);
			
			try {
				fachada.inserirClientePF(cf);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioClienteException ex) {
				System.out.println(ex.getMessage());
			}
		
			break;
		case 2:
			ClientePJ cj = new ClientePJ();
			
			System.out.println("Digite o Código do Cliente");
			cj.setCodCliente(scanner.nextInt());
			System.out.println("Digite o Nome do Cliente");
			cj.setRazaoSocial(scanner.nextLine());
			System.out.println("Digite o CNPJ do Cliente");
			cj.setCNPJ(scanner.nextLine());
			System.out.println("Digite a Data da Funda;'ao do Cliente");
			cj.setDataFundacao(scanner.nextLine());
			System.out.println("Digite o Nome Fantasia do Cliente");
			cj.setNomeFantasia(scanner.nextLine());
			System.out.println("Digite o email do Cliente");
			System.out.println("Digite o  numero de Inscri;'ao Estadual do Cliente");
			cj.setInscricaoEstadual(scanner.nextInt());
			cj.setEmail(scanner.nextLine());
			System.out.println("Digite o telefone  do Cliente");
			cj.setTelefone(scanner.nextLine());
			
			Endereco e2  = new Endereco();
			fachada.cadastrarEndereco(e2);
			cj.setEndereco(e2);
			
			try {
				fachada.inserirClientePJ(cj);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioClienteException ex) {
				System.out.println(ex.getMessage());
			}
			break;	
	   case 3:
			Empresa emp = new Empresa();
			
			emp.setCodEmpresa(1);
			emp.setCNPJ("01234567890001-15");
			emp.setRazaoSocial("Chocolate & Banana");
			emp.setDataFundacao("13/10/2016");
			emp.setNomeFantasia("ChocoBanana");
			emp.setInscricaoEstadual(1234567);
			emp.setLogin("Admin");
			
			Endereco e3 = new Endereco();
			e3.setNomeRua("Caramelo");
			e3.setNumCasa(137);
			e3.setComplemento("Cobertura de Morango");
			e3.setCep("12345-167");
			e3.setBairro("Brigadeiro");
			e3.setCidade("Flocos");
			e3.setEstado("Jujuba");
			
			emp.setEndereco(e3);

			try {
				fachada.inserirEmpresa(emp);
			} catch (EmpresaException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioEmpresaException ex) {
				System.out.println(ex.getMessage());
			}
			
			break; 
	   case 4:
		   Funcionario f = new Funcionario();
		   System.out.println("Digite o Codigo do Funcionario");
		   f.setCodFuncionario(scanner.nextInt());
		   System.out.println("Digite o nome do Funcionario");
		   f.setNomeFuncionario(scanner.nextLine());
		   System.out.println("Digite o Cargo");
		   f.setCargo(scanner.nextLine());
		   System.out.println("Digite o CPF");
		   f.setCpf(scanner.nextLine());
		   System.out.println("Digete a Data de Entrada do Funcionario");
		   f.setDataEntrada(scanner.nextLine());
		   System.out.println("Digete a Data de Saida do Funcionario");
		   f.setDataSaida(scanner.nextLine());
		   System.out.println("Digite o Salario do Funcinario");
		   f.setSalario(scanner.nextDouble());
		   System.out.println("Digite o Harario do Funcinario");
		   f.setHorario(scanner.nextLine());
		   System.out.println("Digete a Data das Ferias");
		   f.setDataFerias(scanner.nextLine());
			
			Endereco e4  = new Endereco();
			
			fachada.cadastrarEndereco(e4);
			
			f.setEnd(e4);
			
		
			try {
				fachada.inserirFuncionario(f);
			} catch (FuncionarioException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFuncionarioException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 5:
			Produto p = new Produto();
			System.out.println("Informe o Codigo do Produto");
			p.setCodProduto(scanner.nextInt());
			System.out.println("Digeto o Nome do Produto");
			p.setNomeProduto(scanner.nextLine());
			System.out.println("Digite o Preço do Produto");
			p.setPreco(scanner.nextDouble());
			System.out.println("Digite a Quantidade do Produto");
			p.setQtdProduto(scanner.nextInt());
	
			try {
				fachada.inserirProduto(p);
			} catch (ProdutoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioProdutoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 6:
		   	Filiado fil = new Filiado();
		   	System.out.println("Digite o Codigo do Filiado");
		   	fil.setCodFiliado(scanner.nextInt());
			System.out.println("Digite o Nome do Filiado");
		   	fil.setNomeFiliado(scanner.nextLine());
			System.out.println("Digite o Tipo de Fornecimento do Filiado");
		   	fil.setTipoFornecimento(scanner.nextLine());
			System.out.println("Digite o Email do Filiado");
		   	fil.setEmail(scanner.nextLine());
			System.out.println("Digite o Telefone do Filiado");
		   	fil.setTelefone(scanner.nextLine());
			System.out.println("Digite a Quantidade do Filiado");
		   	fil.setQtdFornecida(scanner.nextInt());
			System.out.println("Digite o Valor por Unidade do Filiado");
		   	fil.setValorUnidade(scanner.nextDouble());
			System.out.println("Digite o Valor Recebido  do Filiado");
		   	fil.setValorRecebido(scanner.nextDouble());
		   	
			
			try {
				fachada.inserirFiliado(fil);
			} catch (FiliadoException e) {
				System.out.println(e.getMessage());
			}catch (RepositorioFiliadoException ex) {
				System.out.println(ex.getMessage());
			}
			break;
	   case 7:
		   System.out.println("Você  escolheu a opção voltar ao Menu, Obrigado!");
			break;
		default:
			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
			break;
	}
}
 public static void escolhaEfetuarCompras() throws VendaException, RepositorioVendaException{
	 Venda v = new Venda();
	 
	 System.out.println("Informe o nome do Produto");
	 v.setNomeProduto(scanner.nextLine());
	 System.out.println("Informe a Quantidade do Produto que quer comprar");
	 v.setQtdProduto(scanner.nextInt());
	 System.out.println("Informe o Tipo de pagamento\n onde:\n 1 Avista \n Parcelado");
	 v.setTipoPagamento(scanner.nextInt());
	 v.setCodProduto(fachada.pesquisarCodProduto(0));//ainda falta imprementar o metudo pra buscar o codigo do produto no array
	 v.setPreco(0);//a
	 v.setCodVenda(0);//ainda falta um metodo pra incluir automaticamente o codigo.
	 v.setValorRecebido(0);////ainda falta imprementar o metudo pra calcular o valor no array
		
		try {
			fachada.inserirVenda(v);
		} catch (VendaException e) {
			System.out.println(e.getMessage());
		}catch (RepositorioVendaException ex) {
			System.out.println(ex.getMessage());
		}
 }
 public static void escolhaEmpresa(){
		 
 }
 public static void escolhaPesquisa() throws VendaException, RepositorioVendaException{
	 System.out.println("Usuarios sejam bem vindos \n escolha a opção desejada \n onde:"
		 		+ "\n 1 Pesquisar  Cliente \n 2 Pesquisar a Empresa"
		 		+ "\n 3 Pesquisar Funcionario \n 4 Pesquisar Produto \n 5 Pesquisar Filiado "
		 		+ "\n6 Pesquisar Vendas \n 7  volta Ao Menu  Principal ");
	
	 escolhaSub = scanner.nextInt();
	
	switch (escolhaSub) {
		case 1:
//			System.out.println("Escolha pra qual tipo de cliente \n onde: \n 1 Cliente PF \n 2 Cliente PJ");
//			tipoEscolha = scanner.nextInt();
//			 switch (tipoEscolha) {
//			 	case 1:
//			 		try {
//			 			Cliente clientePesquisa = null ;
//			 			System.out.println("Escolha qual tipo de pesquisa\n onde: \n 1 pesquisar pelo nome "
//			 				+ "\n 2 pesquisar pelo CPF \n 3 pesquisar pelo bairro");
//			 			tipoPesquisa = scanner.nextInt();
//			 			
//			 			if (tipoPesquisa == 1) {
//							
//							System.out.println("Digite o Nome do Cliente");
//							clientePesquisa = fachada.pesquisarClientePeloNome(scanner.nextLine());
//							System.out.println("Cliente Encontrado ");
//							System.out.println(" ");
//							System.out.println("Codigo: " + clientePesquisa.getCodCliente() + "Nome :" + clientePesquisa.getNome() 
//							                  + "CPF :" +clientePesquisa.getCPF());
//
//						}else if(tipoPesquisa == 2){
//							System.out.println("Digite o CPF do Cliente");
//							clientePesquisa = fachada.pesquisarClientePeloCPF(scanner.nextLine());
//							System.out.println("Cliente Encontrado ");
//							System.out.println(" ");
//							System.out.println("Codigo: " + clientePesquisa.getCodCliente() + "Nome :" + clientePesquisa.getNome() 
//							                  + "CPF :" +clientePesquisa.getCPF());
//						} else if (tipoPesquisa == 3){
//							System.out.println("Digite o Bairro do Cliente");
//							Cliente[] clientePesquisarPeloBairro = fachada.pesquisarClientePeloBairro(scanner.nextLine());
//							System.out.println("Lista de Clientes por Bairro");
//							System.out.println("");
//							for (int i = 0; i < clientePesquisarPeloBairro.length; i++) {
//									System.out.println("Nome: " + clientePesquisarPeloBairro[i].getNome() + " Bairro: " + clientePesquisarPeloBairro[i].getEndereco().getBairro()
//										+ "CPF: " + clientePesquisarPeloBairro[i].getCPF());
//									System.out.println("");	
//							}
//						}else {
//							System.out.println("Você não escolheu uma opção valida");
//						}
//			 			
//			 			System.out.println("O que deseja fazer com o Cliente encontrado \n onde: \n 1 remover \n 2 atualizar ");
//						tipoEscolhaSub = scanner.nextInt();
//						if(tipoEscolhaSub == 1){
//							System.out.println("Digite o nome do cliente");
//							fachada.excluirCliente(clientePesquisa);
//						}else if (tipoEscolhaSub == 2){
//							//fachada.atualizarCliente(clientePesquisarNome) //
//						}else {
//							System.out.println("Você Não escolheu uma opção valida");
//						}
//						
//			 		} catch (ClienteException e) {
//						System.out.println(e.getMessage());
//					}catch (RepositorioClienteException ex) {
//						System.out.println(ex.getMessage());
//					}
//			 		break;
//			 	case 2:
//			 		Cliente clientePesquisarCNPJ = null;
//			 		try {
//			 			
//			 			System.out.println("Escolha qual tipo de pesquisa\n onde: "
//			 				+ "\n 1 pesquisar pelo CNPJ \n 2 pesquisar pelo bairro");
//			 			tipoPesquisa = scanner.nextInt();
//			 			
//			 			if (tipoPesquisa == 1) {
//							
//							System.out.println("Digite o CNPJ do Cliente");
//							clientePesquisarCNPJ = fachada.pesquisarClientePeloCNPJ(scanner.nextLine());
//							System.out.println("Cliente PJ Encontrado ");
//							System.out.println(" ");
//							System.out.println("Codigo do Cliente PJ : " + clientePesquisarCNPJ.getCodClientePJ() + "Razão Social :" + clientePesquisarCNPJ.getRazaoSocial() 
//							                  + "CNPJ :" +clientePesquisarCNPJ.getCNPJ());
//						} else if (tipoPesquisa == 2){
//							System.out.println("Digite o Bairro do Cliente");
//							Cliente[] clientePesquisarPeloBairro = fachada.pesquisarClientePeloBairro(scanner.nextLine());
//							System.out.println("Lista de Clientes por Bairro");
//							System.out.println("");
//							for (int i = 0; i < clientePesquisarPeloBairro.length; i++) {
//									System.out.println("Razão Social: " + clientePesquisarPeloBairro[i].getRazaoSocial() + " Bairro: " + clientePesquisarPeloBairro[i].getEnd().getBairro()
//										+ "CNPJ: " + clientePesquisarPeloBairro[i].getCNPJ() + "\n");
//									System.out.println("");	
//							}
//						}else {
//							System.out.println("Você não escolheu uma opção valida");
//						}
//			 			
//			 			System.out.println("O que deseja fazer com o Cliente encontrado \n onde: \n 1 remover \n 2 atualizar ");
//						tipoEscolhaSub = scanner.nextInt();
//						if(tipoEscolhaSub == 1){
//							fachada.excluirCliente(clientePesquisarCNPJ);
//						}else if (tipoEscolhaSub == 2){
//							//fachada.atualizarCliente(clientePesquisarNome) //
//						}else {
//							System.out.println("Você Não escolheu uma opção valida");
//						}
//						
//			 		} catch (ClienteException e) {
//						System.out.println(e.getMessage());
//					}catch (RepositorioClienteException ex) {
//						System.out.println(ex.getMessage());
//					}
//				
//			 		break;
//
//			 	default:
//			 		System.out.println("Você não escolheu uma opção valida");
//			 		break;
//			}
//			break;
		case 2:
// ainda falta criar no repositorio a pesquisa empresa			
//			try {
//				System.out.println("Digite o codigo da Empresa");
//				fachada.PesquisarEmpresa(scanner.nextint);
//			} catch (ClienteException e) {
//				System.out.println(e.getMessage());
//			}catch (RepositorioClienteException ex) {
//				System.out.println(ex.getMessage());
//			}
//			break;
//		case 3:		
//			try {
//				Funcionario  funcionarioPesquisa = null;
//				System.out.println("Escolha qual tipo de pesquisa para Funcionario\n onde: "
//						+ "\n 1 pesquisar pelo nome \n 2 pesquisar pelo CPF \n 3 pesquisar pelo bairro");
//		 			tipoPesquisa = scanner.nextInt();
//		 			
//		 			switch (tipoPesquisa) {
//					case 1:
//						System.out.println("Digite o Nome do Funcionario");
//						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloNome(scanner.nextLine());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + funcionarioPesquisa.getCodFuncionario() + "Nome :" + funcionarioPesquisa.getNomeFuncionario() 
//						                  + "CPF :" +funcionarioPesquisa.getCpf());
//						
//						break;
//					case 2:
//						System.out.println("Digite o CPF do Funcionario");
//						funcionarioPesquisa = fachada.pesquisarFuncionarioPeloCPF(scanner.nextLine());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + funcionarioPesquisa.getCodFuncionario() + "Nome :" + funcionarioPesquisa.getNomeFuncionario() 
//						                  + "CPF :" +funcionarioPesquisa.getCpf());
//						break;
//					case 3:
//						System.out.println("Digite o Bairro do Cliente");
//						Funcionario[] funcionarioPesquisarPeloBairro = fachada.pesquisarFuncionarioPeloBairro(scanner.nextLine());
//						System.out.println("Lista de Clientes por Bairro");
//						System.out.println("");
//						for (int i = 0; i < funcionarioPesquisarPeloBairro.length; i++) {
//								System.out.println("Nome: " + funcionarioPesquisarPeloBairro[i].getNomeFuncionario() + " Bairro: " + funcionarioPesquisarPeloBairro[i].getEnd().getBairro()
//									+ "CPF: " + funcionarioPesquisarPeloBairro[i].getCpf() + "\n");
//								System.out.println("");	
//								}
//						break;
//
//					default:
//						System.out.println("Você não escolheu uma opção valida");
//						break;
//					}
//		 			System.out.println("O que deseja fazer com o Funcionario encontrado \n onde: \n 1 remover \n 2 atualizar ");
//					tipoEscolhaSub = scanner.nextInt();
//					if(tipoEscolhaSub == 1){
//						fachada.excluirFuncionario(funcionarioPesquisa);
//					}else if (tipoEscolhaSub == 2){
//						//fachada.atualizarCliente(clientePesquisarNome) //
//					}else {
//						System.out.println("Você Não escolheu uma opção valida");
//					}
//				
//			} catch (FuncionarioException e) {
//				System.out.println(e.getMessage());
//			}catch (RepositorioFuncionarioException ex) {
//				System.out.println(ex.getMessage());
//			}
//			break;
//		case 4:
//		
//			try {
//				Produto  produtoPesquisa = null;
//				System.out.println("Escolha qual tipo de pesquisa para Produto \n onde: "
//						+ "\n 1 pesquisar pelo Codigo \n 2 pesquisar pelo Nome \n 3 pesquisar pelo Preço");
//		 			tipoPesquisa = scanner.nextInt();
//		 			
//		 			switch (tipoPesquisa) {
//					case 1:
//						System.out.println("Digite o Nome do Produto");
//						produtoPesquisa = fachada.pesquisarProdutoPeloCodigo(scanner.nextInt());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + produtoPesquisa.getCodProduto() + "Nome :" + produtoPesquisa.getNomeProduto() 
//						                  + "Preço :" +produtoPesquisa.getPreco());
//						
//						break;
//					case 2:
//						System.out.println("Digite o Nome do Produto");
//						produtoPesquisa = fachada.pesquisarProdutoPeloNome(scanner.nextLine());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + produtoPesquisa.getCodProduto() + "Nome :" + produtoPesquisa.getNomeProduto() 
//						                  + "CPF :" +produtoPesquisa.getPreco());
//						break;
//					case 3:
//						System.out.println("Digite o Preço do Produto");
//						Produto[] produtoPesquisaPeloPreco = fachada.pesquisarProdutoPeloPreco(scanner.nextDouble());
//						System.out.println("Lista de Produtos por Preço");
//						System.out.println("");
//						for (int i = 0; i < produtoPesquisaPeloPreco.length; i++) {
//								System.out.println("Nome: " + produtoPesquisaPeloPreco[i].getNomeProduto() + " Codigo: " + produtoPesquisaPeloPreco[i].getCodProduto()
//									+ "Preço : " + produtoPesquisaPeloPreco[i].getPreco() + "\n");
//								System.out.println("");	
//								}
//						break;
//
//					default:
//						System.out.println("Você não escolheu uma opção valida");
//						break;
//					}
//		 			System.out.println("O que deseja fazer com o Funcionario encontrado \n onde: \n 1 remover \n 2 atualizar ");
//					tipoEscolhaSub = scanner.nextInt();
//					if(tipoEscolhaSub == 1){
//						fachada.excluirProduto(produtoPesquisa);
//					}else if (tipoEscolhaSub == 2){
//						//fachada.atualizarCliente(clientePesquisarNome) //
//					}else {
//						System.out.println("Você Não escolheu uma opção valida");
//					}
//			} catch (ProdutoException e) {
//				System.out.println(e.getMessage());
//			}catch (RepositorioProdutoException ex) {
//				System.out.println(ex.getMessage());
//			}
//	
//			break;
//		case 5:			
//			try {
//				Filiado  filiadoPesquisa = null;
//				System.out.println("Escolha qual tipo de pesquisa para Filiado \n onde: "
//						+ "\n 1 pesquisar pelo Codigo \n 2 pesquisar pelo Nome \n 3 pesquisar pelo tipo de Serviço");
//		 			tipoPesquisa = scanner.nextInt();
//		 			
//		 			switch (tipoPesquisa) {
//					case 1:
//						System.out.println("Digite o Nome do Filiado");
//						filiadoPesquisa = fachada.pesquisarFiliadoPeloNome(scanner.nextLine());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + filiadoPesquisa.getCodFiliado() + "Nome :" + filiadoPesquisa.getNomeFiliado() 
//						                  + "CNPJ :" +filiadoPesquisa.getCNPJ());
//						
//						break;
//					case 2:
//						System.out.println("Digite o CNPJ do Filiado");
//						filiadoPesquisa = fachada.pesquisarFiliadoPeloCNPJ(scanner.nextLine());
//						System.out.println("Funcionario Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + filiadoPesquisa.getCodFiliado() + "Nome :" + filiadoPesquisa.getNomeFiliado() 
//						                  + "CNPJ :" +filiadoPesquisa.getCNPJ());
//						break;
//					case 3:
//						System.out.println("Digite o Tipo de Serviço  do Filiado");
//						Filiado[] filiadoPesquisaTipoServico = fachada.pesquisarFiliadoPeloTipoFornecimento(scanner.nextLine());
//						System.out.println("Lista de Filiado por Tipo de Serviço");
//						System.out.println("");
//						for (int i = 0; i < filiadoPesquisaTipoServico.length; i++) {
//								System.out.println("Nome: " + filiadoPesquisaTipoServico[i].getNomeFiliado() + " Codigo: " + filiadoPesquisaTipoServico[i].getCodFiliado()
//									+ "Preço : " + filiadoPesquisaTipoServico[i].getTipoFornecimento() + "\n");
//								System.out.println("");	
//								}
//						break;
//
//					default:
//						System.out.println("Você não escolheu uma opção valida");
//						break;
//					}
//		 			System.out.println("O que deseja fazer com o Funcionario encontrado \n onde: \n 1 remover \n 2 atualizar ");
//					tipoEscolhaSub = scanner.nextInt();
//					if(tipoEscolhaSub == 1){
//						fachada.excluirFiliado(filiadoPesquisa);
//					}else if (tipoEscolhaSub == 2){
//						//fachada.atualizarCliente(clientePesquisarNome) //
//					}else {
//						System.out.println("Você Não escolheu uma opção valida");
//					}
//			} catch (FiliadoException e) {
//				System.out.println(e.getMessage());
//			}catch (RepositorioFiliadoException ex) {
//				System.out.println(ex.getMessage());
//			}
//			break;
//		case 6:
//			try {
//				Venda  vendaPesquisa = null;
//				System.out.println("Escolha qual tipo de pesquisa para Venda \n onde: "
//						+ "\n 1 pesquisar pelo Codigo \n 2 pesquisar pelo Tipo de Pagamento");
//		 			tipoPesquisa = scanner.nextInt();
//		 			
//		 			switch (tipoPesquisa) {
//					case 1:
//						System.out.println("Digite o Codigo da Venda");
//						vendaPesquisa = fachada.pesquisarVendaPeloCodigo(scanner.nextInt());
//						System.out.println("Venda Encontrado ");
//						System.out.println(" ");
//						System.out.println("Codigo: " + vendaPesquisa.getCodVenda() + "Forma de Pagamento :" + vendaPesquisa.getTipoPagamento() 
//						                  + "Valor Recebido :" +vendaPesquisa.getValorRecebido());
//						
//						break;
//					case 2:
//						System.out.println("Digite o Forma de pagamento \n onde:\n 1 avista \n a prazo");
//						Venda[] vendaPesquisaTipoPagamento = fachada.pesquisarVendaPeloTipo(scanner.nextInt());
//						System.out.println("Lista de Vendas  por Forma de Pagamento");
//						System.out.println("");
//						for (int i = 0; i < vendaPesquisaTipoPagamento.length; i++) {
//							System.out.println("Codigo: " + vendaPesquisaTipoPagamento[i].getCodVenda() + "Forma de Pagamento :" + vendaPesquisaTipoPagamento[i].getTipoPagamento() 
//			                  + "Valor Recebido :" + vendaPesquisaTipoPagamento[i].getValorRecebido());
//								System.out.println("");	
//								}
//						break;
//
//					default:
//						System.out.println("Você não escolheu uma opção valida");
//						break;
//					}
//		 			System.out.println("O que deseja fazer com a Venda encontrado \n onde: \n 1 remover \n 2 atualizar ");
//					tipoEscolhaSub = scanner.nextInt();
//					if(tipoEscolhaSub == 1){
//						fachada.excluirVenda(vendaPesquisa);
//					}else if (tipoEscolhaSub == 2){
//						//fachada.atualizarCliente(clientePesquisarNome) //
//					}else {
//						System.out.println("Você Não escolheu uma opção valida");
//					}
//			} catch (VendaException e) {
//				System.out.println(e.getMessage());
//			}catch (RepositorioVendaException ex) {
//				System.out.println(ex.getMessage());
//			}
//			break;
//		case 7:
//		   System.out.println("Você  escolheu a opção voltar ao Menu, Obrigado!");
//			break;
//		default:
//			System.out.println("Você não escolheu uma opção valida,retornar para o menu principal Obrigado!");
//			break;
	}	 
 }

}
