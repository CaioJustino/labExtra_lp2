// Pacotes
package labExtra_lp2;

public class Funcionario extends Entregador implements Fretavel {
	// Super Construtor
	public Funcionario(String nome) {
		super(nome);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5.00;
	}
}