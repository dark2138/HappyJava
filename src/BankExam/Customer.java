package BankExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {


    private String id;
    private String name;
    private String account;
    private Integer accountNumbers;
    private ArrayList<Account> accountList3  = new ArrayList<>();

    private static Scanner in = new Scanner(System.in);
    private static final int MAX_ACCOUNT = 5;

    public Integer getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(Integer accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getId() {
        return id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccountList3() {
        return accountList3;
    }

    public void setAccountList3(ArrayList<Account> accountList3) {
        this.accountList3 = accountList3;
    }

    public void createAccount() throws BankOperationException {
        if (accountNumbers >= MAX_ACCOUNT) {
            throw new BankOperationException("고객당 최대 5개의 계좌만 생성 가능합니다.");
        }


        System.out.print("새 계좌 번호 입력해주세요 : ");
        String  accountNumber = in.nextLine();

        Account account1 = new Account();
        account1.setAccountNumber(accountNumber);
        account1.setCustomerId(this.id);

        this.accountList3.add(account1);


        System.out.println("계좌가 성공적으로 생성되었습니다: " + accountNumber );

    }


    public Account findAccountNumber(String accountNumber) throws AccountNotFoundException {
        for (Account account : this.accountList3) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new AccountNotFoundException("존재하는 계좌 번호가 없습니다. 다른 번호로 조회 부탁드립니다.");
    }







}
