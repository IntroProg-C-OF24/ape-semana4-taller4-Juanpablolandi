package ape_semana4_soluciones;
import java.util.Scanner;
public class ValorPlanilla_4 {
    public static void main(String[] args) {
        double costoMinuto, minutosConsumidos, valorPlanilla;
        Scanner teclado = new Scanner (System.in); //DECLARANDO E INICIALIZANDO
        System.out.println("Ingrese el costo por minutos de la planilla: ");
        costoMinuto = teclado.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos: ");
        minutosConsumidos = teclado.nextDouble();
        valorPlanilla = (costoMinuto * minutosConsumidos );
        System.out.println("El costo de la planilla: " + valorPlanilla);
    }
}
