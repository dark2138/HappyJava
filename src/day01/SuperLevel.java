package day01;

public class SuperLevel extends PlayerLevel{
    @Override
    void run() {

        System.out.println("엄청 빠르게 달립니다");

    }

    @Override
    void jump() {

        System.out.println("아주 높이 합니다");

    }

    @Override
    void turn() {

        System.out.println("턴 합니다");

    }

    @Override
    void showLevelMessage() {

        System.out.println("고급자 레벨입니다");
        

    }
}
