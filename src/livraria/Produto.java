package livraria;

public abstract class Produto {
	private String nome;
	private double preco;
	private String isbn;
	private int quantidadeEstoque;
	
	//Construtor
	public Produto(String nome, double preco, String isnb){
		setNome(nome);
		setPreco(preco);
		setIsbn(isbn);
	}
	
	public abstract void exibirDetalhes();
	
	public void adicionarEstoque(int quantidade) {
		
		if(quantidade > 0) {
			this.setQuantidade(getQuantidade()+quantidade);
		}
	}
	
	public boolean darBaixaEstoque(int quantidade) {
		if(quantidade > 0 && this.quantidadeEstoque >= quantidade) {
			setQuantidade(getQuantidade()-quantidade);
			return true;
		}
		return false;
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
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getQuantidade() {
		return this.quantidadeEstoque;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidadeEstoque = quantidade;
		}
	}
	
}
