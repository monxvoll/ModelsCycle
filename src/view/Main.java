package view;


import controller.CycleController;
import controller.LoopController;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        LoopController Control = new LoopController();
        CycleController ControlDos = new CycleController();

        String show = Control.setNum();
        String showDos = ControlDos.setNumDos();
        String showTres = ControlDos.setNumTres();


        JOptionPane.showMessageDialog(null,"La lista es : \n" +show+ "[METODO FOR] \n" +showDos+ "[METODO WHILE] \n" +showTres+ "[METODO DO WHILE]");


    }
}