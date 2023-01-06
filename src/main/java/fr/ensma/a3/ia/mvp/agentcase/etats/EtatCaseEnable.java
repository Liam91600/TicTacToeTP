package fr.ensma.a3.ia.mvp.agentcase.etats;

public class EtatCaseEnable extends AbstractEtatCase{

	public EtatCaseEnable(IAutomateCase aut) {
		super(aut);
	}
	
	@Override
	public void enable() throws TransitionException{
		autom.setEtatCourant(autom.getEtatEnable());
	}

}
