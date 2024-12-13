package day01;

public class Char {

    public static void find(String word, char fword) {


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == fword) {
                System.out.println("true");
                System.out.println(i);
                break;
            }else
                System.out.println("false");


        }



    }


    public static void main(String[] args) {


        String helloStr = "hello";
        //String[] helloStrArr = helloStr.split("");


        //System.out.println(helloStrArr[0]); // h


        //System.out.println(helloStr.charAt(0)); // h

        find(helloStr, 'o');


        String a = "Java";
        String b = "Java";
        String c = "Java";

        String c1 = "Java";


        System.out.println(c1.equals(c));










    }




}
