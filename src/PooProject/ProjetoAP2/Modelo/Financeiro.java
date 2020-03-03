package PooProject.ProjetoAP2.Modelo;

public class Financeiro {
	
	private double patrimonio;
	private double gastoMensalFuncionario;
	private double gastoMensalProduto;
	private double gastoDispesasMensal;//agua,luz,etc..
	private double gastoMensalPropoganda;
	private double ganhoMensalVendas;
	
	private Filiado filiado;
	private Funcionario funcionario;
	private Produto produto;
	private Venda venda;
	
	
	public Financeiro(double patrimonio, double gastoMensalFuncionario, double gastoMensalProduto,
			double gastoDispesasMensal, double gastoMensalPropoganda, double ganhoMensalVendas, Filiado filiado,
			Funcionario funcionario, Produto produto, Venda venda) {
		super();
		this.patrimonio = patrimonio;
		this.gastoMensalFuncionario = gastoMensalFuncionario;
		this.gastoMensalProduto = gastoMensalProduto;
		this.gastoDispesasMensal = gastoDispesasMensal;
		this.gastoMensalPropoganda = gastoMensalPropoganda;
		this.ganhoMensalVendas = ganhoMensalVendas;
		this.filiado = filiado;
		this.funcionario = funcionario;
		this.produto = produto;
		this.venda = venda;
	}

	public Financeiro() {
		super();
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public double getGastoMensalFuncionario() {
		return gastoMensalFuncionario;
	}

	public void setGastoMensalFuncionario(double gastoMensalFuncionario) {
		this.gastoMensalFuncionario = gastoMensalFuncionario;
	}

	public double getGastoMensalProduto() {
		return gastoMensalProduto;
	}

	public void setGastoMensalProduto(double gastoMensalProduto) {
		this.gastoMensalProduto = gastoMensalProduto;
	}

	public double getGastoDispesasMensal() {
		return gastoDispesasMensal;
	}

	public void setGastoDispesasMensal(double gastoDispesasMensal) {
		this.gastoDispesasMensal = gastoDispesasMensal;
	}

	public double getGastoMensalPropoganda() {
		return gastoMensalPropoganda;
	}

	public void setGastoMensalPropoganda(double gastoMensalPropoganda) {
		this.gastoMensalPropoganda = gastoMensalPropoganda;
	}

	public double getGanhoMensalVendas() {
		return ganhoMensalVendas;
	}

	public void setGanhoMensalVendas(double ganhoMensalVendas) {
		this.ganhoMensalVendas = ganhoMensalVendas;
	}
	

	public Filiado getFiliado() {
		return filiado;
	}

	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	@Override
	public String toString() {
		return "Finaceiro [patrimonio=" + patrimonio + ", gastoMensalFuncionario=" + gastoMensalFuncionario
				+ ", gastoMensalProduto=" + gastoMensalProduto + ", gastoDispesasMensal=" + gastoDispesasMensal
				+ ", gastoMensalPropoganda=" + gastoMensalPropoganda + ", ganhoMensalVendas=" + ganhoMensalVendas
				+ ", filiado=" + filiado + ", funcionario=" + funcionario + ", produto=" + produto + ", venda=" + venda
				+ "]";
	}

	
	
	
	
	

}
