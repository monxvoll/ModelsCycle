package controller;

import model.DoWhileModel;
import model.WhileModel;

public class CycleController {
    WhileModel LogDos = new WhileModel();
    DoWhileModel LogTres = new DoWhileModel();

    public String setNumDos (){
        return LogDos.ceroTresWhile();
    }

    public  String setNumTres(){
        return  LogTres.ceroTresDoWhile();
    }
}
