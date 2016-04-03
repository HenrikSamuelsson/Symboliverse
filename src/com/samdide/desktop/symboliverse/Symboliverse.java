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
	final static int CANVAS_WIDTH = 400;
	final static int CANVAS_HEIGHT = 300;
	final static int GRID_LINE_WIDTH = 1;
	/** distance between grid lines in pixels */
	final static int GRID_DISTANCE = 20;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Symboliverse");

		Group root = new Group();
		Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		canvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Event mouse clicked");
				
			}
			
		});
		
		drawGrid(gc);
		drawShapes(gc);
		root.getChildren().add(canvas);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	private void drawGrid(GraphicsContext gc) {
		gc.setStroke(Color.LIGHTSTEELBLUE);
		gc.setLineWidth(GRID_LINE_WIDTH);
		for ( int i = GRID_DISTANCE; i < CANVAS_WIDTH; i += GRID_DISTANCE ) {
			gc.strokeLine(i, 0, i, CANVAS_HEIGHT);
			gc.strokeLine(0, i, CANVAS_WIDTH, i);
		}
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
