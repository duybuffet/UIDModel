/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.model;

import java.io.Serializable;

/**
 * Template or blueprint of a Employee
 * @author Duy Buffet
 */
public class Employee implements Serializable {

    private int id;
    private String username;
    private String pass;
    private int gender;

    public Employee() {
    }

    public Employee(String username, String pass, int gender) {
        this.username = username;
        this.pass = pass;
        this.gender = gender;
    }

    public Employee(int id, String username, String pass, int gender) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

}
