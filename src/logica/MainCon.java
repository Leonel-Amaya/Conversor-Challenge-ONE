/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import ventanas.Bienvenida;
import javax.swing.JFrame;

/**
 *
 * @author Leonel Amaya
 */
public class MainCon {
    public static void main(String[] args) {
        Bienvenida inicio = new Bienvenida();
        inicio.setVisible(true);
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
