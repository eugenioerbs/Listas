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

}
