package ir.ac.kntu;
import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Leader> arr = new ArrayList<Leader>();

        Leaders leaders = new Leaders(arr);

        MyDate birth1 = new MyDate(2000,12,21);
        MyDate birth2 = new MyDate(2001,12,21);
        MyDate birth3 = new MyDate(2002,12,21);

        leaders.addLeader(new Leader("Mamali","Ranjbar",null,null,false,null,birth1,null,false));
        leaders.addLeader(new Leader("Shayan","Katani",null,null,false,null,birth2,null,false));
        leaders.addLeader(new Leader("Ali","Afshar",null,null,false,null,birth3,null,false));


        for(int i=0 ; i<leaders.getSize() ; i++)
            if(leaders.findLeaderByAge(19).isInvalid()==false)
                System.out.println(leaders.findLeaderByAge(19).toString());
    }

}
