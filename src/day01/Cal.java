package day01;

public class Cal {

    int i = 5;


    public int get() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public void print() {
        System.out.println("부모의 변수 : "+i);
    }
}
