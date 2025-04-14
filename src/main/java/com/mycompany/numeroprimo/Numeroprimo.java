/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Numeroprimo {

    public static void main(String[] args) {
       int numero,cont = 0;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número: "));
       
       for (int i=1; i<=numero; i++) {
           if (numero % i == 0){
          
               cont++;}
           }
            if (cont == 2) {
               JOptionPane.showMessageDialog(null,"O número " + numero + " é primo.");
           }
            else {
               JOptionPane.showMessageDialog(null,"O número " + numero + " não é primo.");
           }
       
    }
}
