package ir.ac.kntu;
import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String args[])
    {
        ArrayList<String> srtt = new ArrayList<>();

        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 5);


        for (int i =0 ; i<arrOfStr.length;i++)
            srtt.add(arrOfStr[i]);

        for (int i =0 ; i<srtt.size();i++)
            System.out.println(srtt.get(i));

    }
}
