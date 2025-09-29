// Pacotes
package labExtra_lp2;

public abstract class Entregador {
	private String nome;
	
	// Super Construtor
	public Entregador(String n) {
		this.nome = n;
	}
	
	// Getters
	public String getNome() {
		return nome;
	}
	
	// Setters
	public void setNome(String n) {
		this.nome = n;
	}
}