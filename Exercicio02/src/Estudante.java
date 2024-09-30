public class Estudante {
    public String matricula;
    public int anoMatricula;
    public String curso;

    public Estudante(String matricula, int anoMatricula, String curso) {
        this.matricula = matricula;
        this.anoMatricula = anoMatricula;
        this.curso = curso;
    }

    public double copia(int folhas) {
        return folhas * 0.1;
    }
}
