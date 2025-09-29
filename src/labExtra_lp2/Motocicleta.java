// Pacotes
package labExtra_lp2;

public class Motocicleta extends Veiculo implements Fretavel {
	// Super Construtor 
	public Motocicleta(String placa, int ano) {
		super(placa, ano);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.45;
	}
}