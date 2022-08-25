package empresa;

public class Dolar extends Moeda {

	Dolar(double v){
		super(v);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		System.out.println("Dolar: " + valor);
	}

	public double getValor() {
		valor*=5;
		return valor;
	}
}
