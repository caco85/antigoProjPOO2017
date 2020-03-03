package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Repositorio.RepositorioProduto;

public class ControladorProduto implements IControladorProduto {
	
	public RepositorioProduto repProduto;
	public static ControladorProduto instancia;
	
	public static ControladorProduto getInstance(){
		if (instancia == null) {
			instancia = new ControladorProduto();
		}
		return instancia;
	}
	public ControladorProduto() {
		repProduto = RepositorioProduto.getInstance();
	}

	@Override
	public void inserirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.inserirProduto(produto);
	}

	@Override
	public void excluirProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.excluirProduto(produto);
		
	}

	@Override
	public void excluirProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.excluirProdutoPeloNome(nome);
	}

	@Override
	public Produto pesquisarProdutoPeloCodigo(int codigo) throws ProdutoException, RepositorioProdutoException {
		return repProduto.pesquisarProdutoPeloCodigo(codigo);
	}

	@Override
	public Produto pesquisarProdutoPeloNome(String nome) throws ProdutoException, RepositorioProdutoException {
		return repProduto.pesquisarProdutoPeloNome(nome);
	}
	@Override
	public ArrayList<Produto> listarProdutos() throws ProdutoException, RepositorioProdutoException {

		return repProduto.listarProdutos();
	}
	@Override
	public void atualizarProduto(Produto produto) throws ProdutoException, RepositorioProdutoException {
		this.repProduto.atualizarProduto(produto);
	}

}
