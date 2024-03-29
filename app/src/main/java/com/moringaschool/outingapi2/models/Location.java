
package com.moringaschool.outingapi2.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Location {

    @SerializedName("address1")
    @Expose
    public String address1;
    @SerializedName("address2")
    @Expose
    public String address2;
    @SerializedName("address3")
    @Expose
    public String address3;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("zip_code")
    @Expose
    public String zipCode;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("state")
    @Expose
    public String state;
    @SerializedName("display_address")
    @Expose
    public List<String> displayAddress = null;
    @SerializedName("cross_streets")
    @Expose
    public String crossStreets;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param zipCode
     * @param country
     * @param address3
     * @param crossStreets
     * @param address2
     * @param city
     * @param address1
     * @param displayAddress
     * @param state
     */
    public Location(String address1, String address2, String address3, String city, String zipCode, String country, String state, List<String> displayAddress, String crossStreets) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.state = state;
        this.displayAddress = displayAddress;
        this.crossStreets = crossStreets;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getDisplayAddress() {
        return displayAddress;
    }

    public void setDisplayAddress(List<String> displayAddress) {
        this.displayAddress = displayAddress;
    }

    public String getCrossStreets() {
        return crossStreets;
    }

    public void setCrossStreets(String crossStreets) {
        this.crossStreets = crossStreets;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %s %s", this.address1, this.city, this.state, this.zipCode);
    }
}
