package aplikacje;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Przywitanie extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Przywitanie.class.getResource("../fxml/PrzywitanieScene.fxml"));
        Parent layout = fxmlLoader.load();
        Scene scene = new Scene(layout);
        scene.getStylesheets().add("podstawyCSS/StylKalkulatora.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
