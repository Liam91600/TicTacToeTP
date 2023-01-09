package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public class EtatCroix extends AbstractEtatPlateau{

	public EtatCroix(IAutomatePlateau aut) {
		super(aut);
	}
	
	public void click(PresentationCase pCase) throws TransitionException{
		pCase.setRond();
		autom.setEtatCourant(autom.getEtatRond(), pCase);
		
	}

}
