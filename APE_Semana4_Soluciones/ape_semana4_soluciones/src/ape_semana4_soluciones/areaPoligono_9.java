package ape_semana4_soluciones;
import java.util.Scanner;
public class areaPoligono_9 {
    public static void main(String[] args) {
        double alturaTriangulo, ladoCuadrado, areaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la altura del triangulo: ");
        alturaTriangulo = teclado.nextDouble();
        System.out.println("Ingrese la longitud del ado del cuadrado: ");
        ladoCuadrado = teclado.nextDouble();
        areaTotal = (Math.pow(ladoCuadrado, 2)) + (ladoCuadrado * alturaTriangulo) + ((ladoCuadrado * alturaTriangulo)/2)*3;
        System.out.println("El area del polígono es de: " + areaTotal);
    }
    
}
