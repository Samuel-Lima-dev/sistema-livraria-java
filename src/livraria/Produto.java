package livraria;

public abstract class Produto {
	private String nome;
	private double preco;
	private String isbn;
	
	//Construtor
	public Produto(String nome, double preco, String isnb){
		setNome(nome);
		setPreco(preco);
		setIsbn(isbn);
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double valor) {
		if(valor > 0) {
			this.preco = valor;
		}
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
