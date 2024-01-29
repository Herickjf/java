/*
    Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
    Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
    Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/

package Temperatura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a temperature in Celsius (°C): ");
        double temp = input.nextDouble();

        Conversor Temperatura = new Conversor(temp);
        Temperatura.convert();
    }
}
