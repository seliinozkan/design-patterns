package com.designpatterns.adapter;

/**
 * @author Selin Ozkan
 */
public class TRtoUKPlugAdapter implements UKPlug {

    private TRPlug plug;

    public TRtoUKPlugAdapter(TRPlug plug) {
        this.plug = plug;
    }

    @Override
    public void electricityGive() {
        System.out.println("TRtoUKPlugAdapter");
        plug.giveElectricity();
    }
}
