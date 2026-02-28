package DuplamenteEncadeada;
import SimplesmenteEncadeada.*;

public class No {
    private Aluno aluno;
    private No proximo;
    private No anterior;

    public No (Aluno alunoVari) {
        this.aluno = alunoVari;
        this.proximo = null;
        this.anterior = null;
    }

    public void setProximo (No proximoVari) {
        this.proximo = proximoVari;
    }

    public No getProximo () {
        return this.proximo;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getAnterior() {
        return anterior;
    }

}
