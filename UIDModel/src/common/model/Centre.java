/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Template or blueprint of a Centre
 * @author Duy Buffet
 */
public class Centre implements Serializable {

    private int centreId;
    private String centreName;
    private ArrayList<PersonDetails> peopleList;

    public Centre() {
    }

    public Centre(String centreName) {
        this.centreName = centreName;
    }

    public Centre(int centreId, String centreName) {
        this.centreId = centreId;
        this.centreName = centreName;
    }

    public Centre(int centreId, String centreName, ArrayList<PersonDetails> peopleList) {
        this.centreId = centreId;
        this.centreName = centreName;
        this.peopleList = peopleList;
    }

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
    }

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public ArrayList<PersonDetails> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(ArrayList<PersonDetails> peopleList) {
        this.peopleList = peopleList;
    }

}
