/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolbinario;

/**
 *
 * @author gonza
 */
public class ArbolBinario {

    public static void main(String[] args) {
        Arbol arbol=new Arbol();
        
        arbol.insertar(50);
        arbol.insertar(6);
        arbol.insertar(40);
        arbol.insertar(30);
        arbol.insertar(90);
        
        System.out.println("INORDEN: ");
        arbol.activarInorden();
    }
}
