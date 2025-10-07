
public class ProvaQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 8 notas anuais (2 por bimestre):");

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = sc.nextDouble();

        System.out.print("Nota 5: ");
        double nota5 = sc.nextDouble();

        System.out.print("Nota 6: ");
        double nota6 = sc.nextDouble();

        System.out.print("Nota 7: ");
        double nota7 = sc.nextDouble();

        System.out.print("Nota 8: ");
        double nota8 = sc.nextDouble();

        // Calculando médias bimestrais
        double Bimestre1 = (nota1 + nota2) / 2;
        double Bimestre2 = (nota3 + nota4) / 2;
        double Bimestre3 = (nota5 + nota6) / 2;
        double Bimestre4 = (nota7 + nota8) / 2;

        // Calculando médias semestrais
        double mediaSemestre1 = (Bimestre1 + Bimestre2) / 2;
        double mediaSemestre2 = (Bimestre3 + Bimestre4) / 2;

        // Média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibindo resultados
        System.out.println("\nPráticas\n");
        System.out.printf("1o Bimestre: %.1f\n", Bimestre1);
        System.out.printf("2o Bimestre: %.1f\n", Bimestre2);
        System.out.printf("1o Semestre: %.1f\n", mediaSemestre1);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f\n", Bimestre3);
        System.out.printf("4o Bimestre: %.1f\n", Bimestre4);
        System.out.printf("2o Semestre: %.1f\n", mediaSemestre2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        sc.close();
    }
}