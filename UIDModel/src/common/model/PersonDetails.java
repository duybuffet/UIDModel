/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.model;

import java.io.Serializable;

/**
 * Template or blueprint of a Person
 * @author Duy Buffet
 */
public class PersonDetails implements Serializable {
    private int requestedId;
    private String uid;
    private int status;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private int gender;
    private String email;
    private String address;
    private String education;
    private String occupation;
    private int married;
    private int addressProof;
    private String citizenshipProff;

    public PersonDetails() {
    }

    public PersonDetails(String uid, int status, String firstName, String middleName, String lastName, String dob, int gender, String email, String address, String education, String occupation, int married, int addressProof, String citizenshipProff) {
        this.uid = uid;
        this.status = status;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.education = education;
        this.occupation = occupation;
        this.married = married;
        this.addressProof = addressProof;
        this.citizenshipProff = citizenshipProff;
    }

    public PersonDetails(int requestedId, String uid, int status, String firstName, String middleName, String lastName, String dob, int gender, String email, String address, String education, String occupation, int married, int addressProof, String citizenshipProff) {
        this.requestedId = requestedId;
        this.uid = uid;
        this.status = status;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.education = education;
        this.occupation = occupation;
        this.married = married;
        this.addressProof = addressProof;
        this.citizenshipProff = citizenshipProff;
    }        

    public int getRequestedId() {
        return requestedId;
    }

    public void setRequestedId(int requestedId) {
        this.requestedId = requestedId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getMarried() {
        return married;
    }

    public void setMarried(int married) {
        this.married = married;
    }

    public int getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(int addressProof) {
        this.addressProof = addressProof;
    }

    public String getCitizenshipProff() {
        return citizenshipProff;
    }

    public void setCitizenshipProff(String citizenshipProff) {
        this.citizenshipProff = citizenshipProff;
    }
    
    
}
