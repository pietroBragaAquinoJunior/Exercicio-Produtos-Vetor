package entities;

public class Produto {

	private String Nome;
	private double Preco;
	
	public Produto(String nome, double preco) {
		Nome = nome;
		Preco = preco;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}
	
}
