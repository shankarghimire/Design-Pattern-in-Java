package com.shankar.designpattern.observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public void update(){
        System.out.println( "Hey " + name + ", New Video has been just uploaded!");
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
    public Subscriber(String name){
        this.name= name;
    }
}
