// Pacotes
package app;

// Imports
import labExtra_lp2.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean ativo = true;
		
		while (ativo) {
			Scanner sc = new Scanner(System.in);
			ServicoDeEntrega se = new ServicoDeEntrega();
			
			System.out.println("\n  ____             _     _           \r\n"
					+ " |  _ \\ __ _ _ __ (_) __| | _____  __\r\n"
					+ " | |_) / _` | '_ \\| |/ _` |/ _ \\ \\/ /\r\n"
					+ " |  _ < (_| | |_) | | (_| |  __/>  < \r\n"
					+ " |_| \\_\\__,_| .__/|_|\\__,_|\\___/_/\\_\\\r\n"
					+ "            |_|                      ");

	        System.out.println("\nBem-vind@ ao Gestor de Frete!\nDigite o número da entrega que deseja simular:");
	        System.out.println(" 1 | Funcionario + Carro (10 km)\n 2 | Autonomo + Motocicleta (25 km)\n 3 | Encerrar");
	        System.out.print("\nInsira a sua opção: ");
	        int op = sc.nextInt();

	        switch (op) {
	            case 1:
	            	se.getLista().clear();
	            	
	                Funcionario func = new Funcionario("Carlos");
	                Carro  carro = new Carro("ABC-1234", 2025);
	                
	                se.getLista().add(func);
	                se.getLista().add(carro);
	                
	                System.out.println("Valor Total da Entrega (10 km - Funcionario + Carro): R$ " + se.calcularCustoTotal(10));
	                break;
	            case 2:
	            	se.getLista().clear();
	            	
	                Autonomo auto = new Autonomo("Daniel");
	                Motocicleta  moto = new Motocicleta("DEF-5678", 2025);
	                
	                se.getLista().add(auto);
	                se.getLista().add(moto);
	                
	                System.out.println("Valor Total da Entrega (25 km - Autonomo + Motocicleta): R$ " + se.calcularCustoTotal(25));
	                break;
	            case 3:
	                ativo = false;
	                break;
	            default:
	                System.out.println("\nOpção inválida! Tente novamente.");
	        }
		}
		
		System.out.println("Programa encerrado!");
    }
}
