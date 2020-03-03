package PooProject.ProjetoAP2.Modelo;

public class Produto {
	
	private int codProduto;
	private String nomeProduto;
	private int qtdProduto;
	private double preco;
	
	public Produto(int codProduto, String nomeProduto, int qtdProduto, double preco) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.qtdProduto = qtdProduto;
		this.preco = preco;
	}

	public Produto() {
		super();
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", qtdProduto=" + qtdProduto
				+ ", preco=" + preco + "]";
	}
	
	
	
}
