package com.demo.PatientList.Patient;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Patient {
    @Id @GeneratedValue
    private Long ID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int socialSecurityNumber;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private long primaryNumber;
    private long secondaryNumber;
    private String email;
    private Gender gender;
    private String primaryInsuranceProvider;
    private long subscriberID;
    private String pastMedicalHistory;

    public Patient() {
    }

    public Patient(String firstName,
                   String lastName,
                   Date dateOfBirth,
                   int socialSecurityNumber,
                   String streetAddress,
                   String city,
                   String state,
                   int zipCode,
                   long primaryNumber,
                   long secondaryNumber,
                   String email,
                   Gender gender,
                   String primaryInsuranceProvider,
                   long subscriberID,
                   String pastMedicalHistory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.primaryNumber = primaryNumber;
        this.secondaryNumber = secondaryNumber;
        this.email = email;
        this.gender = gender;
        this.primaryInsuranceProvider = primaryInsuranceProvider;
        this.subscriberID = subscriberID;
        this.pastMedicalHistory = pastMedicalHistory;
    }

    //Getters
    public Long getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public long getPrimaryNumber() {
        return primaryNumber;
    }

    public long getSecondaryNumber() {
        return secondaryNumber;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPrimaryInsuranceProvider() {
        return primaryInsuranceProvider;
    }

    public long getSubscriberID() {
        return subscriberID;
    }

    public String getPastMedicalHistory() {
        return pastMedicalHistory;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPrimaryNumber(long primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public void setSecondaryNumber(long secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPrimaryInsuranceProvider(String primaryInsuranceProvider) {
        this.primaryInsuranceProvider = primaryInsuranceProvider;
    }

    public void setSubscriberID(long subscriberID) {
        this.subscriberID = subscriberID;
    }

    public void setPastMedicalHistory(String pastMedicalHistory) {
        this.pastMedicalHistory = pastMedicalHistory;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", primaryNumber=" + primaryNumber +
                ", secondaryNumber=" + secondaryNumber +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", primaryInsuranceProvider='" + primaryInsuranceProvider + '\'' +
                ", subscriberID=" + subscriberID +
                ", pastMedicalHistory='" + pastMedicalHistory + '\'' +
                '}';
    }
}
