package livraria;

public abstract class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	// Construtores
	public Produto(String nome, double preco) {
		setNome(nome);
		setPreco(preco);
		this.quantidadeEstoque = 0;
	}
	
	public Produto(String nome, double preco, int quantidadeEstoque) {
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidadeEstoque);
	}
	
	// Método abstrato
	public abstract void exibirDetalhes();

	
	public void adicionarEstoque(int quantidade) {
		if (quantidade > 0) {
			setQuantidade(getQuantidade() + quantidade);
		} else {
			System.out.println("Quantidade para adicionar deve ser maior que zero.");
		}
	}
	
	public boolean darBaixaEstoque(int quantidade) {
		if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
			setQuantidade(getQuantidade() - quantidade);
			return true;
		}
		System.out.println("Estoque insuficiente ou quantidade inválida.");
		return false;
	}
	
	// Getters e Setters 
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		} else {
			this.nome = "Produto Sem Nome";
		}
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("O preço não pode ser negativo.");
		}
	}
	
	public int getQuantidade() {
		return this.quantidadeEstoque;
	}
	
	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidadeEstoque = quantidade;
		} else {
			System.out.println("A quantidade em estoque não pode ser negativa.");
		}
	}
}
