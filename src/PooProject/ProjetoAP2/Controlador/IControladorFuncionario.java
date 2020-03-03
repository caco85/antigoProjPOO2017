package PooProject.ProjetoAP2.Controlador;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;

public interface IControladorFuncionario {
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException;
	public void excluirFuncionario (Funcionario funcionario)throws FuncionarioException,RepositorioFuncionarioException;
	public void  excluirFuncionarioPeloNome(String nome)throws FuncionarioException,RepositorioFuncionarioException;
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)throws FuncionarioException,RepositorioFuncionarioException;
	public Funcionario  pesquisarFuncionarioPeloNome(String nome)throws FuncionarioException,RepositorioFuncionarioException;
	public Funcionario[] pesquisarFuncionarioPeloBairro(String bairro)throws FuncionarioException,RepositorioFuncionarioException;
	
}
