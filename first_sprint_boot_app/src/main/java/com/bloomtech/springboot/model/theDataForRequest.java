package com.bloomtech.springboot.model;

import java.util.Objects;

public class theDataForRequest {

    public theDataForRequest(String theData) {
        this.theData = theData;
    }
    String theData;


    public theDataForRequest(){

    }

    public String getTheData() {
        return theData;
    }

    public void setTheData(String theData) {
        this.theData = theData;
    }


    @Override
    public String toString() {
        return "theDataForRequest{" +
                "theData='" + theData + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        theDataForRequest that = (theDataForRequest) o;
        return Objects.equals(theData, that.theData);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(theData);
    }


}
