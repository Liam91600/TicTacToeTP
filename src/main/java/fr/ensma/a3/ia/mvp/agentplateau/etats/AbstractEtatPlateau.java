package fr.ensma.a3.ia.mvp.agentplateau.etats;

public abstract class AbstractEtatPlateau implements IEtatPlateau{

	protected IAutomatePlateau autom;
	
	public AbstractEtatPlateau(final IAutomatePlateau aut) {
		autom = aut;
	}
	
	@Override
	public void click(int i) throws TransitionException{
		throw new TransitionException();
	}
		
	
}
