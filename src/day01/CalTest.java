package day01;

public class CalTest {


    public static void test(Cal cal) {



        System.out.println(cal.i);
        System.out.println(cal.get());

        ((CalAdd)cal).print();






    }


    public static void main(String[] args) {

        Cal cal = new Cal();


        System.out.println(cal.i);


        CalAdd calAdd = new CalAdd();

        System.out.println("1 :  "+calAdd.i);

       // int a = 8;

        //cal.setI(a);

        System.out.println("2 :  "+cal.i);


        //calAdd.setI(a);

        System.out.println("3 :  "+calAdd.i);


        Cal cal2 =  new CalAdd();


        System.out.println("4 :  "+cal2.i);

        System.out.println("5 :  "+cal2.get());

        test(cal2); //5 10 10


        Cal cal9 = null;

        Cal cal3 = new Cal();

        //test(cal3); // 오류

        //System.out.println("6 :  " + test(cal3));

        Cal cal6 = new CalAdd();
        CalAdd cal7 = new CalAdd();

        cal9 = new CalAdd();


       // cal7.get123123()



        System.out.println("6 :  " );







    }




}
