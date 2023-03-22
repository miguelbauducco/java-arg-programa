package tp4;
import java.util.Scanner;


// public class trabajo4 {
//    public static void main(String[] args) {

        //enunciado 1

//        Scanner lectura = new Scanner(System.in);

//        System.out.println("Ingrese su nombre:");
//        String nombre = lectura.next();

//        System.out.println("Ingrese su apellido:");
//        String apellido = lectura.next();

//        System.out.println( "Ingrese su edad: ");

        //enunciado 2

//        int edad = lectura.nextInt();

//        System.out.println("Su nombre es: "+ nombre + " " + apellido + " y tiene " + edad + " años");

//        if(edad<18){
//            System.out.print("Usted es menor de edad" );
//        } else {
//            System.out.println("Usted es mayor de edad");
//        }
//
//    }

    //enunciado 3

public class supermercado {

    Scanner dato = new Scanner(System.in);

    public void compraproducto() {

        String nombreproducto = "";
        double precio, subtotal, total = 0;
        int cantidad;

        System.out.println("Ingrese el nombre del producto");
        nombreproducto = dato.next();

        System.out.println("Ingrese el precio del producto");
        precio = dato.nextDouble();

        System.out.println("Ingrese cantidad");
        cantidad = dato.nextInt();

        subtotal = precio * cantidad;

        //System.out.println("El subtotal es: " + subtotal);

        if (subtotal > 1000) {
            System.out.println("El descuento es: " + subtotal * 0.20);
            total = subtotal - (subtotal * 0.20);
        } else {
            System.out.println("No hay descuento porque la compra no supera los $1000");
            total = subtotal;
        }

        System.out.println("El total es: " + total);

    }

    public void seccion(){

        String opcion = "";

        System.out.println("Frutas");
        System.out.println("Lacteos");
        System.out.println("Gaseosas");

        System.out.println("Escriba el tipo de producto deseado: ");

         opcion = dato.next();

        switch(opcion){
            case "frutas" : compraproducto();
                                    break;

            case "lacteos" : compraproducto();
                                break;

            case "gaseosas" : compraproducto();
                                break;
        }

    }

    public static void main (String []args){
        supermercado cp = new supermercado();
        cp.seccion();
    }
}







