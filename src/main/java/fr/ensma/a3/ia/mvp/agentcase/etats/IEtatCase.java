package fr.ensma.a3.ia.mvp.agentcase.etats;

public interface IEtatCase {

	
	void disable() throws TransitionException;
	void enable() throws TransitionException;
}
