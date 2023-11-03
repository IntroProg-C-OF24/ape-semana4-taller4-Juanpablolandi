package ape_semana4_soluciones;
import java.util.Scanner;
public class costoComputador_5 {
    public static void main(String[] args) {
        double costoCPU;
        double costoTeclado;
        double costoPantalla;
        double costoRaton;
        double costoTotal;
        Scanner teclado = new Scanner (System.in); // DECLARANDO E INICIALIZANDO
        System.out.println("Ingrese el costo del CPU: ");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingrese el costo del teclado: ");
        costoTeclado = teclado.nextDouble();
        System.out.println("Ingrese el costo de la Pantalla: ");
        costoPantalla = teclado.nextDouble();
        System.out.println("Ingrese el costo del ratón: ");
        costoRaton = teclado.nextDouble();
        costoTotal = (costoCPU + costoTeclado + costoPantalla + costoRaton);
        System.out.println("El costo total es de: " + costoTotal);
    }
    
}
