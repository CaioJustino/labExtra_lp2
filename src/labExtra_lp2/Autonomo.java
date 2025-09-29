// Pacotes
package labExtra_lp2;

public class Autonomo extends Entregador implements Fretavel {
	// Super Construtor
	public Autonomo(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.95;
	}
}