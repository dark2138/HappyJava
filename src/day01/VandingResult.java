package day01;

import javax.swing.*;
import java.util.Scanner;

public class VandingResult {


    public static void main(String[] args) {

        VandingMachine vm = new VandingMachine();

        Scanner sc0 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        vm.is_Money = true;
        int num =    0;
        String menu = "";

        while (vm.is_Money){
            System.out.println("메뉴를 선택해주세요");
            num =    sc.nextInt();

            if(num == 0){
                menu = vm.prshProductButton(0);
                System.out.println(menu);
            } else if (num <0 || num > 4) {
                menu = vm.prshProductButton(num);
                System.out.println(menu);
            } else {
                menu = vm.prshProductButton(num);
                System.out.println("메뉴는  : " + menu);
                vm.is_Money = false;
            }


        }

        //System.out.println("메뉴는  : " + menu);

    }
}
