package EstruturasNaoLineares;

public class No<T> {
    private T info;
    private No<T> esquerdo;
    private No<T> direito;

    public No (T info) {
        this.info = info;
        this.esquerdo = null;
        this.direito = null;
    }

    public void setInfo (T info) {
        this.info = info;
    }

    public T getInfo () {
        return this.info;
    }

    public void setEsquerdo(No<T> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No<T> getEsquerdo() {
        return esquerdo;
    }

    public void setDireito(No<T> direito) {
        this.direito = direito;
    }

    public No<T> getDireito() {
        return direito;
    }


}
