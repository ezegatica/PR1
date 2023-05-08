package ejercicio01;

public class Main {

	public static void main(String[] args) {
		Plantel p = new Plantel();
		p.popular();
		
		for(double m: p.montosPorCajero()) {
			System.out.println(m);
		};
		
		for(InformePedido i: p.informePedidos()) {
			System.out.printf("Monto: %f | Apellido %s | Bateria %d \n", i.monto, i.apellido, i.bateria);
		};
	}
}
