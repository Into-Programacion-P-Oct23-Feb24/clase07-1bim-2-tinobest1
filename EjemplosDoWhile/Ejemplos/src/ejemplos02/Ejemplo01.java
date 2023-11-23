/*
1
2
3
4
5
6
7
8
9
10
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int contador = 1;
        int suma;
        suma = 1;
        do {
            contador = contador + contador + 1;
            suma = suma + contador;  
          System.out.printf("%s\n", suma);
        } while (contador <= 10);
    }

}
