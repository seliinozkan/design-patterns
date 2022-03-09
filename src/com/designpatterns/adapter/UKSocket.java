package com.designpatterns.adapter;

/**
 * @author Selin Ozkan
 */
public class UKSocket {
    public void PlugIn(UKPlug plug){

        System.out.println("UKSocket");
        plug.electricityGive();
    }
}
