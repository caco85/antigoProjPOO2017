package util;

import java.util.ArrayList;
import java.util.Scanner;

import PooProject.ProjetoAP2.Modelo.Cliente;
import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Endereco;

public class Utilidades implements IUtilidades {
	private static Utilidades instancia;
	 static Scanner scanner = new Scanner(System.in);
	 
	 
	public static Utilidades getInstance(){
		if (instancia == null ){
			instancia = new Utilidades();
		}
		return instancia;
	}

	@Override
	public void cadastrarEndereco(Endereco e) {
		
		
		
		System.out.println("Digite o Nome da Rua");
		e.setNomeRua(scanner.nextLine());
		System.out.println("Digite o numero da Casa");
		e.setNumCasa(scanner.nextInt());
		System.out.println("Digite o Complento");
		e.setComplemento(scanner.next());
		System.out.println("Digite o cep");
		e.setCep(scanner.next());
		System.out.println("Digite o Bairro");
		e.setBairro(scanner.next());
		System.out.println("Digite a Cidade");
		e.setCidade(scanner.next());
		System.out.println("Digite o Estado");
		e.setEstado(scanner.next());
		
	}




	@Override
	public ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll) {
		if (arrayClientesPJAll != null){
			
			for (int i = 0; i< arrayClientesPJAll.size(); i++){
				arrayClientesPJAll.get(i);
					System.out.println("Codigo do Cliente : "+arrayClientesPJAll.get(i).getCodCliente()+ "Razão Social : " + arrayClientesPJAll.get(i).getRazaoSocial() + " - CNPJ: " + arrayClientesPJAll.get(i).getCNPJ()
							+"Data da fundação :  "+ arrayClientesPJAll.get(i).getDataFundacao()+"Nome Fantasia :  "+ arrayClientesPJAll.get(i).getNomeFantasia() +"Inscrição Estadual" + arrayClientesPJAll.get(i).getInscricaoEstadual()
							+"Email :" +arrayClientesPJAll.get(i).getEmail()+ " Telefone" +arrayClientesPJAll.get(i).getTelefone() + ""+arrayClientesPJAll.get(i).getEndereco());		
			}
		}
		return arrayClientesPJAll;
	}

	@Override
	public ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll) {
		if (arrayClientesAll != null){
			
			for (int i = 0; i< arrayClientesAll.size(); i++){
				arrayClientesAll.get(i);
					System.out.println("Codigo do Cliente : "+arrayClientesAll.get(i).getCodCliente()+ "Nome do Cliente : " + arrayClientesAll.get(i).getNome() + " - CPF: " + arrayClientesAll.get(i).getCPF()
							+"Email :" +arrayClientesAll.get(i).getEmail()+"Data de Nascimento :  "+ arrayClientesAll.get(i).getDataNascimento()+ " Telefone" +arrayClientesAll.get(i).getTelefone() 
							+ ""+arrayClientesAll.get(i).getEndereco());
			
			}
		}
		return arrayClientesAll;
	}
}
