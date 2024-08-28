import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Parte 1: Receber números pelo console
//        System.out.print("Digite um número: ");
//        double a = sc.nextDouble();
//        System.out.print("Digite outro número: ");
//        double b = sc.nextDouble();
//        double c = a + b;
//
//        System.out.println("O número digitado foi " + c);

//        Receber uma string pelo teclado (Nessa abordagem não é possível receber valores com espaço. Ex: Ermeson Sampaio)
//        String nome = sc.next();
//        System.out.println("O valor digitado foi " + nome);

//        Tamanho do vetor
//        System.out.print("Digite o tamanho do vetor: ");
//        int n = sc.nextInt();
//
//        int[] idades = new int[n];

//        Cadastrar pessoas
//        int n = sc.nextInt();
//        String []nomes = new String[n]; // Nome sem espaço
//        double []estaturas = new double[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
//            nomes[i] = sc.next();
//            System.out.printf("Digite a estatura de pessoa %s: ", nomes[i]);
//            estaturas[i] = sc.nextDouble();
//        }
//
//        double soma = 0;
//        double menorAltura = estaturas[0];
//        double maiorAltura = 0;
//        String pessoaMaiorAltura = "";
//
//        for (int i = 0; i < n; i++) {
//            soma += estaturas[i];
//
//            if (estaturas[i] < menorAltura) {
//                menorAltura = estaturas[i];
//            }
//
//            if (estaturas[i] > maiorAltura) {
//                maiorAltura = estaturas[i];
//                pessoaMaiorAltura = nomes[i];
//            }
//        }
//
//        System.out.println("A média das alturas é: " + soma / n);
//        System.out.println("A menor altura é: " + menorAltura);
//        System.out.println("A pessoa com maior altura é: " + pessoaMaiorAltura);

        int n = sc.nextInt();

        String[] nomes = new String[i];
        String[] tipos = new String[i];
        int[] integrantes = new int[i];
        double[] lucros = new int[i];
        int[] shows = new int[i];

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
            tipos[i] = sc.next();
            integrantes[i] = sc.nextInt();
            lucros[i] = sc.nextDouble();
            shows[i] = sc.nextInt();
        }

    }
}