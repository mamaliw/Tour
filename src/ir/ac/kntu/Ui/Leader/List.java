package ir.ac.kntu.Ui.Leader;

import ir.ac.kntu.Leader;
import ir.ac.kntu.MyDate;
import ir.ac.kntu.Ui.Main;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class List extends Application {
    public static void main() {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {

        ObservableList<Leader> leadersObs = FXCollections.observableArrayList(Main.leaders.getLeaders());
        TableView<Leader> table = new TableView<>();

        TableColumn<Leader , String> firstNameColumn = new TableColumn<>("Firstname");
        firstNameColumn.setMinWidth(80);
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Leader , String> lastNameColumn = new TableColumn<>("Lastname");
        lastNameColumn.setMinWidth(80);
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Leader , Integer> nationalCodeColumn = new TableColumn<>("NationalCode");
        nationalCodeColumn.setMinWidth(80);
        nationalCodeColumn.setCellValueFactory(new PropertyValueFactory<>("nationalCode"));

        TableColumn<Leader , Integer> identifyCodeColumn = new TableColumn<>("IdentifyCode");
        identifyCodeColumn.setMinWidth(80);
        identifyCodeColumn.setCellValueFactory(new PropertyValueFactory<>("identifyCode"));

        TableColumn<Leader , MyDate> birthColumn = new TableColumn<>("Birth");
        birthColumn.setMinWidth(80);
        birthColumn.setCellValueFactory(new PropertyValueFactory<>("birth"));

        TableColumn<Leader , MyDate> dateOfHireColumn = new TableColumn<>("Hire Date");
        dateOfHireColumn.setMinWidth(80);
        dateOfHireColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfHire"));

        TableColumn<Leader , String> isMarriedColumn = new TableColumn<>("Marriage Status");
        isMarriedColumn.setMinWidth(80);
        isMarriedColumn.setCellValueFactory(cellData -> {
            if(cellData.getValue().isWorking()){
                return new ReadOnlyStringWrapper("Yes");
            }else{
                return new ReadOnlyStringWrapper("No");
            }

        });;

        TableColumn<Leader , String> isWorkingColumn = new TableColumn<>("Working Status");
        isWorkingColumn.setMinWidth(80);
        isWorkingColumn.setCellValueFactory(cellData -> {
            if(cellData.getValue().isWorking()){
                return new ReadOnlyStringWrapper("Yes");
            }else{
                return new ReadOnlyStringWrapper("No");
            }

        });;

        TableColumn<Leader, ArrayList> knownCitiesColumn = new TableColumn<>("KnownCities");
        knownCitiesColumn.setMinWidth(80);
        knownCitiesColumn.setCellValueFactory(new PropertyValueFactory<>("knownCities"));

        table.setItems(leadersObs);
        table.getColumns().addAll(firstNameColumn,lastNameColumn,nationalCodeColumn
                ,identifyCodeColumn,birthColumn,dateOfHireColumn,knownCitiesColumn,
                isMarriedColumn,isWorkingColumn);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> stage.close());
        BorderPane layout = new BorderPane();
        layout.setTop(table);
        layout.setCenter(closeButton);
        BorderPane.setAlignment(closeButton, Pos.CENTER);

        Scene scene = new Scene(layout,800,430);
        stage.setScene(scene);
        stage.show();
    }
}


