import java.util.Date;

public class Animal {
    private String nome;
    private int ano;
    private boolean ehDomestico;

    public Animal(String nome, int ano, boolean ehDomestico) {
        this.nome = nome;
        this.ano = ano;
        this.ehDomestico = ehDomestico;
    }

    public int idade() {
        return (new Date()).getYear() - this.ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getEhDomestico() {
        return ehDomestico;
    }

    public void setEhDomestico(boolean ehDomestico) {
        this.ehDomestico = ehDomestico;
    }
}
