package com.minh.design.patterns.observer;

/**
 * Created by HNguyen on 22.01.2015.
 */
public interface Subscriber {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Publisher sub);
}
