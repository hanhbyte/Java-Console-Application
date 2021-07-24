package Lesson1.view;

import Lesson1.controller.CustomerColtroller;
import Lesson1.model.Customer;

import java.util.Scanner;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);
    CustomerColtroller customerColtroller = new CustomerColtroller();

    public void formCreateCustomer(){
        boolean checkCreate = true;
        while (checkCreate){
            System.out.println("Nhập vào tên của khách hàng : ");
            String name = scanner.nextLine();
            System.out.println("Nhập vào ngày sinh của khách hàng : ");
            String birth = scanner.nextLine();
            System.out.println("Nhập ID của khách hàng : ");
            int idCard = scanner.nextInt();
            Customer customer = new Customer(name, birth, idCard);

            customerColtroller.creatCustomer(customer);
            customerColtroller.deleteCustomer(customer);
            customerColtroller.paymentCustomer(customer);

            System.out.println("Nhập một phím bất kì để tạo dữ liệu tiếp - Nhập QUIT để thoát khỏi chương trình");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Lesson1();
            }
        }
    }

    public void deleteManagerList(){
        System.out.println("The rest of the list");
        customerColtroller.deleteCustomer();

    }


    public void paymentCustomer(int idCard){
        System.out.println("Choose payment method : ");
        return Customer;
    }
    public void manageCustomerList(){
        System.out.println("NAME---BIRTH--IDCARD");
        System.out.println("Size == "+customerColtroller.showListCustomer().size());
        for(int i=0; i<customerColtroller.showListCustomer().size();i++){
            System.out.println(" "+customerColtroller.showListCustomer().get(i).getName()
                    +"   " +customerColtroller.showListCustomer().get(i).getBirth()
                    +"   " +customerColtroller.showListCustomer().get(i).getIdcard());

        }

        System.out.println("Nhập quit để thoát: ");
        String enterOrQuit = scanner.next();
        if(enterOrQuit.equalsIgnoreCase("quit")){
            new Lesson1();
        }
    }
}
