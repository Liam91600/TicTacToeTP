package fr.ensma.a3.ia.mvp.agentplateau.etats;

public interface IEtatPlateau {
	
	public void rond() throws TransitionException;
	public void croix() throws TransitionException;
	public void vide() throws TransitionException;

}
