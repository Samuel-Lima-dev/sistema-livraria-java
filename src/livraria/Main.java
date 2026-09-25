package livraria;

public class Main {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("livro 01", 89.9, 10, "autor qualquer", "54-523-365-325-66");
		livro1.exibirDetalhes();
		
		Revista revista = new Revista("Revista 01", 30.50, 5, 5, "Editora qualquer" );
		revista.exibirDetalhes();
	}

}
