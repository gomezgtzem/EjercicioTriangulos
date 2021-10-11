package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Validacion de angulos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa primer angulo");
        int angulo1 = sc.nextInt();
        System.out.println("Cual es el segundo angulo?");
        sc.nextLine();
        int angulo2 = sc.nextInt();
        System.out.println("Cual es el tercer angulo");
        sc.nextLine();
        int angulo3 = sc.nextInt();
        int suma = angulo1+angulo2+angulo3;
        if(suma ==180){
            System.out.println("El triangulo existe");
        }else{
            System.out.println("El triangulo no es valido");
        }
    }
}
