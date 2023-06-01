package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class AireAcondicionado implements ReferenciaDispositivo {
	
	private String nombre;
	
	

	public AireAcondicionado(String nom) {
		nombre = nom;
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo Aire Acondicionado " + nombre);
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando Aire Acondicionado " + nombre);
		
	}

}
