/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class HelloWorldThread extends Thread {
    @Override
    public void run() {
    System.out.println("Salut lume!");
    }
}
