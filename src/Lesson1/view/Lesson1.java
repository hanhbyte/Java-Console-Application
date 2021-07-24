package Lesson1.view;

import java.util.Scanner;

public class Lesson1 {
    Scanner scanner = new Scanner(System.in);
    CustomerView customerView = new CustomerView();
    public Lesson1() {
        System.out.println("MENU MANAGE HOTEL");
        System.out.println("1.Create Customer\n2.Delete Customer Information\n3.Pay For Room\n4.Show List Student");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                customerView.formCreateCustomer();
                break;
            case 2:
                customerView.deleteManagerList();
                break;
            case 3:
                customerView.paymentCustomer();
            case 4:
                customerView.manageCustomerList();
                break;
        }
    }

    public static void main(String[] args) {
        new Lesson1();
        // write your code here
    }
}
