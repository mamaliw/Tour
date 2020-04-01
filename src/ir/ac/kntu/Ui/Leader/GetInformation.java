package ir.ac.kntu.Ui.Leader;

import ir.ac.kntu.Leader;
import ir.ac.kntu.MyDate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.regex.*;


public class GetInformation extends Application {

    TextField firstNameInput = new TextField();
    TextField lastNameInput = new TextField();
    TextField nationalCodeInput = new TextField();
    TextField identifyCodeInput = new TextField();
    TextField birthYearInput = new TextField();
    TextField birthMonthInput = new TextField();
    TextField birthDayInput = new TextField();
    TextField hireYearInput = new TextField();
    TextField hireMonthInput = new TextField();
    TextField hireDayInput = new TextField();
    TextField knownCitiesInput = new TextField();

    CheckBox isMarried = new CheckBox("Is Married");
    CheckBox isWorking = new CheckBox("Is Working");



    public static void main() {
        launch();


    }
    public Leader formatter(){

        MyDate birthDate = new MyDate(null);
        MyDate hireDate = new MyDate(null);

        birthDate.setYear(Integer.parseInt(birthYearInput.getText()));
        birthDate.setMonth(Integer.parseInt(birthMonthInput.getText()));
        birthDate.setDay(Integer.parseInt(birthDayInput.getText()));

        hireDate.setYear(Integer.parseInt(hireYearInput.getText()));
        hireDate.setYear(Integer.parseInt(hireYearInput.getText()));
        hireDate.setYear(Integer.parseInt(hireYearInput.getText()));

        String string = knownCitiesInput.getText();
        String[] spllited = string.split(" ", 5);

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i =0 ; i<spllited.length;i++)
            arrayList.add(spllited[i]);

        return new Leader(firstNameInput.getText(),lastNameInput.getText(),Integer.parseInt(nationalCodeInput.getText()),
                Integer.parseInt(identifyCodeInput.getText()),isMarried.isSelected(),hireDate,birthDate,arrayList,isWorking.isSelected());
    }


    public void start(Stage stage) throws Exception {

        Insets insets = new Insets(0,0,0,80);


        GridPane gridPane = new GridPane();
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.setPadding(new Insets(40,40,40,40));


        BorderPane addLeaderBorder = new BorderPane();
        addLeaderBorder.setCenter(gridPane);
        addLeaderBorder.setPadding(new Insets(0,0,80,0));

        Label addLeaderLabel = new Label("Add Leader");
        addLeaderBorder.setTop(addLeaderLabel);
        BorderPane.setAlignment(addLeaderLabel, Pos.CENTER);

        Button doneButton = new Button("Done");
        addLeaderBorder.setBottom(doneButton);
        BorderPane.setAlignment(doneButton, Pos.TOP_CENTER);
        doneButton.setOnAction(e -> stage.close());

        Label firstName = new Label("First Name");
        GridPane.setConstraints(firstName,1,1 );

        GridPane.setConstraints(firstNameInput, 2,1 );

        Label lastName = new Label("Last Name");
        GridPane.setConstraints(lastName, 1, 2);

        GridPane.setConstraints(lastNameInput, 2, 2);


        Label nationalCode = new Label("National Code");
        GridPane.setConstraints(nationalCode,1,3 );

        GridPane.setConstraints(nationalCodeInput, 2,3 );

        Label identifyCode = new Label("Identify Code");
        GridPane.setConstraints(identifyCode,1,4 );

        GridPane.setConstraints(identifyCodeInput, 2,4 );

        Label birth = new Label("Birth Date :");
        GridPane.setConstraints(birth,1,5 );
        Label birthYear = new Label("Year:");
        GridPane.setConstraints(birthYear,1,6 );
        GridPane.setConstraints(birthYearInput, 2,6 );
        Label birthMonth = new Label("Month:");
        GridPane.setConstraints(birthMonth,3,6 );
        GridPane.setConstraints(birthMonthInput, 4,6 );
        Label birthDay = new Label("Day:");
        GridPane.setConstraints(birthDay,5,6 );
        GridPane.setConstraints(birthDayInput, 6,6 );

        Label hire = new Label("Hire Date :");
        GridPane.setConstraints(hire,1,7 );
        Label hireYear = new Label("Year:");
        GridPane.setConstraints(hireYear,1,8 );
        GridPane.setConstraints(hireYearInput, 2,8 );
        Label hireMonth = new Label("Month:");
        GridPane.setConstraints(hireMonth,3,8 );
        GridPane.setConstraints(hireMonthInput, 4,8 );
        Label hireDay = new Label("Day:");
        GridPane.setConstraints(hireDay,5,8 );
        GridPane.setConstraints(hireDayInput, 6,8 );

        Label knownCities = new Label("Known Cities");
        GridPane.setConstraints(knownCities,1,9 );
        GridPane.setConstraints(knownCitiesInput, 2,9 );
        Label knownCitiesHint = new Label("<-Separate with SPACE");
        GridPane.setConstraints(knownCitiesHint,3,9 );


        GridPane.setConstraints(isMarried,4,9 );
        GridPane.setConstraints(isWorking,5,9 );



        GridPane.setMargin(birthYear, insets);
        GridPane.setMargin(birthMonth, insets);
        GridPane.setMargin(birthDay, insets);
        GridPane.setMargin(hireYear, insets);
        GridPane.setMargin(hireMonth, insets);
        GridPane.setMargin(hireDay, insets);



        gridPane.getChildren().addAll(firstName,firstNameInput,lastName,lastNameInput,
                nationalCode,nationalCodeInput,identifyCode,identifyCodeInput,
                birth,birthYear,birthYearInput,birthMonth,birthMonthInput,
                birthDay,birthDayInput,hire,hireYear,hireYearInput,
                hireMonth,hireMonthInput,hireDay,hireDayInput,knownCities,knownCitiesInput,
                knownCitiesHint,isWorking,isMarried);

        Scene addLeaderScene = new Scene(addLeaderBorder,1000,600);
        stage.setScene(addLeaderScene);
        stage.show();


    }
}
