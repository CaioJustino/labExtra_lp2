// Pacotes
package labExtra_lp2;

// Imports
import java.util.ArrayList;

public class ServicoDeEntrega {
	private ArrayList<Fretavel> lista;
	
	// Construtor
	public ServicoDeEntrega() {
        this.lista = new ArrayList<>();
    }
	
	// Getters
	public ArrayList<Fretavel> getLista() {
		return lista;
	}
	
	// Setters
	public void setLista(ArrayList<Fretavel> l) {
		this.lista = l;
	}
	
	public double calcularCustoTotal(double distanciaEmKm) {
		double custoTotal = 0;
		for (Fretavel c : lista) {
			custoTotal += c.calcularCustoFrete(distanciaEmKm);
		}
		return custoTotal;
	}
}