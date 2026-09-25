package livraria;

public class Revista extends Produto{
	private int edicao;
	private String editora;
	
	public Revista(String nome, double preco, int quantidade, int edicao, String editora) {
		super(nome, preco, quantidade);
		this.edicao = edicao;
		this.editora = editora;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Detalhe Revista");
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: " + String.format("%.2f", getPreco()) );
		System.out.println("Edição: " + getEdicao());
		System.out.println("Editora: " + getEditora());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println();
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
