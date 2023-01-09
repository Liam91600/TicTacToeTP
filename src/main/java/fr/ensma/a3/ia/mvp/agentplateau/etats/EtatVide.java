package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public class EtatVide extends AbstractEtatPlateau{

	public EtatVide(IAutomatePlateau aut) {
		super(aut);
	}
	
	public void click(PresentationCase pCase) throws TransitionException{
		pCase.setCroix();
		autom.setEtatCourant(autom.getEtatCroix(), pCase);
		
	}

}
