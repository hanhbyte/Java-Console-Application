package Lesson1;

import Lesson1.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Customer> listPeople = new ArrayList<>();

    public Manager() {
        listPeople = new ArrayList<>();
    }

    public void add(Customer e) {
        listPeople.add(e);
    }

    public void delete(int indcard, Customer e){
        for (int i = 0; i < listPeople.size(); i++) {
            if (listPeople.get(i).getIdcard() ==indcard){
                listPeople.remove(indcard);
                break;
            }
        }
    }
    public void displayList(){
        for (int i = 0; i < listPeople.size(); i++) {
            System.out.println(listPeople.get(i).toString());
        }
    }

    public Customer searchName(String name){
        for (int i = 0; i < listPeople.size(); i++) {
            if (listPeople.get(i).equals(name))
                return listPeople.get(i);
        }
        return null;
    }


}
