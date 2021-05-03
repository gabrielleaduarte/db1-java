package br.com.gabrielleaduarte.db1start;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        System.out.println("X = " + (a+b));
    }
}
