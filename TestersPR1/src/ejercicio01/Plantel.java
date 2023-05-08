package ejercicio01;

import java.util.ArrayList;

public class Plantel {
	public Cajero[] cajeros;
	public Robot[] robots;
	public ArrayList<Pedido> pedidos;
	public Plantel() {
		this.cajeros = new Cajero[5];
		this.robots = new Robot[8];
		this.pedidos = new ArrayList<>();
	}
	
	public void popular() {
		this.cajeros[0] = new Cajero(1, "Hernandez", 6);
		this.cajeros[1] = new Cajero(2, "Martinez", 2);
		this.cajeros[2] = new Cajero(3, "Perez", 5);
		this.cajeros[3] = new Cajero(4, "Dominguez", 2);
		this.cajeros[4] = new Cajero(5, "Gonzales", 4);

		this.robots[0] = new Robot("AA-22", 30);
		this.robots[1] = new Robot("AB-62", 5);
		this.robots[2] = new Robot("AC-92", 20);
		this.robots[3] = new Robot("AD-52", 60);
		this.robots[4] = new Robot("AE-85", 1);
		this.robots[5] = new Robot("AF-81", 10);
		this.robots[6] = new Robot("AG-73", 60);
		this.robots[7] = new Robot("AH-17", 3);

		this.pedidos.add(new Pedido("PEPE", this.cajeros[0].id, this.robots[0].codigo, 1000.0));
		this.pedidos.add(new Pedido("JUAN", this.cajeros[1].id, this.robots[1].codigo, 2000.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[2].id, this.robots[2].codigo, 6500.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[3].id, this.robots[3].codigo, 2500.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[4].id, this.robots[4].codigo, 300.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[1].id, this.robots[5].codigo, 5500.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[2].id, this.robots[6].codigo, 1500.0));
		this.pedidos.add(new Pedido("PEPE", this.cajeros[3].id, this.robots[7].codigo, 1000.0));
	}
	
	public double[] montosPorCajero() {
		double[] montosCajeros = new double[this.cajeros.length];
		for(Pedido p: this.pedidos) {
			montosCajeros[p.ic - 1] += p.monto;
		}
		return montosCajeros;
	}

	public InformePedido[] informePedidos() {
		InformePedido[] informes = new InformePedido[this.pedidos.size()];
		for(int i = 0; i < this.pedidos.size(); i++) {
			Pedido p = this.pedidos.get(i);
			Cajero c = this.buscarCajero(p.ic);
			Robot r = this.buscarRobot(p.cr);
			informes[i] = new InformePedido(p.monto, c.apellido, r.bateria);
		}
		return informes;
	}
	
	private Cajero buscarCajero(int id) {
		return this.cajeros[id - 1];
	}
	
	private Robot buscarRobot(String cr) {
		Robot r = null;
		int i = 0;
		while(i < this.robots.length && r == null) {
			if (this.robots[i].codigo == cr) {
				r = this.robots[i];
			}
			i++;
		}
		return r;
	}
	
	
	

}
