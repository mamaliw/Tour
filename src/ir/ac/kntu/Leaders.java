package ir.ac.kntu;

import java.util.ArrayList;

public class Leaders {
    private ArrayList<Leader> leaders;
    private Integer size;

    public Leaders(ArrayList<Leader> leaders) {
        this.leaders = leaders;
    }

    public void addLeader(Leader leader){
        leaders.add(leader);
    }
    public void removeLeader(Leader leader){
        leaders.remove(leader);
    }
    public void removeLeader(int index){
        leaders.remove(index);
    }
    public Leader getLeader(int index){
        return leaders.get(index);
    }
    public int getSize(){
        return leaders.size();
    }

    public ArrayList<Leader> getLeaders() {
        return leaders;
    }

    public void setLeaders(ArrayList<Leader> leaders) {
        this.leaders = leaders;
    }

    //SEARCHs
    public Leader findLeaderByFirstName(String firstname){
        int i;
        Boolean isFound=false;
        for (i=0; i<leaders.size() ; i++){
            if(leaders.get(i).getFirstName()==firstname){
                isFound=true;
                break;
            }
        }
        if (isFound)
            return leaders.get(i);
        else
            return null;
    }
    public Leader findLeaderByLastName(String lastName){
        int i;
        Boolean isFound=false;
        for (i=0; i<leaders.size() ; i++){
            if(leaders.get(i).getLastName()==lastName){
                isFound=true;
                break;
            }
        }
        if (isFound)
            return leaders.get(i);
        else
            return null;
    }
    public Leader findLeaderByAge(int age){
        int i;
        Boolean isFound=false;
        for (i=0; i<leaders.size() ; i++){
            if(leaders.get(i).getAge()==age){
                isFound=true;
                break;
            }
        }
        if (isFound)
            return leaders.get(i);
        else
            return null;
    }
    public Leader findLeaderByKnownCities(String city){
        int i;
        Boolean isFound=false;
        for (i=0; i<leaders.size() ; i++){
            for (int j=0 ; j<leaders.get(i).getKnownCities().size() ; j++) {
                if (leaders.get(i).getKnownCities().get(j) == city) {
                    isFound = true;
                    break;
                }
            }
            if (isFound)
                break;
        }
        if (isFound)
            return leaders.get(i);
        else
            return null;
    }
}
