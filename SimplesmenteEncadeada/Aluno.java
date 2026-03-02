package SimplesmenteEncadeada;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nomeVari, int matriculaVari) {
        this.nome = nomeVari;
        this.matricula = matriculaVari;
    }

    public void setNome(String nomeVari) {
        this.nome = nomeVari;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override     // para nos casos onde eu trabalhar com uma classe genérica
    public String toString() {
        return this.getNome();
    }

}
