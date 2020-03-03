package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.ProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioProdutoException;
import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Produto;
import PooProject.ProjetoAP2.Modelo.Venda;

public interface IControladorVenda {
	public void inserirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVenda(Venda venda) throws VendaException,RepositorioVendaException ;
	public void excluirVendaPeloCodigo(int codigo) throws VendaException,RepositorioVendaException ;
	public Venda pesquisarVendaPeloCodigo(int codigo)throws VendaException,RepositorioVendaException ;
	public Venda [] pesquisarVendaPeloTipo (int tipoPagamento)throws VendaException,RepositorioVendaException ;
	public Produto pesquisaPreco(String nomeProduto) throws VendaException,RepositorioVendaException; 
	public int pesquisarCodProduto(int codigo)throws VendaException,RepositorioVendaException, ProdutoException, RepositorioProdutoException;
	public void calcularValorRecebido(double preco)throws VendaException,RepositorioVendaException;
}
