package empresa;

abstract public class Moeda {
	double valor;
	
	public Moeda(double v){
		valor = v;
	}

	abstract void info();

	abstract double getValor();
	
}
