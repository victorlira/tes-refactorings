public class Aluno {
	
	private String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirNome() {
		System.out.println(this.getNome());
	}
}