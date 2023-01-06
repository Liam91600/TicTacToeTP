package fr.ensma.a3.ia.mvp.agentcase.etats;

public class EtatCaseDisable extends AbstractEtatCase{

	public EtatCaseDisable(IAutomateCase aut) {
		super(aut);
	}
	
	@Override
	public void disable() throws TransitionException{
		autom.setEtatCourant(autom.getEtatDisable());
	}
}
