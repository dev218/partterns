package com.minh.design.patterns.factory;

/**
 * Created by HNguyen on 23.01.2015.
 */
public class TestFactory {

    public static void main(String[] args) {
        AbstractComputer pc = ComputerFactory.getComputer("PcComputer","2 GB","500 GB","2.4 GHz");
        AbstractComputer server = ComputerFactory.getComputer("ServerComputer","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PcComputer Config::"+pc);
        System.out.println("Factory ServerComputer Config::"+server);
    }
}
