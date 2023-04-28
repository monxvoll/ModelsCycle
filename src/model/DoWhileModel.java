package model;

public class DoWhileModel {


    public String ceroTresDoWhile() {
        String num = "";
        int limite = 4;
        int countDoWhile = 1;
        do {
            if (countDoWhile == limite - 1) {
                num = num + countDoWhile + " ";

            } else {
                num = num + countDoWhile + ",";


            }
            countDoWhile++;
        }while (countDoWhile < limite) ;
        return num;
    }
}
