package livraria;

public class Livro extends Produto{
	private String autor;
	private String isbn;
	
	public Livro(String nome, double preco, int quantidade, String autor, String isbn) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.isbn = isbn;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Detalhe Livro");
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: " + String.format("%.2f", getPreco()) );
		System.out.println("Autor: " + getAutor());
		System.out.println("Isbn: " + getIsbn());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println();
		
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
