package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoPlay {


    public static void main(String[] args) {


        Random random = new Random();

        LottoMathin lttm = new LottoMathin();
        LottoBall ball = new LottoBall();
        ArrayList<Integer> aa   = new ArrayList<>();
        //List abb   = new ArrayList<Integer, ArrayList<Integer>>();


        for(int i = 0; i < 6; i++) {

             int number2 = random.nextInt(45) + 1;

             ball.setNumber(number2);
             aa.add(ball.getNumber());

        }

        lttm.setLottoList(aa);

        System.out.println(lttm.getLottoList());






    }






}
