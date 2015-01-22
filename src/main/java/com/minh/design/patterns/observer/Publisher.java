package com.minh.design.patterns.observer;

/**
 * Created by HNguyen on 22.01.2015.
 */
public interface Publisher {

    //methods to register and unregister observers
    public void register(Subscriber obj);
    public void unregister(Subscriber obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Subscriber obj);

    //method to post message to the topic
    public void postMessage(String msg);
}
