package fr.ensma.a3.ia.mvp.agentplateau.etats;



public interface IAutomatePlateau {
	
	public void setEtatCourant(IEtatPlateau etat);
	public IEtatPlateau getEtatCroix();
	public IEtatPlateau getEtatRond();
	public IEtatPlateau getEtatVide();
}
