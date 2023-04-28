package model;

public class LoopModel {




     public String ceroTres() {
          String num = "";
          int limite = 4 ;
          for (int count = 1; count < limite; count++) {
               if ( count == limite -1) {
                    num  = num + count + " ";
               }else { num = num + count + ",";}
          }
          return num;
     }


}
