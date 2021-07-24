package Lesson1.model;

import Lesson1.Manager;

import java.util.Scanner;

public class Hotel extends Manager {
    private int day;
    private String room;
    private double price;
    private Customer customer;

    public Hotel() {
        super();
    }

    public Hotel(int day, String room, double price, Customer customer) {
        super();
        this.day = day;
        this.room = room;
        this.price = price;
        this.customer = customer;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double roomPayment(int idCard){
        return day * price;
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", room='" + room + '\'' +
                ", price=" + price +
                '}';
    }


}
