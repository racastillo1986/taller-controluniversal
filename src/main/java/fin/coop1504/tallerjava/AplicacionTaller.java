package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.entidades.AireAcondicionado;
import fin.coop1504.tallerjava.entidades.ControlUniversal;
import fin.coop1504.tallerjava.entidades.Televisor;

public class AplicacionTaller {
	
	public static void main(String[] args) {
		
		Televisor tvSala = new Televisor("TV-SALA");		
		AireAcondicionado aireCuarto = new AireAcondicionado("AIRE-CUARTO");
		
		ControlUniversal.encenderDisositivo(tvSala);
		ControlUniversal.encenderDisositivo(aireCuarto);
		ControlUniversal.apagarDispositivo(tvSala);
	}

}
