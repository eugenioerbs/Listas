package EstruturasNaoLineares;

public class ArvoreBinaria<T> {
    private No<T> raiz;

    public ArvoreBinaria () {
        this.raiz = null;
    }

    public No<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public String preOrdem () {
        return preOrdem(raiz);
    }

    private String preOrdem (No<T> atual) {
        if (atual ==null) {
            return "<>";
        }
        return "<" + atual.getInfo() + preOrdem(atual.getEsquerdo()) + preOrdem(atual.getDireito()) + ">";
    }

    public No<T> encontrarNo (No<T> no) {
        return encontrarNo(raiz, no);
    }

    private No<T> encontrarNo (No<T> atual, No<T> no) {
        if (atual == null) {
            return null;
        }

        if (atual == no) {
            return atual;
        }
        No<T> encontradoNaEsquerda = encontrarNo(atual.getEsquerdo(), no);

        if (encontradoNaEsquerda != null) {
            return encontradoNaEsquerda;
        } else {
            return encontrarNo(atual.getDireito(), no);
        }
    
        }

}
