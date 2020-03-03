package PooProject.ProjetoAP2.Repositorio;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Excecao.FuncionarioException;
import PooProject.ProjetoAP2.Excecao.RepositorioFuncionarioException;
import PooProject.ProjetoAP2.Modelo.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario{
	
	private ArrayList<Funcionario> arrayFuncionarios;
	private static RepositorioFuncionario instancia;
	
	public static RepositorioFuncionario getInstance(){
		if (instancia == null) {
			instancia = new RepositorioFuncionario();
			
		}
		return instancia;
	}	
	
	public  RepositorioFuncionario() {
		if (arrayFuncionarios == null){
			arrayFuncionarios = new ArrayList<Funcionario>();
		}
	}
	

	@Override
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		arrayFuncionarios.add(funcionario);
	}

	@Override
	public void excluirFuncionario(Funcionario funcionario) throws FuncionarioException, RepositorioFuncionarioException {
		for (int i = 0; i < arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i) == funcionario){
				arrayFuncionarios.remove(i);
				break;
			}
		}
		if(funcionario == null){
			throw new RepositorioFuncionarioException("Funcionário não localizado");
		}

	}

	@Override
	public void excluirFuncionarioPeloNome(String nome) throws FuncionarioException, RepositorioFuncionarioException {
		for (int i = 0; i < arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getNomeFuncionario().equals(nome)){
				arrayFuncionarios.remove(i);
				break;
			}
		}
		if(nome == null){
			throw new RepositorioFuncionarioException("Funcionario não localizado");
		}	

	}

	@Override
	public Funcionario pesquisarFuncionarioPeloCPF(String cpf)throws FuncionarioException, RepositorioFuncionarioException {
		Funcionario funcionario = null;
		for (int i = 0 ; i <arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getCpf().equals(cpf)){
				funcionario = arrayFuncionarios.get(i);
				break;
			}
		}
		if (funcionario == null){
			throw new RepositorioFuncionarioException("Funcionario não localizado");
		}
		return funcionario;

	}

	@Override
	public Funcionario pesquisarFuncionarioPeloNome(String nome)throws FuncionarioException, RepositorioFuncionarioException {	
		Funcionario funcionario = null;
		for (int i = 0 ; i <arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getNomeFuncionario().equals(nome)){
				funcionario = arrayFuncionarios.get(i);
				break;
			}
		}
		if (funcionario == null){
			throw new RepositorioFuncionarioException("Funcionario não localizado");
		}
		return funcionario;

	}

	@Override
	public Funcionario[] pesquisarFuncionarioPeloBairro(String bairro)throws FuncionarioException, RepositorioFuncionarioException {
		Funcionario [] funcionarios = null;
		int cont = 0;
		for (int i = 0 ; i <arrayFuncionarios.size(); i++){
			if (arrayFuncionarios.get(i).getEndereco().getBairro().equals(bairro)){
				cont++;
			}
			
		}
		if (cont > 0) {
			funcionarios = new Funcionario[cont];
			int p = 0;
			for (int i = 0; i < arrayFuncionarios.size(); i++) {
				if (arrayFuncionarios.get(i) != null && arrayFuncionarios.get(i).getEnd().getBairro().equals(bairro))  {
					funcionarios[p] = arrayFuncionarios.get(i);
					p++;
				}
				
			}
			return funcionarios;
		}
		else {
			throw new RepositorioFuncionarioException("Funcionario não foi localizado ");
		}
		
	}

}
