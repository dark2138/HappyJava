package BankExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    private String accountNumber;
    private String customerId;
    private Integer balance = 0;
    private static Scanner in = new Scanner(System.in);

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Integer balance) {
        this.balance = balance ;
    }


    public void deposit(int balance) throws InvalidTransactionException  {

        if (balance <= 0) {
            throw new InvalidTransactionException("입금 금액은 0보다 커야 합니다.");
        }

        this.balance += balance;
        System.out.println(balance + "원 입금되었습니다. 현재 잔고: " + this.balance);


    }

    public void withdraw(int balance) throws InvalidTransactionException {
        if (balance <= 0) {
            throw new InvalidTransactionException("출금 금액은 0보다 커야 합니다.");
        }

        if (this.balance - balance < 0) {
            throw new InvalidTransactionException("잔액이 부족합니다.");
        }
        this.balance -= balance;
        System.out.println(balance + "원 출금되었습니다. 현재 잔고: " + this.balance);


    }




}
