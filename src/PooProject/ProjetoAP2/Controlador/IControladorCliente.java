package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ClienteException;
import PooProject.ProjetoAP2.Excecao.RepositorioClienteException;
import PooProject.ProjetoAP2.Modelo.Cliente;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;

public interface IControladorCliente {
	public void inserirClientePF(ClientePF clientePF) throws ClienteException,RepositorioClienteException ;
	public void excluirCliente (Cliente cliente)throws ClienteException,RepositorioClienteException;
	public void  excluirClientePeloNome(String nome)throws ClienteException,RepositorioClienteException;
	public ClientePF pesquisarClientePeloCPF(String cpf)throws ClienteException,RepositorioClienteException;
	public ClientePF  pesquisarClientePeloNome(String nome)throws ClienteException,RepositorioClienteException;
	public void inserirClientePJ(ClientePJ clientePJ)throws ClienteException,RepositorioClienteException;
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj)throws ClienteException,RepositorioClienteException;
	public ArrayList<Cliente> listarClientes()throws ClienteException,RepositorioClienteException;	
	public void atualizarClientePF(ClientePF clientePF)throws ClienteException,RepositorioClienteException;
	public void atualizarClientePJ(ClientePJ clientePJ)throws ClienteException,RepositorioClienteException;
	
}
