package PooProject.ProjetoAP2.Repositorio;



import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.RepositorioVendaException;
import PooProject.ProjetoAP2.Excecao.VendaException;
import PooProject.ProjetoAP2.Modelo.Venda;

public class RepositorioVenda implements IRepositorioVenda{
	 
	private static RepositorioVenda instancia ;
	private ArrayList<Venda> arrayVenda;
	
	public static RepositorioVenda getInstance(){
		if (instancia == null) {
			instancia = new RepositorioVenda();			
		}
		return instancia;
	}
	private RepositorioVenda() {
		if (arrayVenda == null) {
			arrayVenda = new ArrayList<Venda>();
		}
		
	}
	@Override
	public void inserirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		arrayVenda.add(venda);
	}

	@Override
	public void excluirVenda(Venda venda) throws VendaException, RepositorioVendaException {
		for (int i = 0; i < arrayVenda.size(); i++){
			if (arrayVenda.get(i) == venda){
				arrayVenda.remove(i);
				break;
			}
		}
		if(venda == null){
			throw new RepositorioVendaException("Venda não localizada");
		}

	}

	@Override
	public void excluirVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		for (int i = 0; i < arrayVenda.size(); i++){
			if (arrayVenda.get(i).getCodVenda() == codigo){
				arrayVenda.remove(i);
				break;
			}
		}
	/*	if(codigo == 0){
			throw new RepositorioVendaException("Venda não localizada");
		}
	*/
	}

	@Override
	public Venda pesquisarVendaPeloCodigo(int codigo) throws VendaException, RepositorioVendaException {
		Venda venda = null;
		for (int i = 0 ; i <arrayVenda.size(); i++){
			if (arrayVenda.get(i).getCodVenda()==(codigo)){
				venda = arrayVenda.get(i);
				break;
			}
		}
		if (venda == null){
			throw new RepositorioVendaException("Venda não localizado");
		}
		return venda;

	}

	@Override
	public Venda[] pesquisarVendaPeloTipo(int tipoPagamento) throws VendaException, RepositorioVendaException {
		Venda [] vendas = null;
		int cont = 0;
		for (int i = 0 ; i <arrayVenda.size(); i++){
			if (arrayVenda.get(i).getTipoPagamento()==(tipoPagamento)){
				cont++;
			}
		}
		if (cont > 0) {
			vendas = new Venda[cont];
			int p = 0;
			for (int i = 0; i < arrayVenda.size(); i++) {
				if (arrayVenda.get(i) != null && arrayVenda.get(i).getTipoPagamento()==(tipoPagamento))  {
					vendas[p] = arrayVenda.get(i);
					p++;
				}
				
			}
			return vendas;
		}
		else {
			throw new RepositorioVendaException("Venda não foi localizada ");
		}
	}
}
