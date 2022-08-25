package empresa;

public class Euro extends Moeda {

	Euro(double v){
		super(v);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		System.out.println("Euro: " + valor);
	}
	
	public double getValor() {
		valor*=5;
		return valor;
	}

}
