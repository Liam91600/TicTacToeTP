package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public class EtatRond extends AbstractEtatPlateau{

	public EtatRond(IAutomatePlateau aut) {
		super(aut);
	}

	public void click(PresentationCase pCase) throws TransitionException{
		pCase.setVide();
		autom.setEtatCourant(autom.getEtatVide(), pCase);
		
	}
}
