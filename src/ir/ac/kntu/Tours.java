package ir.ac.kntu;

import java.util.ArrayList;

public class Tours {

    ArrayList<Tour> tours = new ArrayList<Tour>();

    public void addTour(Tour tour){
        tours.add(tour);
    }
    public void removeTour(Tour tour){
        tours.remove(tour);
    }
    public void removeTour(Integer index){
        tours.remove(index);
    }
    public Tour getTour(Integer index){
        return tours.get(index);
    }
}
