package fr.ensma.a3.ia.mvp.agentcase.etats;

public class AbstractEtatCase implements IEtatCase{
	
	protected IAutomateCase autom;
	
	public AbstractEtatCase(final IAutomateCase aut) {
		autom = aut;
	}
	
	@Override
	public void enable() throws TransitionException{
		throw new TransitionException();
	}
	
	@Override
	public void disable() throws TransitionException{
		throw new TransitionException();
	}
	
}
