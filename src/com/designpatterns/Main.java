package com.designpatterns;

import com.designpatterns.adapter.TRPlug;
import com.designpatterns.adapter.TRtoUKPlugAdapter;
import com.designpatterns.adapter.UKPlug;
import com.designpatterns.adapter.UKSocket;

public class Main {

    public static void main(String[] args) {

        TRPlug plug = () -> System.out.println("TRPlugImp");
        UKSocket ukSocket = new UKSocket();
        UKPlug ukAdapter = new TRtoUKPlugAdapter(plug);
        ukSocket.PlugIn(ukAdapter);


    }
}
