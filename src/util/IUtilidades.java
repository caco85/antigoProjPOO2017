package util;

import java.util.ArrayList;

import PooProject.ProjetoAP2.Modelo.ClientePF;
import PooProject.ProjetoAP2.Modelo.ClientePJ;
import PooProject.ProjetoAP2.Modelo.Endereco;

public interface IUtilidades {
	public  void cadastrarEndereco(Endereco e);
	public  ArrayList<ClientePF> listarClientesAll(ArrayList<ClientePF> arrayClientesAll);
	public  ArrayList<ClientePJ> listarClientesPJAll(ArrayList<ClientePJ> arrayClientesPJAll);

}
