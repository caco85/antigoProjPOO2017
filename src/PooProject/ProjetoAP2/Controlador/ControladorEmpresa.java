package PooProject.ProjetoAP2.Controlador;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.EmpresaException;
import PooProject.ProjetoAP2.Excecao.RepositorioEmpresaException;
import PooProject.ProjetoAP2.Modelo.Empresa;
import PooProject.ProjetoAP2.Repositorio.RepositorioEmpresa;

public class ControladorEmpresa implements IControladorEmpresa{
	
	private static ControladorEmpresa instancia ;
	private RepositorioEmpresa repEmpresa;
	
	public static ControladorEmpresa getInstance(){
		if(instancia == null){
			instancia = new ControladorEmpresa();
		}
		return instancia;
	}
	public ControladorEmpresa() {
		repEmpresa = RepositorioEmpresa.getInstance();
	}

	@Override
	public void inserirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.repEmpresa.inserirEmpresa(empresa);
	}

	@Override
	public void excluirEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.repEmpresa.excluirEmpresa(empresa);
	}

	@Override
	public void excluirEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		this.repEmpresa.excluirEmpresaPeloNome(nome);
	}

	@Override
	public Empresa pesquisarEmpresaPeloNome(String nome) throws EmpresaException, RepositorioEmpresaException {
		return this.repEmpresa.pesquisarEmpresaPeloNome(nome);
	}

	@Override
	public Empresa pesquisarEmpresaPeloCNPJ(String cnpj) throws EmpresaException, RepositorioEmpresaException {
		return this.pesquisarEmpresaPeloCNPJ(cnpj);
	}

	@Override
	public ArrayList<Empresa> listarEmpresas() throws EmpresaException, RepositorioEmpresaException {
		return this.repEmpresa.listarEmpresas();
	}

	@Override
	public void atualizarEmpresa(Empresa empresa) throws EmpresaException, RepositorioEmpresaException {
		this.repEmpresa.atualizarEmpresa(empresa);
	}

}
