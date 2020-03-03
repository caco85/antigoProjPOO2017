package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;
import PooProject.ProjetoAP2.Repositorio.RepositorioFuncionario;

public class ControladorFuncionario implements IControladorFuncionario{
	
	public RepositorioFuncionario repFuncinario; 
	public static ControladorFuncionario instancia;
	
	public static ControladorFuncionario getInstance(){
	 if (instancia == null) {
		 instancia = new ControladorFuncionario();
	}	
	 return instancia;
	}
	

	@Override
	public void inserirFuncionario(Funcionario funcionario)	throws FuncionarioException, RepositorioFuncionarioException {
		this.repFuncinario.inserirFuncionario(funcionario);
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		this.repFuncinario.excluirFuncionario(funcionario);
	}

	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		this.repFuncinario.excluirFuncionarioPeloNome(nome);
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)	throws FuncionarioException, RepositorioFuncionarioException {
		return repFuncinario.pesquisarFuncionarioPeloCPF(cpf);
	}

	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		return repFuncinario.pesquisarFuncionarioPeloNome(nome);
	}

	@Override
	public Funcionario[] pesquisarFuncionarioPeloBairro(String bairro)throws FuncionarioException, RepositorioFuncionarioException {
		return repFuncinario.pesquisarFuncionarioPeloBairro(bairro);
	}

}
