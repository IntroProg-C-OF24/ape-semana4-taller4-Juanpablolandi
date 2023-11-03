package ape_semana4_soluciones;
import java.util.Scanner;
public class tablaMultiplicar_3 {
    public static void main(String[] args) {
        int numIngresar;
        Scanner teclado = new Scanner (System.in); //DECLARANDO E INICIALIZANDO
        System.out.println("Ingrese un número entre el 2 y 6: ");
        numIngresar = teclado.nextInt();
        System.out.println("TABLA PRESENTADA");
        for (int i = 1; i <= 10; i++) {
        //número*i = (número*i)
            System.out.println(numIngresar * i);
        }    
    }
}
