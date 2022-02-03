package com.shankar.designpattern.observer;

public class YouTube {
    public static void main(String[] args) {
        Channel shg = new Channel();
        Subscriber s1 = new Subscriber("Shankar");
        Subscriber s2 = new Subscriber("Samriddha");
        Subscriber s3 = new Subscriber("Rama");
        Subscriber s4 = new Subscriber("Ram");
        Subscriber s5 = new Subscriber("Hari");
        shg.subscribe(s1);
        shg.subscribe(s2);
        shg.subscribe(s3);
        shg.subscribe(s4);
        shg.subscribe(s5);
        s1.subscribeChannel(shg);
        s2.subscribeChannel(shg);
        s3.subscribeChannel(shg);
        s4.subscribeChannel(shg);
        s5.subscribeChannel(shg);
        shg.upload("Java Video");


    }
}
