package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
	ArrayList<Moeda> lista = new ArrayList<Moeda>();

	
	public void add () {	
		//lista.add(new Real(0.25));		
		//lista.add(new Dolar(1));	
		//lista.add(new Euro(1));
	}
	
	public void remove () {
		if (lista.isEmpty()) {
			System.out.println("Sorry!");
		} else {
			for (Moeda i : lista) {
				System.out.printf("Operacao: %d - ", lista.indexOf(i));
				i.info();
			}
			int num=0;
			Scanner in = new Scanner(System.in);
	        System.out.println("Selecione a operação que deseja deletar: ");
	        num=in.nextInt();
	        System.out.printf("Remover Operação: %d\n\n", num);
	        lista.remove(num);		
			}
		}
	public void lista() {
		for (Moeda i : lista) {
			i.info();
			//System.out.println(lista.indexOf(i));
			}

		}

	public double calcularTotal() {
		double total=0;
		for(Moeda i : lista)  {
			total += i.getValor();
		} 
		System.out.printf("O total no cofrinho eh: %.2f \n\n", total);
		return total;
		}
	
//End Code
}
