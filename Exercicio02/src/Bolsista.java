public class Bolsista extends Estudante {
    private double bolsa;

    public Bolsista(String matricula, int anoMatricula, String curso, double bolsa) {
        super(matricula, anoMatricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public double copia(int folhas) {
        return folhas * 0.07;
    }

    public double copiasComBolsa() {
        return this.bolsa / 0.07;
    }
}
