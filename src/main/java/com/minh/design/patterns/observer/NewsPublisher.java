package com.minh.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HNguyen on 22.01.2015.
 */
public class NewsPublisher implements Publisher {

    private List<Subscriber> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public NewsPublisher(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void register(Subscriber obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Subscriber obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Subscriber> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }

            observersLocal = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for (Subscriber obj : observersLocal) {
            obj.update();
        }

    }

    @Override
    public Object getUpdate(Subscriber obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
