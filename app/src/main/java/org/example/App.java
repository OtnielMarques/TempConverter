/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        int graus = 31;
        char convert = 'F';

        if(convert == 'F' || convert == 'f'){
            System.out.println("O valor de graus em Fahrenheint é: " + ((graus * 1.8) + 32));
        }
        if(convert == 'C' || convert == 'c'){
            System.out.println("O valor de graus em Celsius é: " + ((graus -32) * 0.55));
        }
    return "";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

    }
}
