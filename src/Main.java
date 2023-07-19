/* Reto de Mouredev:
 * Reto #4
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if (i>2 && i%2 == 1 && i%3 != 0 && i%5 != 0 && i%7 != 0 || i == 2 || i == 3 || i == 5 || i == 7){
                System.out.println(i);
            }
        }
    }
}