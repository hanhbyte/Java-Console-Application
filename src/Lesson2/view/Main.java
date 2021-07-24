package Lesson2.view;

import Lesson2.model.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Receipt> receiptArrayList = new ArrayList<>();
        System.out.println("Enter information for households using electricity : ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            Receipt receipt = new Receipt();
            System.out.println("Enter the receipt information of the th household "+(i+1)+" : ");
            receipt.enterReceipt();
            receiptArrayList.add(receipt);
        }

        System.out.println("Receipt information of households: ");
        for (int i = 0; i < receiptArrayList.size(); i++){
            System.out.println("Second household receipt information " +(i+1)+": ");
            receiptArrayList.get(i).showReceipt();
        }
    }
}
