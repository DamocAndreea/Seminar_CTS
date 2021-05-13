package ro.ase.cts.template.classes;

public abstract class SpectatorAbstract {
	public final void intrareSpectatorPeStadion() {
		asezareLaCoada();
		prezintaBlet();
		realizeazaControlCorporal();
		intrePeStadion();
		ocupaLoc();
	}
	
	public abstract void asezareLaCoada();
	public abstract void prezintaBlet();
	public abstract void realizeazaControlCorporal();
	public abstract void intrePeStadion();
	public abstract void ocupaLoc();
}
