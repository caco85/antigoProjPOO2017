package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;
import PooProject.ProjetoAP2.Repositorio.RepositorioProduto;
import PooProject.ProjetoAP2.Repositorio.RepositorioVenda;

public class ControladorVenda implements IControladorVenda {
	
	private static ControladorVenda instancia;
	private RepositorioVenda repVenda;
	private RepositorioProduto repProduto;
	
	public static ControladorVenda getInstance(){
		if (instancia == null) {
			instancia = new ControladorVenda();
		}
		return instancia;
	}
	public ControladorVenda() {
		repVenda = RepositorioVenda.getInstance();
		repProduto = RepositorioProduto.getInstance();
	}
	
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.repVenda.inserirVenda(venda);
	}

	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		this.repVenda.excluirVenda(venda);
	}

	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		this.repVenda.excluirVendaPeloCodigo(codigo);
	}

	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		return this.repVenda.pesquisarVendaPeloCodigo(codigo);
	}

	@Override
	public Venda[] pesquisarVendaPeloTipo(int tipoPagamento) throws VendaException, RepositorioVendaException {
		return repVenda.pesquisarVendaPeloTipo(tipoPagamento);
	}

	@Override
	public Produto pesquisaPreco(String nomeProduto) throws VendaException, RepositorioVendaException {
		return this.pesquisaPreco(nomeProduto);
	}

	@Override
	public void calcularValorRecebido(double preco) throws VendaException, RepositorioVendaException {
		
	}

	@Override
	public int pesquisarCodProduto(int codigo) throws VendaException, RepositorioVendaException, ProdutoException, RepositorioProdutoException {
		this.repProduto.pesquisarProdutoPeloCodigo(codigo);
		return codigo;
	}

}
