package PooProject.ProjetoAP2.Modelo;

public class Filiado {
	
	private int codFiliado;
	private String nomeFiliado;
	private String cnpj;
	private String tipoFornecimento;
	private String email;
	private String telefone;
	private int qtdFornecida;
	private double valorUnidade;
	private double valorRecebido;
	
	public Filiado(int codFiliado, String nomeFiliado,String cnpj, String tipoFornecimento, String email, String telefone,
			int qtdFornecida, double valorUnidade, double valorRecebido) {
		super();
		this.codFiliado = codFiliado;
		this.nomeFiliado = nomeFiliado;
		this.cnpj = cnpj;
		this.tipoFornecimento = tipoFornecimento;
		this.email = email;
		this.telefone = telefone;
		this.qtdFornecida = qtdFornecida;
		this.valorUnidade = valorUnidade;
		this.valorRecebido = valorRecebido;
	}
	
	public Filiado(){
		super();
	}

	public int getCodFiliado() {
		return codFiliado;
	}

	public void setCodFiliado(int codFiliado) {
		this.codFiliado = codFiliado;
	}

	public String getNomeFiliado() {
		return nomeFiliado;
	}

	public void setNomeFiliado(String nomeFiliado) {
		this.nomeFiliado = nomeFiliado;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoFornecimento() {
		return tipoFornecimento;
	}

	public void setTipoFornecimento(String tipoFornecimento) {
		this.tipoFornecimento = tipoFornecimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtdFornecida() {
		return qtdFornecida;
	}

	public void setQtdFornecida(int qtdFornecida) {
		this.qtdFornecida = qtdFornecida;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public double getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	@Override
	public String toString() {
		return "Filiado [codFiliado=" + codFiliado + ", nomeFiliado=" + nomeFiliado + ", CNPJ=" + cnpj
				+ ", tipoFornecimento=" + tipoFornecimento + ", email=" + email + ", telefone=" + telefone
				+ ", qtdFornecida=" + qtdFornecida + ", valorUnidade=" + valorUnidade + ", valorRecebido="
				+ valorRecebido + "]";
	}


	

}
