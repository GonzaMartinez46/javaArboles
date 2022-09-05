/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinario;

/**
 *
 * @author gonza
 */
public class Arbol {
    NodoArbol inicial;
    
    public Arbol(){
        this.inicial=null;
  
    }
    
    public void insertar(int valor){
        if(this.inicial==null){
            this.inicial=new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    
    
    //RECORRIDOS
    public void activarPreorden(){
        this.preorden(this.inicial);
        
    }
    
    public void preorden(NodoArbol nodo){
        if(nodo==null){
            return; //detener recursividad
        }else{
            System.out.print(nodo.getValor()+", ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDerecho());
        }
              
    }
    //INORDEN
     public void activarInorden(){
        this.inOrden(this.inicial);
        
    }
    
    public void inOrden(NodoArbol nodo){
        if(nodo==null){
            return; //detener recursividad
        }else{
            inOrden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+", ");
            inOrden(nodo.getNodoDerecho());
        }
              
    }
    //POSTORDEN
         public void activarPostorden(){
        this.Postorden(this.inicial);
        
    }
    
    public void Postorden(NodoArbol nodo){
        if(nodo==null){
            return; //detener recursividad
        }else{
            Postorden(nodo.getNodoIzq());
            Postorden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+", ");
        }
              
    }
}
