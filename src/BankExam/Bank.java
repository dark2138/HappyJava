package BankExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Customer> customerList2;
    private static Scanner in = new Scanner(System.in);
    private static final int MAX_CUSTOMERS = 100;
    private int customerNumber;

    public Bank() {
        this.customerList2 = new ArrayList<>();
        this.customerNumber = 0;
    }


    public ArrayList<Customer> getCustomerList2() {
        return customerList2;
    }

    public void createCustomer(String aid, String bName) throws BankOperationException {


        customerNumber = customerList2.size();

        if (customerNumber >= MAX_CUSTOMERS) {
            throw new BankOperationException("최대 고객 수를 초과했습니다.");
        }
        if (findCustomer(aid) != null) {
            throw new BankOperationException("고객 ID가 중복됩니다. :  " + aid);
        }


        Customer customer1 = new Customer();

        customer1.setId(aid);
        customer1.setName(bName);


        customerList2.add(customer1);

        customer1.setAccountNumbers(customerList2.size());

    }

    public Customer findCustomer(String aId) {


        for (Customer customer : customerList2) {
            if(customer.getId().equals(aId)) {
                System.out.println("고객의 아이디가 확인 되었습니다.");
                return customer;
            }
        }


        return null;
    }

}
