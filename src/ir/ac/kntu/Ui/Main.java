package ir.ac.kntu.Ui;

import ir.ac.kntu.Leader;
import ir.ac.kntu.Leaders;
import ir.ac.kntu.MyDate;
import ir.ac.kntu.Ui.Leader.GetInformation;
import ir.ac.kntu.Ui.Leader.List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.JarException;

public class Main {

    public static ArrayList<Leader> mainList = new ArrayList<>();
    public static Leaders leaders = new Leaders(mainList);

    public static void main(String[] args) {

        MyDate birth1 = new MyDate(2000,12,21);
        MyDate birth2 = new MyDate(2001,12,21);
        MyDate birth3 = new MyDate(2002,12,21);

        leaders.addLeader(new Leader("Mamali","Ranjbar",9826513,123456789,false,null,birth1,null,true));
        leaders.addLeader(new Leader("Shayan","Katani",9826512,123456789,true,null,birth2,null,false));
        leaders.addLeader(new Leader("Ali","Afshar",9826511,123456789,true,null,birth3,null,false));





    }

    public static void run(){
        Boolean isEnded = false;
        Scanner input = new Scanner(System.in);
        Integer choice;

        while(isEnded){

            Print.start();
            choice = input.nextInt();

            switch (choice){
                case 1 : List.main();
                break;
                case 2 :
            }









        }
        input.close();

    }


}
