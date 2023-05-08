package ejercicio04;

public class Main {

	public static void main(String[] args) {
		Estacion partida = Estacion.MERCEDES; // PARTIDA
		
		Estacion destino = Estacion.ALBERTI; // DESTINO
		
		Estacion consulta = Estacion.SUIPACHA; // MID

		
		Estacion[] xx = Estacion.values();
		boolean	pasa = pasaPor(partida, destino, consulta);
		System.out.println(pasa ? "SI PASA" : "NO PASA");
	}
	
	public static boolean pasaPor(Estacion partida, Estacion destino, Estacion consulta) {
		int P = partida.ordinal(); // PARTIDA
		int D = destino.ordinal(); // DESTINO
		int C = consulta.ordinal(); // DESTINO

		boolean pasa = false;
//		if (i1 > i2) { // VA DE ATRAS PARA ADELANTE
//			if (i1 > id && i2 < id) {
//				pasa = true;
//			}
//		} else { // VA DE ADELANTE A ATRAS
//			if (i2 > id && i1 < id) {
//				pasa = true;
//			}
//		}
		if ((P < C && D > C) || (P > C && D < C)) {
			pasa = true;
		}
		return pasa;		
	}

}
