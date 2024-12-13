package day01;

public class VandingMachine {

    boolean is_Money= false;
     int vnum;


    public String prshProductButton(int menuId){
            switch (menuId){
                case 1:
                    return "콜라입니다";
                case 2:
                    return "사이다입니다";
                case 3:
                    return "닥터페퍼입니다";
                case 4:
                    return "환타입니다";
                default:
                    return "없는 메뉴입니다";

            }
    }

    public void setVnum(int vnum){
        this.vnum = vnum;
    }

    public int getVnum(){

        return vnum;
    }



}
