public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", 1998, true, false);
        Preguica preguica = new Preguica("Sid", 2000, true, false);

        cachorro.mostraAtributos();
        cachorro.emiteSom();

        preguica.mostraAtributos();
        preguica.emiteSom();

        System.out.println("Idade do cachorro: " + cachorro.idade());
        System.out.println("Idade da preguiça: " + preguica.idade());
    }
}