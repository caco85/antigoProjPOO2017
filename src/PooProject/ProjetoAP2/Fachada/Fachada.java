package PooProject.ProjetoAP2.Fachada;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Controlador.ControladorCliente;
import PooProject.ProjetoAP2.Controlador.ControladorEmpresa;
import PooProject.ProjetoAP2.Controlador.ControladorFiliado;
import PooProject.ProjetoAP2.Controlador.ControladorFuncionario;
import PooProject.ProjetoAP2.Controlador.ControladorProduto;
import PooProject.ProjetoAP2.Controlador.ControladorVenda;
import PooProject.ProjetoAP2.Controlador.IControladorCliente;
import PooProject.ProjetoAP2.Controlador.IControladorEmpresa;
import PooProject.ProjetoAP2.Controlador.IControladorFiliado;
import PooProject.ProjetoAP2.Controlador.IControladorFuncionario;
import PooProject.ProjetoAP2.Controlador.IControladorProduto;
import PooProject.ProjetoAP2.Controlador.IControladorVenda;
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
import PooProject.ProjetoAP2.Modelo.Cliente;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Empresa;
import PooProject.ProjetoAP2.Modelo.Endereco;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;
import util.IUtilidades;
import util.Utilidades;

public class Fachada implements IControladorCliente,IControladorFuncionario,IControladorProduto,
								IControladorFiliado,IControladorVenda,IControladorEmpresa,IUtilidades{
	
	private static Fachada  instancia;
	private IControladorCliente controladorCliente;
	private IControladorFuncionario controladorFuncionario;
	private IControladorProduto controladorProduto;
	private IControladorFiliado controladorFiliado;
	private IControladorVenda controladorVenda;
	private IControladorEmpresa controladorEmpresa;
	private IUtilidades utilidades;
	
	public static Fachada getInstance(){
		if (instancia == null ){
			instancia = new Fachada();
		}
		return instancia;
	}
	private  Fachada() {
		controladorCliente = ControladorCliente.getInstance();
		controladorFuncionario = ControladorFuncionario.getInstance();
		controladorProduto = ControladorProduto.getInstance();
		controladorFiliado = ControladorFiliado.getInstance();
		controladorVenda = ControladorVenda.getInstance();
		controladorEmpresa = ControladorEmpresa.getInstance();
		utilidades = Utilidades.getInstance();
		
	}

	@Override
	public void inserirClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.inserirClientePF(clientePF);
	}

	@Override
	public void excluirCliente(Cliente cliente) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.excluirCliente(cliente);
	}

	@Override
	public void excluirClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.excluirClientePeloNome(nome);
	}

	@Override
	public ClientePF pesquisarClientePeloCPF(String cpf) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloCPF(cpf);
	}

	@Override
	public ClientePF pesquisarClientePeloNome(String nome) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloNome(nome);
	}

	@Override
	public void inserirClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.inserirClientePJ(clientePJ);
	}

	@Override
	public ClientePJ pesquisarClientePeloCNPJ(String cnpj) throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.pesquisarClientePeloCNPJ(cnpj);
	}
	@Override
	public ArrayList<Cliente> listarClientes() throws ClienteException, RepositorioClienteException {
		return this.controladorCliente.listarClientes();
	}
	@Override
	public void atualizarClientePF(ClientePF clientePF) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.atualizarClientePF(clientePF);
	}
	@Override
	public void atualizarClientePJ(ClientePJ clientePJ) throws ClienteException, RepositorioClienteException {
		this.controladorCliente.atualizarClientePJ(clientePJ);
	}
	
	/**    Funcionarios    */
	@Override
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.inserirFuncionario(funcionario);
	}
	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.excluirFuncionario(funcionario);
	}
	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		this.controladorFuncionario.excluirFuncionarioPeloNome(nome);
	}
	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf) throws FuncionarioException, RepositorioFuncionarioException {
		return this.controladorFuncionario.pesquisarFuncionarioPeloCPF(cpf);
	}
	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		return controladorFuncionario.pesquisarFuncionarioPeloNome(nome);
	}
	@Override
	public Funcionario[] pesquisarFuncionarioPeloBairro(String bairro)throws FuncionarioException, RepositorioFuncionarioException {
		return controladorFuncionario.pesquisarFuncionarioPeloBairro(bairro);
	}
	
	/**   Produto  */
	@Override
	public void inserirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.inserirProduto(produto);
	}
	@Override
	public void excluirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.excluirProduto(produto);
	}
	@Override
	public void excluirProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.excluirProdutoPeloNome(nome);
	}
	@Override
	public Produto pesquisarProdutoPeloCodigo(int codigo) throws ProdutoException, RepositorioProdutoException {
		return this.controladorProduto.pesquisarProdutoPeloCodigo(codigo);
	}
	@Override
	public Produto pesquisarProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		return this.pesquisarProdutoPeloNome(nome);	
		}
	@Override
	public ArrayList<Produto> listarProdutos() throws ProdutoException, RepositorioProdutoException {
		return this.controladorProduto.listarProdutos();
	}
	@Override
	public void atualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.controladorProduto.atualizarProduto(produto);
	}
		
	/** Filiado */
	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.inserirFiliado(filiado);
	}
	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.controladorFiliado.excluirFiliado(filiado);
	}
	
	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		 this.controladorFiliado.excluirFiliadoPeloNome(nome);
	}
	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.pesquisarFiliadoPeloCNPJ(cnpj);
	}
	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.pesquisarFiliadoPeloNome(nome);
	}
	@Override
	public Filiado[] pesquisarFiliadoPeloTipoFornecimento(String tipoFornecimento) throws FiliadoException, RepositorioFiliadoException {
		return this.controladorFiliado.pesquisarFiliadoPeloTipoFornecimento(tipoFornecimento);
	}
	
	/** Venda*/
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.inserirVenda(venda);
	}
	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.controladorVenda.excluirVenda(venda);
	}
	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		this.controladorVenda.excluirVendaPeloCodigo(codigo);
	}
	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.pesquisarVendaPeloCodigo(codigo);
	}
	@Override
	public Venda[] pesquisarVendaPeloTipo(int tipoPagamento) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.pesquisarVendaPeloTipo(tipoPagamento);
	}
	@Override
	public Produto pesquisaPreco(String nomeProduto) throws VendaException, RepositorioVendaException {
		return this.controladorVenda.pesquisaPreco(nomeProduto);
	}
	@Override
	public void calcularValorRecebido(double preco) throws VendaException, RepositorioVendaException {
		this.calcularValorRecebido(preco);
	}
	@Override
	public int pesquisarCodProduto(int codigo) throws VendaException, RepositorioVendaException {
		return codigo;
	}
	
	/**Empresa */
	@Override
	public void inserirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.inserirEmpresa(empresa);
		}
	@Override
	public void excluirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.excluirEmpresa(empresa);
	}
	@Override
	public void excluirEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.excluirEmpresaPeloNome(nome);
	}
	@Override
	public Empresa pesquisarEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.pesquisarEmpresaPeloNome(nome);
	}
	@Override
	public Empresa pesquisarEmpresaPeloCNPJ(String cnpj) throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.pesquisarEmpresaPeloCNPJ(cnpj);
	}
	@Override
	public ArrayList<Empresa> listarEmpresas() throws EmpresaException, RepositorioEmpresaException {
		return this.controladorEmpresa.listarEmpresas();
	}
	@Override
	public void atualizarEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.controladorEmpresa.atualizarEmpresa(empresa);
	}
	



	
	
	/**Utilidades*/
	@Override
	public void cadastrarEndereco(Endereco e) {
	this.utilidades.cadastrarEndereco(e);
		
	}

	@Override
	public ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll) {
		return this.utilidades.listarClientesAll(arrayClientesAll);
	}
	@Override
	public ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll) {
		return this.utilidades.listarClientesPJAll(arrayClientesPJAll);
	}

	}
