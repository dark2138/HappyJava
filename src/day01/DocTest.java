package day01;

/**
 * 자바 주석 테스트 하는 클래스
 *
 * @author rion01
 * @since 2024.12.02
 *
 *
 */


public class DocTest {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("**********");

        }

        System.out.println("-------------------");


        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int rang = 1 ;

        while (rang < 11){

            System.out.println("**********");


            rang++;

        }

        System.out.println("-------------------2");


        int rang2 = 1 ;

        while (rang2 < 6){

            int rang3 = 0 ;

            while (rang3 < rang2){
                System.out.print("*");
                rang3++;
            }
            System.out.println();

            rang2++;

        }

        System.out.println("-------------------3");


        for (int i = 0; i < 10; i++) {
            for (int j = 10-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------4");


        for(int i=10; i > 0; i--) {
            for(int j=0; j < 10 - i; j++) {
                System.out.print(" ");
            }

            for(int k=0; k< 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("-------------------5");



        for(int i=0; i < 5; i++) {
            for(int j=0; j < 5; j++) {
                if(i <= 5 / 2) {
                    if(i+j <= 5/2-1) {
                        System.out.print(" ");
                    }else if(j-i >= 5/2+1) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }else
                {
                    if (i-j>=5/2+1)
                        System.out.print(" ");
                    else if (i+j>=5/2*3+1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------6");


        for (int i = 1; i <= 3; i++) {
            // 상단 공백
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // 상단 *
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        } //for


        for (int i = 2; i >= 1; i--) {
            // 하단 공백
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }

            // 하단 *
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }

            System.out.println();
        } //for












    }




}
