package com.zeo.sec.rmi.eval;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class register_to_client_cc1 {

    public static void main(String[] args) throws Exception {

        Registry registry = LocateRegistry.getRegistry("127.0.0.1",12345);
        registry.list();

    }
}