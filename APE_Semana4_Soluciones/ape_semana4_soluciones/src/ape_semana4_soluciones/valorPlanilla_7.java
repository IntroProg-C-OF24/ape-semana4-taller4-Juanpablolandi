package ape_semana4_soluciones;
import java.util.Scanner;
public class valorPlanilla_7 {
    public static void main(String[] args) {
        double costoKilovatioporHora;
        double consumoKilovatioporHora;
        double valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo del kilovatio por hora: ");
        costoKilovatioporHora = teclado.nextDouble();
        System.out.println("Ingrese el consumo de kilovatio ");
        consumoKilovatioporHora = teclado.nextDouble();
        valorPlanilla = (costoKilovatioporHora * consumoKilovatioporHora);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad > 65){
            valorPlanilla *= 0.9;
            System.out.println("El descuento se aplica al ser de la tercera edad: ");
        }
        System.out.println("El valor de la planilla es: " + valorPlanilla);
    }

}
