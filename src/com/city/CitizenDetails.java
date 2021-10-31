package com.city;

public class CitizenDetails {

    String fName;
    String lName;
    Integer zip;

    public CitizenDetails() {
        setFName(fName);
        setLName(lName);
        setZip(zip);
    }

    public String getFName(){return fName;}
    public String getLName(){return lName;}
    public Integer getZip(){return zip;}

    public void setFName(String fName){this.fName= fName;};
    public void setLName(String LName){this.lName= lName;};
    public void setZip(Integer zip){this.zip= zip;};

    @Override
    public String toString() {
        return "CitizenDetails{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", zip=" + zip +
                '}';
    }
}
