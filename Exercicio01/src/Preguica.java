public class Preguica extends Animal {
    private boolean escala;

    public Preguica(String nome, int ano, boolean ehDomestico, boolean escala) {
        super(nome, ano, ehDomestico);
        this.escala = escala;
    }

    public void emiteSom() {
        System.out.println("zzzzzzzzz");
    }

    public void mostraAtributos() {
        System.out.println("Atributos da preguiça");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Domestico: " + this.getEhDomestico());
        System.out.println("Escala: " + this.escala);
    }
}
