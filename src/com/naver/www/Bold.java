package com.naver.www;


import day01.VandingMachine;

public class Bold {




    public static void main(String[] args) {
        VandingMachine vanding1 = new VandingMachine();


        vanding1.setVnum(1);



        String na = vanding1.prshProductButton(1);

        System.out.println(na);

        System.out.println(vanding1.getVnum());



    }





}
