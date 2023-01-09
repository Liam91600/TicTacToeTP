package fr.ensma.a3.ia.mvp.agentplateau.etats;

import fr.ensma.a3.ia.mvp.agentcase.PresentationCase;

public abstract class AbstractEtatPlateau implements IEtatPlateau{

	protected IAutomatePlateau autom;
	
	public AbstractEtatPlateau(final IAutomatePlateau aut) {
		autom = aut;
	}
	
	@Override
	public void click(PresentationCase pCase) throws TransitionException{
		throw new TransitionException();
	}
		
	
}
