public class Main {
    public static void main(String[] args) {
        Bolsista bolsista = new Bolsista("123213", 2022, "ADS", 21313.32);
        Estudante estudante = new Estudante("1231232133213", 2024, "ADS");

        System.out.println("Preço de 10 cópias: " + estudante.copia(10));
        System.out.println("Preço de 10 cópias bolsista: " + bolsista.copia(10));
        System.out.println("Quantidade de cópias com a bolsa: " + bolsista.copiasComBolsa());
    }
}
