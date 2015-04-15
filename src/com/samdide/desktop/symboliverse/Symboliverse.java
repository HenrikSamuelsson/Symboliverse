/**
 * Symboliverse
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */
package com.samdide.desktop.symboliverse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Symboliverse extends Application{

	@Override
	public void start(Stage primaryStage) {
		Button btOK = new Button("An UML diagram tool set");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("Symboliverse");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);

	}

}
