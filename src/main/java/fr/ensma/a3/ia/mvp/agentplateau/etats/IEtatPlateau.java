package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public interface IEtatPlateau {
	
	public void click(PresentationCase pCase) throws TransitionException;


}
