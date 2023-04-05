package tp6;
import java.util.Scanner;

public class Calculadora {

    public double numeroA;
    public String operacion;
    public double numeroB;
    public double resultado;

    public Calculadora(double numeroA, String operacion, double numeroB) {
        this.numeroA = numeroA;
        this.operacion = operacion;
        this.numeroB = numeroB;
    }

    public double methodSuma() {
        resultado = numeroA + numeroB;
        return resultado;
    }

    public double methodResta() {
        resultado = numeroA - numeroB;
        return resultado;
    }

    public double methodMultiplicacion() {
        resultado = numeroA * numeroB;
        return resultado;
    }

    public double methodDivision() {
        resultado = numeroA / numeroB;
        return resultado;
    }
}

 class Main{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero, el signo de operacion y el segundo numero: ");
        Calculadora calculo = new Calculadora(
                teclado.nextDouble(),
                teclado.next(),
                teclado.nextDouble()
        );

        switch(calculo.operacion){
            case "+":
                System.out.println(calculo.methodSuma());
                break;
            case "-":
                System.out.println(calculo.methodResta());
                break;
            case "*":
                System.out.println(calculo.methodMultiplicacion());
                break;
            case "/":
                System.out.println(calculo.methodDivision());
                break;
            default:
                System.out.println("ERROR, REINTENTE POR FAVOR");
        }
    }
}
