package tp3;

public class trabajo3 {

    public static void main(String[] args) {

        int arreglo[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int i;

        //punto a
        //for(i=0; i<15; i++){
        //  System.out.println(arreglo[i]);
        //}

        //punto b
        //for(i=0; i<15; i++){
        //    System.out.println(arreglo[i]+5);
        //}

        //punto c array de 10 numeros - 9 espacios de dimension

        //int arreglo2[] = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        //System.out.println(arreglo2[6] / 3);


        //punto d

        //String productos[] =  {"Zapatillas", "Remeras", "Pantalones"};
        //int precios[] = new int[] {100, 50, 80 };


        //for(i=0; i<=2; i++){
        //    System.out.println("Producto: " + productos[i] + " Precio: " + precios[i]);
        //}

        //punto e

        String cursos[] = {"HTML/CSS" , "JavaScript", "React JS"};
        int notas[] = new int[]{10, 8, 6};

        int promedio = (notas[0] + notas[1] + notas[2])/3;

        for(i=0;i<cursos.length;i++){
            System.out.println(cursos[i] + ": " + notas[i]);
        }

        System.out.println("Su promedio es: " +promedio);

    }

}
