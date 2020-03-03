package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;
import PooProject.ProjetoAP2.Repositorio.RepositorioFiliado;

public class ControladorFiliado implements IControladorFiliado{
	private static ControladorFiliado instancia;
	private RepositorioFiliado repFiliado;
	
	public static ControladorFiliado getInstance() {
		if (instancia == null){
			instancia = new ControladorFiliado();
		}
		return instancia;
	}
	public ControladorFiliado() {
		repFiliado = RepositorioFiliado.getInstance();
	}
	


	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.repFiliado.inserirFiliado(filiado);
	}

	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		this.repFiliado.excluirFiliado(filiado);
	}

	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		this.repFiliado.excluirFiliadoPeloNome(nome);
		
	}

	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.pesquisarFiliadoPeloCNPJ(cnpj);
	}

	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.pesquisarFiliadoPeloNome(nome);
	}

	@Override
	public Filiado[] pesquisarFiliadoPeloTipoFornecimento(String tipoFornecimento)	throws FiliadoException, RepositorioFiliadoException {
		return this.repFiliado.pesquisarFiliadoPeloTipoFornecimento(tipoFornecimento);
	}

}
