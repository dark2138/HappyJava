package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /*    for (int i = 0; i < 10; i++) {
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
        System.out.println("-------------------2-1");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
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

        }


        System.out.println("-------------------7");
        //for

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5-i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2*i-1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("-------------------7");

*/
/*
        outter:
        for(int i = 0; i< 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2)
                    continue outter;
                System.out.println(i + ", " + k);


            }

        }



 */
/*
        int[] copyFrom = {1,2,3};
        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);
        for(int c : copyTo){
            System.out.println(c);
        }
        System.out.println("----------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);


          for(int c : copyTo2){
             System.out.println(c);
           }
*/





//        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};
//        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 3);
//        for(char c : copyTo){
//            System.out.println(c);
//        }
//
//
//
//        int[] array = {5,4,3,1,2};
//        Arrays.sort(array);
//
//        int i = Arrays.binarySearch(array, 4);
//        System.out.println(i);


/*
            int num =0;
            String name = "kang";
            System.out.println("Before Name : " + name + " " + num);

            changeName(name, num);

            System.out.println("After Name 1 : " + name + " " + num);
*/
            int num =0;
            String name = "kang";


            DocTest nnn =  new DocTest();

            nnn.changeName3(name);

        System.out.println("After Name 333 : " +   name);

        System.out.println("After Name 121 : " +   nnn.changeName2(name));


            name += " babo";
            System.out.println("After Name 2 : " + name);



        int age = 32;
        String name2 = "kang";
        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("c++");

        test(skills);



        System.out.println(skills.get(0));
        System.out.println(skills.get(3));



















    }

    public static void changeName3(String s) {
        s += " babo";

        System.out.println("dd : " + s);
    }


    public String changeName2(String s) {
        s += " babo";
        return s;
    }



    public static void changeName(String s, int num) {
        s += " babo";
        num++;
    }

    public static void test(List<String> list) {
        String mySkill = list.get(0);
        System.out.println(mySkill+ " 입니다");
        list.add("python");
    }








}
