package com.sofka.project;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Comments Sofka
        // * Info comment
        // ? Warn comment
        // ! Error comment

        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese nombre de usuario");
        String userName = sc.nextLine();
        System.out.println("Ingrese celular");
        String cellPhone = sc.nextLine();
        System.out.println("Ingrese edad");
        String age = sc.nextLine();

        System.out.println("Bienvenido señor " + userName + ", es un placer para nosotros contar con una persona de " + age + " años.\n"
        + "Próximamente nos comunicaremos con usted al " + cellPhone + ".\n" + "Feliz día"
        );

    }
}
