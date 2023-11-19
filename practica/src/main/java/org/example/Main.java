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

        Vehiculo vehiculo = new Vehiculo("123-ABC", "BMW", "2023", "Negro", 100.1);
        Vehiculo.Vehiculo();

    }


    //Creacion de clases
    public class Circulo {
        //atributos
        int x, y, radio;

        //Crear objetos
        Circulo circulo1;
        Circulo circulo2;

        //Crear objetos y asignar un espacio en la memoria
        Circulo() {
            circulo1 = new Circulo();
            circulo2 = new Circulo();

        }

    }

    //Elementos de una clase, describe un tipo de objetos con caracteristicas comunes
    //La informacion de un objeto se almacena en atributos
    public class Vehiculo {
        String matricula;
        String marca;
        String modelo;
        String color;
        double tarifa;
        boolean disponible;

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getTarifa() {
            return tarifa;
        }

        public void setTarifa(double tarifa) {
            this.tarifa = tarifa;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

        //Metodo constructor de la clase vehiculo
        public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
           /* Vehiculo matricula;
            matricula = new Vehiculo();*/
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
            this.color  = color;
            this.tarifa = tarifa;

            Vehiculo vehiculo1 = new Vehiculo("123-ABC", "BMW", "2023", "Negro", 100.1);
            Vehiculo vehiculo2 = new Vehiculo("456-DEF", "MERCEDES", "2023", "Blanco", 20.1);

            System.out.println("Matricula: " + vehiculo2.matricula);


        }


    }
    Vehiculo vehiculo1 = new Vehiculo("123-ABC", "BMW", "2023", "Negro", 100.1);
    Vehiculo vehiculo2 = new Vehiculo("456-DEF", "MERCEDES", "2023", "Blanco", 20.1);
System.out.print("Matricula: " + vehiculo2.getMatricula());

}
