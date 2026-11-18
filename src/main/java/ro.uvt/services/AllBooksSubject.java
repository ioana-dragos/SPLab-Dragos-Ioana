package ro.uvt.services;

import org.springframework.stereotype.Component;
import ro.uvt.models.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void add(Book book) {
        notifyObservers(book);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
}