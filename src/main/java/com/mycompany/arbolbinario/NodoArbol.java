/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author gonza
 */
public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDerecho;
    
    public NodoArbol(int valor){
        this.valor=valor;
        this.nodoDerecho=null;
        this.nodoIzq=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
   
    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

  public void insertar(int _valor){
      if(_valor<this.valor){
          //insertar lado izquierdo
          //si el valor del nodo izquierdo no existe entonces le asigno el valor
          if(this.nodoIzq == null){
              this.nodoIzq= new NodoArbol(_valor);
          }else{
              this.nodoIzq.insertar(_valor);
          }
      }else{
          //insertar lado derecho
          if(this.nodoDerecho==null){
              this.nodoDerecho= new NodoArbol(_valor);
          }else{
              this.nodoDerecho.insertar(_valor);
          }
      }
  }
            
}
