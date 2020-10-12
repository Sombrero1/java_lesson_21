package ru.mirea.documents;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene=new Scene(group,1000,500);
        primaryStage.setTitle("Main");
        VBox main= new VBox();


        MenuBar menuBar=new MenuBar();
        Menu opt = new Menu("File");

        MenuItem [] optt=new MenuItem[]{
                new MenuItem("New"),
                new MenuItem("Open")
        };

        Documents fct3=new Documents();
        optt[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                fct3.createNew("image");

            }
        });
        optt[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                fct3.CreateOpen("text");

            }
        });






        opt.getItems().addAll(optt);


        menuBar.getMenus().addAll(opt);//всё в кучу

        BorderPane mn=new BorderPane();
        mn.setTop(menuBar);
        group.getChildren().addAll(mn,main);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
