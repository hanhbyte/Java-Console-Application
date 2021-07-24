package Lesson2.model;

import java.util.Scanner;

public class Receipt {
    private String information;
    private int oldIndex;
    private int newIndex;
    private int payment;

    public Receipt() {
    }

    public Receipt(String information, int oldIndex, int newIndex, int payment) {
        super();
        this.information = information;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.payment = payment;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void enterReceipt(Scanner scan){
        System.out.println("Enter New index : ");
        newIndex = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Old index : ");
        oldIndex = scan.nextInt();
        scan.nextLine();
        payment = (newIndex - oldIndex) * 750;
    }

    public void showReceipt(){
        System.out.println("\t New index : "+newIndex);
        System.out.println("\t Old index : "+oldIndex);
        System.out.println("\t Payment : "+payment);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "information='" + information + '\'' +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", payment=" + payment +
                '}';
    }

    public void enterReceipt() {
    }
}
