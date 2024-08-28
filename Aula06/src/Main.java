public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Ermeson", "Sampaio", 100_000);
        Empregado e2 = new Empregado("João", "Miguel", 50_000);

        System.out.printf("O salário anual do %s %s é R$ %.2f\n", e1.getNome(), e1.getSobrenome(), e1.getSalarioMensal() * 12);
        System.out.printf("O salário anual do %s %s é R$ %.2f\n", e2.getNome(), e2.getSobrenome(), e2.getSalarioMensal() * 12);

        e1.forneceAumento();
        System.out.println("Após um aumento de 10% o salário mensal do " + e1.getNome() + " " + e1.getSobrenome() + " é R$ " + e1.getSalarioMensal());

        e2.forneceAumento();
        System.out.println("Após um aumento de 10% o salário mensal do " + e2.getNome() + " " + e2.getSobrenome() + " é R$ " + e2.getSalarioMensal());
    }
}