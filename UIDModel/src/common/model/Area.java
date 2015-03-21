/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Duy Buffet
 */
public class Area implements Serializable {
    private String areaCode;
    private String areaName;
    private ArrayList<Centre> centreList;

    public Area() {
    }

    public Area(String areaCode, String areaName) {
        this.areaCode = areaCode;
        this.areaName = areaName;
    }

    public Area(String areaCode, String areaName, ArrayList<Centre> centreList) {
        this.areaCode = areaCode;
        this.areaName = areaName;
        this.centreList = centreList;
    }        

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public ArrayList<Centre> getCentreList() {
        return centreList;
    }

    public void setCentreList(ArrayList<Centre> centreList) {
        this.centreList = centreList;
    }        
}
