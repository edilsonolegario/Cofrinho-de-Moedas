package empresa;

public class Real extends Moeda {

	Real(double v){
		super(v);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		System.out.println("Real: " + valor);
	}
	
	public double getValor() {
		return valor;
	}
}
