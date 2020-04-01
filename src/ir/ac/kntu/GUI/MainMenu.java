package ir.ac.kntu.GUI;

import ir.ac.kntu.Leader;
import ir.ac.kntu.Leaders;
import ir.ac.kntu.MyDate;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

import static javafx.application.Application.launch;

public class MainMenu extends Application {

    public static Leaders leaders;

    public static void main(String[] args) {
        ArrayList<Leader> arr = new ArrayList<Leader>();
        leaders = new Leaders(arr);

        MyDate birth1 = new MyDate(2000,12,21);
        MyDate birth2 = new MyDate(2001,12,21);
        MyDate birth3 = new MyDate(2002,12,21);

        leaders.addLeader(new Leader("Mamali","Ranjbar",9826513,123456789,false,null,birth1,null,true));
        leaders.addLeader(new Leader("Shayan","Katani",9826512,123456789,true,null,birth2,null,false));
        leaders.addLeader(new Leader("Ali","Afshar",9826511,123456789,true,null,birth3,null,false));


        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Mainfx.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Tour Management Program");
        stage.show();
    }
}
