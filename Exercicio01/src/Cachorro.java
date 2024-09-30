public class Cachorro extends Animal {
    private boolean corre;

    public Cachorro(String nome, int ano, boolean ehDomestico, boolean corre) {
        super(nome, ano, ehDomestico);
        this.corre = corre;
    }

    public void emiteSom() {
        System.out.println("Au Au");
    }

    public void mostraAtributos() {
        System.out.println("Atributos do cachorro");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Domestico: " + this.getEhDomestico());
        System.out.println("Corre: " + this.corre);
    }
}
