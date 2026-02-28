package DuplamenteEncadeada;

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
        return primeiro == null && ultimo == null;
    }

    public void inserir(No novo) {
        if (isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            return;
        } else {
            this.ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            this.ultimo = novo;
        }
    }

    public void remover(int matriculaVari) {

        No atual = this.primeiro;

        if (isEmpty()) {
            return;
        }

        while (atual != null) {
            if (atual.getAluno().getMatricula() == matriculaVari) {

                if (atual == this.primeiro && atual == this.ultimo) { // se caso só exista um nó
                    this.ultimo = null;
                    this.primeiro = null;
                    return;
                } else if (atual == primeiro) {    // caso seja o primeiro
                    this.primeiro = atual.getProximo();
                    atual.getProximo().setAnterior(null);
                    return;
                } else if (atual == ultimo) {   //caso seja o último
                    this.ultimo = atual.getAnterior();
                    atual.getAnterior().setProximo(null);
                    return;
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    return;
                }
            }
            atual = atual.getProximo();
        }
    }

}// classe
