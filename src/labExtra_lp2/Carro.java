// Pacotes
package labExtra_lp2;

public class Carro extends Veiculo implements Fretavel {
	// Super Construtor 
	public Carro(String placa, int ano) {
		super(placa, ano);
	}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 1.25;
	}
}