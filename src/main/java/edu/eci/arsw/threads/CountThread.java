/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *Define el ciclo de vida de un hilo que imprime por pantalla los números entre A y B.
 */ 

public class CountThread extends Thread{
    int ini = 0 , fin = 0 ;
    public CountThread(int ini, int fin ){
        this.fin = fin;
        this.ini = ini;
    }
    public void run(){
        for (int i = ini ; i <= fin; i++ ){
            System.out.println(i);
        }
    }
}
