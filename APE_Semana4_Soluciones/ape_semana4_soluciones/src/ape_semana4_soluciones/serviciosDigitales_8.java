package ape_semana4_soluciones;
import java.util.Scanner;
public class serviciosDigitales_8 {
    public static void main(String[] args) {
        double costoNetflix;
        double costoYoutubePr;
        double costodropBox;
        double costoSpotify;
        double costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo mensual de la plataforma de Netflix: ");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingrese el costo mensual de la plataforma de Youtube Premium: ");
        costoYoutubePr = teclado.nextDouble();
        System.out.println("Ingrese el costo mensual de la plataforma de dropBox: ");
        costodropBox = teclado.nextDouble();
        System.out.println("Ingrese el costo mensual de la plataforma de Spotify: ");
        costoSpotify = teclado.nextDouble();
        costoTotal = (costoNetflix + costoYoutubePr + costodropBox + costoSpotify);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad < 30){
            costoTotal *= 0.19;
            System.out.println("El descuento del 20% se aplica al ser menor de 30 años: ");
        }
        System.out.println("El valor a cancelar de los servicios es de: " + costoTotal );
    }
    
}
