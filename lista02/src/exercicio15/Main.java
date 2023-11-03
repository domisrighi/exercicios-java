package exercicio15;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float[] grauFahrenheit = new float[2];
        float[] grauCelsius = new float[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a temperatura em Fahrenheit nº " + (i + 1) + ": ");
            grauFahrenheit[i] = ler.nextFloat();
        }

        for (int i = 0; i < 2; i++) {
        	grauCelsius[i] = (grauFahrenheit[i] - 32) * 5 / 9;
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Temperatura em Celsius nº " + (i + 1) + ": " + grauCelsius[i] + " °C");
        }

        ler.close();
    }
}