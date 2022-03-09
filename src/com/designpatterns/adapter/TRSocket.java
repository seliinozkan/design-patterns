package com.designpatterns.adapter;

/**
 * @author Selin Ozkan
 */
public class TRSocket {

    public void plugIn(TRPlug plug){
        System.out.println("TRSocket");
        plug.giveElectricity();
    }
}
