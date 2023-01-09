 package fr.ensma.a3.ia;

import fr.ensma.a3.ia.mvp.agentplateau.PresentationPlateau;
import fr.ensma.a3.ia.mvp.agentplateau.VuePlateau;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {


	private VuePlateau vuePlateau;
	private PresentationPlateau presentationPlateau;

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Tic Tac Toe");
		

		vuePlateau = new VuePlateau();
		presentationPlateau = new PresentationPlateau();
		vuePlateau.setPresentation(presentationPlateau); //on lie la présentation du plateau à sa vue lorsqu'on instancie l'agent
		
		
		
		Scene scene = new Scene(vuePlateau, 335, 335);

		primaryStage.setScene(scene);
		// Limite le redimensionnement
		primaryStage.setMinWidth(335);
		primaryStage.setMinHeight(335);
			
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}