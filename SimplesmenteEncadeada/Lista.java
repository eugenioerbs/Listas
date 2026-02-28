package SimplesmenteEncadeada;

public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getUltimo() {
        return ultimo;
    }

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoFinal(No noVari) {
        if (isEmpty() == true) {
            primeiro = noVari;
            ultimo = noVari;
        } else {
            this.ultimo.setProximo(noVari);
            this.ultimo = noVari;
        }
    }

    public void inserirNaFrente(No noVari) {
        if (isEmpty() == true) {
            primeiro = noVari;
            ultimo = noVari;
        } else {
            noVari.setProximo(this.primeiro);
            this.primeiro = noVari;
        }
    }

    public void removerNo(int matriculaVari) {
        No noPercorrendo = this.primeiro;

        if (isEmpty()) {
            return;
        }

        if (noPercorrendo == this.primeiro && this.primeiro.getAluno().getMatricula() == matriculaVari) { // se caso o
                                                                                                          // primeiro já
                                                                                                          // for o nó
                                                                                                          // desejado
            if (this.primeiro == ultimo) { // e caso só tiver um nó na lista
                this.primeiro = null;
                ultimo = null;
            }

            this.primeiro = primeiro.getProximo();
            return;
        }

        while (noPercorrendo.getProximo() != null) {
            if (noPercorrendo.getProximo().getAluno().getMatricula() == matriculaVari) {
                if (noPercorrendo.getProximo() == ultimo) { // se caso for o último
                    ultimo = noPercorrendo;
                    ultimo.setProximo(null);
                    return;
                } else { // se caso não for nem primeiro nem ultimo
                    noPercorrendo.setProximo(noPercorrendo.getProximo().getProximo());
                    return;
                }
            } else {
                noPercorrendo = noPercorrendo.getProximo();
            }
        }
    }

    public String pesquisarAluno (int matriculaVari) {
        No atual = this.primeiro;

        if (isEmpty()) {
            return "Lista vazia";
        }

        while (atual != null) {
            if (atual.getAluno().getMatricula() == matriculaVari) {
                return atual.getAluno().getNome() + " encontrado";
            } else {
                atual = atual.getProximo();
            }
        }
        return "Aluno não encontrado";
    }

    public String exibir () {
        StringBuilder sb = new StringBuilder();
        No atual = this.primeiro;

        if (isEmpty()) {
            return "Lista vazia";
        }

        while (atual != null) {
            sb.append(atual.getAluno().getNome()).append(" ").append(atual.getAluno().getMatricula()).append("\n");
            atual = atual.getProximo();
        }
        return sb.toString();
    }

}// classe