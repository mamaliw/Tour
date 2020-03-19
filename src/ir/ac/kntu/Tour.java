package ir.ac.kntu;

import java.util.ArrayList;

public class Tour {
    private MyDate length;
    private Integer price;
    private String region;
    private Integer minAmount;
    private Integer maxAmount;
    private String originCity;
    private String destinationCity;
    private Ways way;
    private ArrayList<String> placeToVisit=new ArrayList<String>();//LOWER CASE !!!


    public MyDate getLength() {
        return length;
    }

    public void setLength(MyDate length) {
        this.length = length;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Ways getWay() {
        return way;
    }

    public void setWay(Ways way) {
        this.way = way;
    }

    public ArrayList<String> getPlaceToVisit() {
        return placeToVisit;
    }

    public void setPlaceToVisit(ArrayList<String> placeToVisit) {
        this.placeToVisit = placeToVisit;
    }
}
