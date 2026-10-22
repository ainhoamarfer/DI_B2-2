package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PanelControlUsuario extends Application{

    @Override
    public void start(Stage stage) {

        BorderPane bPane = new BorderPane();

      bPane.setTop(new Label("Panel de Control"));


      bPane.setBottom(new TextField("Bottom"));


      bPane.setLeft(new TextField("Left"));


      bPane.setRight(new TextField("Right"));

        // Asignamos un campo de texto en el centro del BorderPane
      bPane.setCenter(new TextField("Center"));

      Scene scene = new Scene(bPane, 400, 300);

      stage.setTitle("Panel de Control de Usuario");

        // Asignamos la escena al escenario principal
      stage.setScene(scene);

        // Mostramos la ventana en pantalla
      stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
