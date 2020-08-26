package io.csyork.covid19tracker.model;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotal;
    private int differenceFromPreviousDay;

    public int getDifferenceFromPreviousDay() {
        return differenceFromPreviousDay;
    }

    public void setDifferenceFromPreviousDay(int differenceFromPreviousDay) {
        this.differenceFromPreviousDay = differenceFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotal() {
        return latestTotal;
    }

    public void setLatestTotal(int latestTotal) {
        this.latestTotal = latestTotal;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotal=" + latestTotal +
                '}';
    }
}
