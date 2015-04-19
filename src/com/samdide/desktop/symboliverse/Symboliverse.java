/**
 * Symboliverse
 * 
 * @author Henrik Samuelsson, henrik.samuelsson(at)gmail.com
 */
package com.samdide.desktop.symboliverse;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Symboliverse extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Symboliverse");

		Group root = new Group();
		Canvas canvas = new Canvas(300, 250);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Event mouse clicked");
				
			}
			
		});
		
		drawShapes(gc);
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	private void drawShapes(GraphicsContext gc) {
		gc.setStroke(Color.BLUE);
		gc.setLineWidth(2);
		gc.strokeRect(100, 60, 150, 130);
		gc.strokeLine(100, 90, 250, 90);
		gc.strokeLine(100, 120, 250, 120);
		gc.setLineWidth(1);
		gc.setFont(new Font("Consolas", 14));
		gc.fillText("BankAccount", 120, 80);
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
