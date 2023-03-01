package com.lugo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
// un evento es lo que responde a una accion que ejecutamos
public class MainForm {
    private JTextPane PanelPrecio;
    private JTextPane PanelTotal;
    private JTextPane PanelIVA;
    private JButton CalcularBoton;
    private JPanel IVAPanel;
   // public ActionListener botonPulsado(){
    //    System.out.println("Hola");
     //   return null;
    //}
    public MainForm() {
        //CalcularBoton.addActionListener(botonPulsado()); //eventos listener espera que un evento se produzca
        //PanelPrecio.addKeyListener(new KeyAdapter() {
        //    @Override
        //   public void keyTyped(KeyEvent e) { //evento keyTyped espera que a recibir valores por teclado
        //        super.keyTyped(e);
        //        String precio = PanelPrecio.getText() + "A";
        //        PanelPrecio.setText(precio);
        //     }
        //});
        //}
        CalcularBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(PanelPrecio.getText()); //convierte a float el string
                double i = Double.parseDouble(PanelIVA.getText());

                double result = p + (p / 100 * i);

                PanelTotal.setText(Double.toString(result)); //el float lo convierte a string
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax"); //titulo del programa
        frame.setContentPane(new MainForm().IVAPanel);
        frame.setVisible(true); //haciendo visible la pantalla


    }
}
