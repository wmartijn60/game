package ex;

////////////////////////////////////////
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
///////////////////////////////////////

public class screen extends Application {

  public void see(){
    launch();
  }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Adventure Game");
        Button button = new Button();
        Button button2 = new Button();
        Button button3 = new Button();

        button.setText("Slam");
        button.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println("1");
            }
        });
        button2.setText("Amulet of Lifesteal");
        button2.setOnAction(new EventHandler<ActionEvent>() {

          public void handle(ActionEvent event) {
              System.out.println("2");
          }
      });

      button3.setText("Fast attack");
      button3.setOnAction(new EventHandler<ActionEvent>() {

        public void handle(ActionEvent event) {
            System.out.println("3");
        }
    });


        VBox vb1 = new VBox();
        vb1.getChildren().addAll(button, button2, button3);
        StackPane root = new StackPane();
        root.getChildren().add(vb1);
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();

    }
}
