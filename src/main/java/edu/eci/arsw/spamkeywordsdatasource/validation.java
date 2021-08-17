package edu.eci.arsw.spamkeywordsdatasource;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class validation extends Thread{

    HostBlacklistsDataSourceFacade hbdf = HostBlacklistsDataSourceFacade.getInstance();
    int ini = 0 , fin = 0;
    String server = "";
    LinkedList<Integer> blackListOcurrences = new LinkedList<>();
    public validation(int ini , int fin, String server  ){
        this.ini = ini;
        this.fin = fin;
        this.server = server;
    }

    public void run () {
        System.out.println(ini + " - " +  fin );
        HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
        for (int i = ini; i <= fin; i++) {
            if (skds.isInBlackListServer(i, server)) {
                blackListOcurrences.add(i);
            }
        }
    }

    public LinkedList<Integer> getBlackListOcurrences() {
        return blackListOcurrences;
    }
}
