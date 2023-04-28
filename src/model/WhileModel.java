package model;

public class WhileModel {

    public String ceroTresWhile() {
        String num = "";
        int limite = 4;
        int countWhile = 1;

        while (countWhile < limite) {
            if (countWhile == limite - 1) {
                num = num + countWhile + " ";
            } else {
                num = num + countWhile + ",";

            }
            countWhile++;
        }
        return num;
    }
}



