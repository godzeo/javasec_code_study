package com.zeo.sec.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMITestImpl extends UnicastRemoteObject implements RMITestInterface {

    private static final long serialVersionUID = 1L;

    protected RMITestImpl() throws RemoteException {
        super();
    }

    @Override
    public void evalobject(Object ob) throws RemoteException {
        System.out.println("evalobject");
    }

    @Override
    public String test() throws RemoteException {
        return "Hello RMI,I am RMITestImpl.test() ";
    }
}