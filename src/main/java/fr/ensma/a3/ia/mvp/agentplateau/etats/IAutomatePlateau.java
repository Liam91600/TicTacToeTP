package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public interface IAutomatePlateau {
	
	public void setEtatCourant(IEtatPlateau etat, PresentationCase pCase);
	public IEtatPlateau getEtatCroix();
	public IEtatPlateau getEtatRond();
	public IEtatPlateau getEtatVide();
}
