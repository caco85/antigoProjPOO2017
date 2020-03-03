package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Modelo.Cliente;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Repositorio.RepositorioCliente;

public class ControladorCliente implements IControladorCliente {
	
	private static ControladorCliente instancia;
	private RepositorioCliente repCliente;
	
	public static ControladorCliente getInstance() {
		if (instancia == null){
			instancia = new ControladorCliente();
		}
		return instancia;
	}
	public ControladorCliente() {
		repCliente = RepositorioCliente.getInstance();
	}

	@Override
	public void inserirClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
//		String cpf = null;
//		int codigo = 0;
//		if(repCliente.pesquisarClientePeloCPF(cliente.getCPF()) == null){
//			this.repCliente.inserirCliente(cliente);
//		}else 
//		if(repCliente.pesquisarClientePeloCPF(cliente.getCPF()) != null && cliente.getCPF().equals(cpf)  
//				&& cliente.getCodCliente() == codigo ){
//			throw new ClienteException("Cliente não cadastrado,pois ja existe cpf ou codigo");
//		}
		this.repCliente.inserirClientePF(clientePF);
	}

	@Override
	public void excluirCliente(Cliente cliente) throws ClienteException, RepositorioClienteException {
		//if (repCliente.pesquisarClientePeloCPF(cliente.getCPF()) != null) {
			this.repCliente.excluirCliente(cliente);	
		//}else{
		// new ClienteException("Cliente não localizado");
	//	}
		
	}

	@Override
	public void excluirClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		if (repCliente.pesquisarClientePeloNome(nome) != null) {
			this.repCliente.excluirClientePeloNome(nome);
		}else{
			throw new ClienteException("Cliente não localizado");
		}
		
	}

	@Override
	public ClientePF pesquisarClientePeloCPF(String cpf) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloCPF(cpf);
	}

	@Override
	public ClientePF pesquisarClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloNome(nome);
	}

	@Override
	public void inserirClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		String cnpj = null;
		int codigo = 0;
		if(repCliente.pesquisarClientePeloCNPJ(clientePJ.getCNPJ()) == null){
			this.repCliente.inserirClientePJ(clientePJ);
		}else if(repCliente.pesquisarClientePeloCPF(clientePJ.getCNPJ()) != null && clientePJ.getCNPJ().equals(cnpj)  
				&& clientePJ.getCodCliente() == codigo ){
			throw new ClienteException("Cliente não cadastrado,pois ja existe cpf ou codigo");
		}
	}

	@Override
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj) throws ClienteException, RepositorioClienteException {
		return repCliente.pesquisarClientePeloCNPJ(cnpj);
	}

	@Override
	public ArrayList<Cliente> listarClientes() throws ClienteException, RepositorioClienteException {
		return this.repCliente.listarClientes();
	}

	@Override
	public void atualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.repCliente.atualizarClientePF(clientePF);
	}

	@Override
	public void atualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.repCliente.atualizarClientePJ(clientePJ);
		
	}

}
