 import java.util.Scanner;

public class provaQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.println("---Conversor de Temperatura---");
        System.out.println("Digite a temperatura em Celcius(°C):");
        double celcius = scanner.nextDouble();

        //Conversao para Fahrenteit
        double fahrenteit = (celcius * 9/5) + 32;

        //Conversao para Kelvin
        double Kelvin = celcius + 273.15;

        //Saida de dados
        System.out.printf("Temperatura em celcius: %.1f °C\n",celcius);
        System.out.printf("Temperatura em Fahrenteit: %.31f °F\n", fahrenteit);
        System.out.printf("Temperartura em Kelvin: %.2fK\n" , Kelvin);

        sc.close();

    }
}
