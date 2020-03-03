package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FiliadoException;
import PooProject.ProjetoAP2.Excecao.RepositorioFiliadoException;
import PooProject.ProjetoAP2.Modelo.Filiado;

public class RepositorioFiliado implements IRepositorioFiliado {
	private ArrayList<Filiado> arrayFiliado;
	private static RepositorioFiliado instancia;
	
	public static RepositorioFiliado getInstance(){
		if (instancia == null) {
			instancia = new RepositorioFiliado();
			
		}
		return instancia;
	}	
	
	public  RepositorioFiliado() {
		if (arrayFiliado == null){
			arrayFiliado = new ArrayList<Filiado>();
		}
	}

	@Override
	public void inserirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		arrayFiliado.add(filiado);
	}

	@Override
	public void excluirFiliado(Filiado filiado) throws FiliadoException, RepositorioFiliadoException {
		for (int i = 0; i < arrayFiliado.size(); i++){
			if (arrayFiliado.get(i) == filiado){
				arrayFiliado.remove(i);
				break;
			}
		}
		if(filiado == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}

	}

	@Override
	public void excluirFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		for (int i = 0; i < arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getNomeFiliado() == nome){
				arrayFiliado.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}

	}

	@Override
	public Filiado pesquisarFiliadoPeloCNPJ(String cnpj) throws FiliadoException, RepositorioFiliadoException {
		Filiado filiado = null;
		for (int i = 0 ; i <arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getCnpj().equals(cnpj)){
				filiado = arrayFiliado.get(i);
				break;
			}
		}
		if (filiado == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}
		return filiado;

	}

	@Override
	public Filiado pesquisarFiliadoPeloNome(String nome) throws FiliadoException, RepositorioFiliadoException {
		Filiado filiado = null;
		for (int i = 0 ; i <arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getNomeFiliado().equals(nome)){
				filiado = arrayFiliado.get(i);
				break;
			}
		}
		if (filiado == null){
			throw new RepositorioFiliadoException("Filiado não localizado");
		}
		return filiado;

	}

	@Override
	public Filiado[] pesquisarFiliadoPeloTipoFornecimento(String tipoFornecimento) throws FiliadoException, RepositorioFiliadoException {
		Filiado [] filiados = null;
		int cont = 0;
		for (int i = 0 ; i <arrayFiliado.size(); i++){
			if (arrayFiliado.get(i).getTipoFornecimento().equals(tipoFornecimento)){
				cont++;
			}
			
		}
		if (cont > 0) {
			filiados = new Filiado[cont];
			int p = 0;
			for (int i = 0; i < arrayFiliado.size(); i++) {
				if (arrayFiliado.get(i) != null && arrayFiliado.get(i).getTipoFornecimento().equals(tipoFornecimento))  {
					filiados[p] = arrayFiliado.get(i);
					p++;
				}
				
			}
			return filiados;
		}
		else {
			throw new RepositorioFiliadoException("Filiado não foi localizado ");
		}
		
	}

}
