import java.util.Calendar;

public class Imovel {
    public int tipo;
    public String proprietario;
    public double tamanho;
    public Boolean ehNobre;
    public int anoConstrucao;
    public double valorCompra;

    public Imovel(int tipo, String proprietario, double tamanho, Boolean ehNobre, int anoConstrucao, double valorCompra) {
        this.tipo = tipo;
        this.proprietario = proprietario;
        this.tamanho = tamanho;
        this.ehNobre = ehNobre;
        this.anoConstrucao = anoConstrucao;
        this.valorCompra = valorCompra;
    }

    public void mostrarInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Proprietário: " + this.proprietario);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("É nobre: " + this.ehNobre);
        System.out.println("Ano de construção: " + this.anoConstrucao);
        System.out.println("Valor de compra: " + this.valorCompra);
    }

    public double IPTU() {
        if (tipo == 1) {
            return tamanho > 100 ? 0.03 * valorCompra : 0.01 * valorCompra;
        } else if (tipo == 2) {
            return tamanho > 100 ? 0.05 * valorCompra : 0.02 * valorCompra;
        }

        return 0;
    }

    public double possivelPrecoVenda() {
        if (ehNobre) {
            return tamanho > 100 ? 1.8 * valorCompra : 1.1 * valorCompra;
        } else if (tipo == 2) {
            return tamanho > 100 ? 1.2 * valorCompra : 1.05 * valorCompra;
        }

        return 0;
    }

    public int idade() {
        return Calendar.YEAR;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getEhNobre() {
        return ehNobre;
    }

    public void setEhNobre(Boolean ehNobre) {
        this.ehNobre = ehNobre;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
