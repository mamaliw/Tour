package ir.ac.kntu.GUI;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.io.IOException;

public class MainController {

    public Button button;
    public TableView table;

    public void leaderMenu() throws IOException {
        LeaderMenu.display();
    }

}
