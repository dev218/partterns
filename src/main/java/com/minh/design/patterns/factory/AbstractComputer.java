package com.minh.design.patterns.factory;

/**
 * Created by HNguyen on 23.01.2015.
 */
public abstract class AbstractComputer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
