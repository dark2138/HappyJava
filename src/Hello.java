public class Hello {

    public static void main(String[] args) {
     System.out.println("Hello World");
     System.out.println("화이트 갈릭 버거 맛있어!");


        int i = 0;

        while(i<99){

            int j = 98;

            while ( j > i ) {
                System.out.print(" ");

                j--;
            }
            int k = 0;

            while ( k < 2*i+1 ) {
                System.out.print("*");

                k++;
            }

            System.out.println(" ");




            i++;
        }




        int a = 1;

        while(a<= 100){

            System.out.println(a);

            a++;


        }


        int value = 10;
        int maxInt = Integer.MAX_VALUE;
        System.out.println(value + 1);
        System.out.println(maxInt + 1);


        int k = 0;
        while(k++ < 10){
            if(k % 2 != 0)
                continue;
            System.out.println(k);
        }




    }

}
