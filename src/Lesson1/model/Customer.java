package Lesson1.model;

import Lesson1.Manager;

import java.util.Scanner;

public class Customer extends Manager {
    private String name;
    private String birth;
    private int idCard;

    public Customer(){

    }

    public Customer(String name, String birth, int idCard) {
        super();
        this.name = name;
        this.birth = birth;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getIdcard() {
        return idCard;
    }

    public void setIdcard(int idcard) {
        this.idCard = idcard;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", idcard=" + idCard +
                '}';
    }
}
