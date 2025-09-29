// Pacotes
package labExtra_lp2;

public abstract class Veiculo {
	private String placa;
	private int ano;
	
	// Construtor
	public Veiculo(String p, int a) {
		this.placa = p;
		this.ano = a;
	}
	
	// Getters
	public String getPlaca() {
		return placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	// Setters
	public void setPlaca(String p) {
		this.placa = p;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
}