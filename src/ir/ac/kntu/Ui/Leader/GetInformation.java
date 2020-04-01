package ir.ac.kntu.Ui.Leader;

import ir.ac.kntu.Leader;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GetInformation extends Application {

    public static void main() {
        launch();
    }

    @Override
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

        TextField firstNameInput = new TextField();
        GridPane.setConstraints(firstNameInput, 2,1 );

        Label lastName = new Label("Last Name");
        GridPane.setConstraints(lastName, 1, 2);

        TextField lastNameInput = new TextField();
        GridPane.setConstraints(lastNameInput, 2, 2);


        Label nationalCode = new Label("National Code");
        GridPane.setConstraints(nationalCode,1,3 );

        TextField nationalCodeInput = new TextField();
        GridPane.setConstraints(nationalCodeInput, 2,3 );

        Label identifyCode = new Label("Identify Code");
        GridPane.setConstraints(identifyCode,1,4 );

        TextField identifyCodeInput = new TextField();
        GridPane.setConstraints(identifyCodeInput, 2,4 );

        Label birth = new Label("Birth Date :");
        GridPane.setConstraints(birth,1,5 );
        Label birthYear = new Label("Year:");
        GridPane.setConstraints(birthYear,1,6 );
        TextField birthYearInput = new TextField();
        GridPane.setConstraints(birthYearInput, 2,6 );
        Label birthMonth = new Label("Month:");
        GridPane.setConstraints(birthMonth,3,6 );
        TextField birthMonthInput = new TextField();
        GridPane.setConstraints(birthMonthInput, 4,6 );
        Label birthDay = new Label("Day:");
        GridPane.setConstraints(birthDay,5,6 );
        TextField birthDayInput = new TextField();
        GridPane.setConstraints(birthDayInput, 6,6 );

        Label hire = new Label("Hire Date :");
        GridPane.setConstraints(hire,1,7 );
        Label hireYear = new Label("Year:");
        GridPane.setConstraints(hireYear,1,8 );
        TextField hireYearInput = new TextField();
        GridPane.setConstraints(hireYearInput, 2,8 );
        Label hireMonth = new Label("Month:");
        GridPane.setConstraints(hireMonth,3,8 );
        TextField hireMonthInput = new TextField();
        GridPane.setConstraints(hireMonthInput, 4,8 );
        Label hireDay = new Label("Day:");
        GridPane.setConstraints(hireDay,5,8 );
        TextField hireDayInput = new TextField();
        GridPane.setConstraints(hireDayInput, 6,8 );

        Label knownCities = new Label("Known Cities");
        GridPane.setConstraints(knownCities,1,9 );
        TextField knownCitiesInput = new TextField();
        GridPane.setConstraints(knownCitiesInput, 2,9 );
        Label knownCitiesHint = new Label("<-Separate with SPACE");
        GridPane.setConstraints(knownCitiesHint,3,9 );


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
                knownCitiesHint);

        Scene addLeaderScene = new Scene(addLeaderBorder,1000,600);
        stage.setScene(addLeaderScene);
        stage.show();


    }
}
