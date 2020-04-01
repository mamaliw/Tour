package ir.ac.kntu.Ui;

import java.util.Scanner;

public class Print {

    public static void start() {
        System.out.println("Welcome To Program");
        System.out.println("\n1.Leaders Menu" +
                "\n2.Tours Menu" +
                "\n3.Map Menu" +
                "\n4.Exit" +
                "\n Enter Your Choice:");
    }

    public static void leader(){
        System.out.println("\n1.Show Leaders List" +
                "\n2.Remove Leader By Index" +
                "\n3.Edit Leader By Index" +
                "\n4.Search Leader By his Information");

    }

    public static void leaderSearch(){
        System.out.println("\n1.By First Name" +
                "\n2.By Last Name " +
                "\n3.By Known City" +
                "\n4.By Age");

    }

}
