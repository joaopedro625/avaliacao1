import java.util.Scanner;

public class Avaliacao {

    public static void main(String[] args) {
        // Objeto Scanner para receber a entrada do usuário8

        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as 8 notas individualmente
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;

        // Solicita as 8 notas do aluno
        System.out.println("Por favor, insira as 8 notas anuais do aluno:");

        System.out.print("Digite a nota do 1º bimestre (prática): ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2º bimestre (prática): ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3º bimestre (prática): ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4º bimestre (prática): ");
        nota4 = scanner.nextDouble();

        System.out.print("Digite a nota do 5º bimestre (teórica): ");
        nota5 = scanner.nextDouble();

        System.out.print("Digite a nota do 6º bimestre (teórica): ");
        nota6 = scanner.nextDouble();

        System.out.print("Digite a nota do 7º bimestre (projeto): ");
        nota7 = scanner.nextDouble();

        System.out.print("Digite a nota do 8º bimestre (projeto): ");
        nota8 = scanner.nextDouble();

        // --- Cálculos ---

        // Médias bimestrais
        double media1Bimestre = nota1; // Assumindo uma nota por bimestre para simplificar
        double media2Bimestre = nota2;
        double media3Bimestre = nota3;
        double media4Bimestre = nota4;

        // Médias semestrais
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;
        double media2Semestre = (media3Bimestre + media4Bimestre) / 2;

        // Média final
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Fecha o objeto Scanner
        scanner.close();

        // --- Apresentação dos resultados ---

        System.out.println("\n-------------------------------------");
        System.out.println("Resultados do Aluno");
        System.out.println("-------------------------------------");

        System.out.printf("Práticas 1º Bimestre: %.1f\n", media1Bimestre);
        System.out.printf("Práticas 2º Bimestre: %.1f\n", media2Bimestre);
        System.out.printf("Práticas 1º Semestre: %.1f\n", media1Semestre);
        System.out.println("-------------------------------------");

        System.out.printf("Teórica 3º Bimestre: %.1f\n", media3Bimestre);
        System.out.printf("Teórica 4º Bimestre: %.1f\n", media4Bimestre);
        System.out.printf("Teórica 2º Semestre: %.1f\n", media2Semestre);
        System.out.println("-------------------------------------");

        System.out.printf("Média Final: %.1f\n", mediaFinal);
        System.out.println("-------------------------------------");
    }
}