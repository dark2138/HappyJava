package day01;

public class BeginnerLevel extends PlayerLevel {

    @Override
    void run() {

        System.out.println("천천히 달립니다");

    }

    @Override
    void jump() {

        System.out.println("점프 못하지롱");

    }

    @Override
    void turn() {

        System.out.println("턴 하지못하지롱");

    }

    @Override
    void showLevelMessage() {

        System.out.println("초보자 레벨입니다");

    }
}
