package ir.ac.kntu.GUI;

import ir.ac.kntu.Leader;
import ir.ac.kntu.Leaders;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;


public class MainMenuOld extends Application{

    ArrayList<Leader> arr=new ArrayList<Leader>();
    Leaders leaders =new Leaders(arr);

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Welcome To Tour Managment Program");

        Button leaderList = new Button("Leaders");
        Button addLeader =new Button("Add Leader");
        Button removeLeader =new Button("Remove Leader");
        Button mainMenu =new Button("MainMenu");

        Label leaderMng =new Label("Leader Management");

        StackPane main =new StackPane();
        main.getChildren().add(leaderList);


        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(leaderMng,addLeader,removeLeader,mainMenu);

        Scene scene1 =new Scene(main,400,400);
        Scene scene2 =new Scene(layout1,400,400);

        leaderList.setOnAction(e -> stage.setScene(scene2));
        //addLeader.setOnAction();
        removeLeader.setOnAction(e -> leaders.removeLeader(leaders.findLeaderByFirstName("mamali")));
        mainMenu.setOnAction(e -> stage.setScene(scene1));

        stage.setScene(scene1);
        stage.show();

    }
}
