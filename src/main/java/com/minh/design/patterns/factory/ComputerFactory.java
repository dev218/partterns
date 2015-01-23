package com.minh.design.patterns.factory;

/**
 * Created by HNguyen on 23.01.2015.
 */
public class ComputerFactory {

    public static AbstractComputer getComputer(String type, String ram, String hdd, String cpu){
        if("PcComputer".equalsIgnoreCase(type)) return new PcComputer(ram, hdd, cpu);
        else if("ServerComputer".equalsIgnoreCase(type)) return new ServerComputer(ram, hdd, cpu);

        return null;
    }
}
