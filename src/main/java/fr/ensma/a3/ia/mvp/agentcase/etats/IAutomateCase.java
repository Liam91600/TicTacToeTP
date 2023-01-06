package fr.ensma.a3.ia.mvp.agentcase.etats;

public interface IAutomateCase {
	
	public void setEtatCourant(IEtatCase etat);
	public IEtatCase getEtatEnable();
	public IEtatCase getEtatDisable();
	

}
