package ir.ac.kntu;

import java.util.ArrayList;

public class Leader {
    private String firstName;
    private String lastName;
    private Integer nationalCode;
    private Integer identifyCode;
    private boolean isMarried;
    private MyDate dateOfHire;
    private MyDate birth;
    private Integer age = birth.getYear();
    private ArrayList<String> knownCities=new ArrayList<String>();//LOWER CASE !!!
    private boolean isWorking;
    private boolean invalid;

    public void addKnownCities(String city){//done
        knownCities.add(city.toLowerCase());
    }
    public boolean removeKnownCities(String city){//done
        return knownCities.remove(city.toLowerCase());
    }

    public boolean canHandle(String city){//done
        if (knownCities.indexOf(city.toLowerCase())!=-1)
            return true;
        else
            return false;
    }
    public int getAge(){
        return birth.getYear()-2019;
    }

    public Leader(String firstName, String lastName//MAIN CONSTRACTOR
            , Integer nationalCode, Integer identifyCode
            , boolean isMarried, MyDate dateOfHire, MyDate birth
            , ArrayList<String> knownCities, boolean isWorking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.identifyCode = identifyCode;
        this.isMarried = isMarried;
        this.dateOfHire = dateOfHire;
        this.birth = birth;
        this.knownCities = knownCities;
        this.isWorking = isWorking;
    }

    public Leader(boolean invalid) {
        this.invalid = invalid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Integer getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(Integer identifyCode) {
        this.identifyCode = identifyCode;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public MyDate getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(MyDate dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate birth) {
        this.birth = birth;
    }

    public ArrayList<String> getKnownCities() {
        return knownCities;
    }

    public void setKnownCities(ArrayList<String> knownCities) {
        this.knownCities = knownCities;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isInvalid() {
        return invalid;
    }

    @Override
    public String toString() {
        return "Leader{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalCode=" + nationalCode +
                ", identifyCode=" + identifyCode +
                ", isMarried=" + isMarried +
                ", dateOfHire=" + dateOfHire +
                ", birth=" + birth +
                ", knownCities=" + knownCities +
                ", isWorking=" + isWorking +
                '}';
    }
}
