package com.minh.design.patterns.observer;

/**
 * Created by HNguyen on 22.01.2015.
 */
public class NewsSubscriber implements Subscriber {

    private String name;
    private Publisher topic;

    public NewsSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Publisher sub) {
        this.topic=sub;
    }

}
