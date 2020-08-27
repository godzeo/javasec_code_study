package com.zeo.sec.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RMITestInterface extends Remote {
    String test() throws RemoteException;
    public void evalobject(Object ob) throws RemoteException;
}
