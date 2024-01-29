/*
    Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
    Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
    Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/

package Temperatura;

public class Conversor {
    double temp;

    double CtoK(){
        return temp + 273.15;
    }
    double CtoRe(){
        return temp * 0.8;
    }
    double CtoRa(){
        return temp * 1.8 + 32 + 459.67;
    }
    double CtoF(){
        return temp * 1.8 + 32;
    }

    void convert(){
        System.out.println(temp+ "°C is\n\tIn Kelvin: "+CtoK()+"°K;\n\tIn Réaumur: "+CtoRe()+"°Re;\n\tIn Rankine: "+CtoRa()+"°Ra;\n\tIn Fahrenheit: "+CtoF()+"°F.\n");
    }


    Conversor(double temp){
        this.temp = temp;
    }
}
