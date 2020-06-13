package com.canonal.flightservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flight {
    private String companyName;
    private String planeModel;
    private String flightFrom;
    private String flightTo;
    private String takeOffTime;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlaneModel() {
        return planeModel;
    }
    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }


}
