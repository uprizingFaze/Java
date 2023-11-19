package org.example;

//Definicion de clase cualquier nombre
public class Main {
    //definicion de metodo, esto define *main()*
    //El ; indica que el compilador a finalizado una sentencia
    public static void main(String[] args) {
        //Calcular perimetro de un circunferencia
        final double PI = 3.14;
        double radio = 25.0, perimetro;
        int mesNacimiento = 0;

        perimetro = 2 * PI * radio;
        System.out.println("El perimetro del radio " + radio + " es " + perimetro);

    }
//Creacion de clases
    public class Circulo {
        //atributos
        int x,y, radio;

        //Objetos
        Circulo circulo1;
        Circulo circulo2;


    }

}