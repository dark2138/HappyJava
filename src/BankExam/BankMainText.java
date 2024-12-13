package BankExam;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMainText {




    public static void main(String[] args) {


        Bank bk = new Bank();

        boolean run = true;

        while(run) {
            System.out.println("************************************************************");
            System.out.println("1.고객등록 | 2.계좌생성 | 3.입금 | 4.출금 | 5.잔액조회 | 6.종료");
            System.out.println("************************************************************");
            System.out.print("메뉴를 선택해주세요 >> ");
            Scanner scanner = new Scanner(System.in);
            int selectMenu = scanner.nextInt();

            switch(selectMenu) {
                case 1:

                    System.out.print("고객 ID 입력 : ");
                    String aId = scanner.next();

                    System.out.print("고객 이름 입력 : " );
                    String bName = scanner.next();

                    try {
                        bk.createCustomer(aId, bName);
                        System.out.println("고객이 성공적으로 등록되었습니다");
                    } catch (BankOperationException e) {
                        System.out.println(e.getMessage());;
                    }

                    break;




                case 2:
                    System.out.print("고객 ID 입력 : ");
                    String cId = scanner.next();

                    Customer ct2 = bk.findCustomer(cId);

                    if(ct2 == null) {
                        System.out.println("고객이 존재하지 않습니다.");
                    }else{
                        try {
                            ct2.createAccount();
                        } catch (BankOperationException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    break;

                case 3:

                    System.out.print("고객 아이디: ");
                    String id3 = scanner.next();
                    Customer customer3 = bk.findCustomer(id3);

                    if(customer3 == null){
                        System.out.println("고객이 존재하지 않습니다.");
                    }else {

                        System.out.print("계좌 번호: ");
                        String accountNumber = scanner.next();
                        try {
                            Account account3 = customer3.findAccountNumber(accountNumber);
                            System.out.print("입금할 금액을 입력해주세요: ");
                            int balance = scanner.nextInt();


                            account3.deposit(balance);

                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        } catch (InvalidTransactionException e1) {
                            System.out.println(e1.getMessage());;
                        }

                    }

                    break;
                case 4:

                    System.out.print("고객 아이디: ");
                    String id4 = scanner.next();
                    Customer customer4 = bk.findCustomer(id4);
                    if(customer4 == null){
                        System.out.println("고객이 존재하지 않습니다.");
                    }else {

                        System.out.print("계좌 번호: ");
                        String accountNumber = scanner.next();
                        try {
                            Account account4 = customer4.findAccountNumber(accountNumber);
                            System.out.print("출금할 금액을 입력해주세요: ");
                            int balance2 = scanner.nextInt();
                            account4.withdraw(balance2);

                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());

                        } catch (InvalidTransactionException e1) {
                            System.out.println(e1.getMessage());
                        }


                    }


                    break;
                case 5:
                    System.out.print("고객 아이디: ");
                    String id5 = scanner.next();
                    Customer customer5 = bk.findCustomer(id5);
                    if(customer5 == null){
                        System.out.println("고객이 존재하지 않습니다.");
                    }else {

                        System.out.print("계좌 번호: ");
                        String accountNumber = scanner.next();
                        try {
                            Account account5 = customer5.findAccountNumber(accountNumber);
                            System.out.println("현재 잔고: " + account5.getBalance());

                        } catch (AccountNotFoundException e) {
                            System.out.println(e.getMessage());
                        }


                    }


                    break;
                case 6:
                    run = false;
                    System.out.println("프로그램을 종료합니다. 다음에 또 이용해주세요.");
                    break;
                default:
                    System.out.println("error - 메뉴선택 오류");

            }

        } //while문 종료


    }

}
