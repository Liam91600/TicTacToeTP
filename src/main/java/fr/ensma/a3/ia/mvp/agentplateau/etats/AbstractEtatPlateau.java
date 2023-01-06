package fr.ensma.a3.ia.mvp.agentplateau.etats;

public class AbstractEtatPlateau implements IEtatPlateau{

	protected IAutomatePlateau autom;
	
	public AbstractEtatPlateau(final IAutomatePlateau aut) {
		autom = aut;
	}
	
	@Override
	public void rond() throws TransitionException{
		throw new TransitionException();
	}
	
	@Override
	public void croix() throws TransitionException{
		throw new TransitionException();
	}

	@Override
	public void vide() throws TransitionException {
		throw new TransitionException();		
	}
}
