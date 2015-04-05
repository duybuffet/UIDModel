/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import common.model.Centre;
import common.model.PersonDetails;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Duy Buffet
 */
public interface RMICitizenAction extends Remote {

    ArrayList<PersonDetails> search(String fName, String mName, String lName) throws RemoteException;

    void sendRequest(PersonDetails person, int centre) throws RemoteException;
    
    ArrayList<Centre> loadCentre() throws RemoteException;
}
