package com.headfirst.designpatterns.ch2OBSERVER;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
