package ro.ase.cts.template.main;
import ro.ase.cts.template.classes.*;

public class Program {
	
	public static void main(String[] args) {
		Spectator spectator = new Spectator();
		
		spectator.intrareSpectatorPeStadion();
		
		SpectatorPeluza spectatorPeluza = new SpectatorPeluza();
		spectatorPeluza.intrareSpectatorPeStadion();
	}
}
