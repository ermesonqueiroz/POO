import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Imovel[] imoveis = new Imovel[10];

        for (int i = 0; i < imoveis.length; i++) {
            int tipo = sc.nextInt();
            String proprietario = sc.next();
            double tamanho = sc.nextDouble();
            boolean ehNobre = sc.nextBoolean();
            int anoConstrucao = sc.nextInt();
            double valorCompra = sc.nextDouble();

            imoveis[i] = new Imovel(tipo, proprietario, tamanho, ehNobre, anoConstrucao, valorCompra);
        }

        for (Imovel imovel : imoveis) {
            System.out.println("tipo: " + imovel.tipo);
            System.out.println("proprietario: " + imovel.proprietario);
            System.out.println("tamanho: " + imovel.tamanho);
            System.out.println("ehNobre: " + imovel.ehNobre);
            System.out.println("anoConstrucao: " + imovel.anoConstrucao);
            System.out.println("valorCompra: " + imovel.valorCompra);
        }

        for (Imovel imovel : imoveis) {
            if (imovel.idade() > 10) {
                System.out.println(imovel.proprietario);
            }
        }

        double somaTamanho = 0;

        for (Imovel imovel : imoveis) {
            somaTamanho += imovel.tamanho;
        }

        System.out.println("A média é: " + somaTamanho / imoveis.length);
    }
}