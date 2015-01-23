package com.minh.design.patterns.factory;

/**
 * Created by HNguyen on 23.01.2015.
 */
public class ServerComputer extends AbstractComputer {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerComputer (String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
