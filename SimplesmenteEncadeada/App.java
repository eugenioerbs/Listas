package SimplesmenteEncadeada;

public class App {
    public static void main(String[] args) {
        Aluno eugenio = new Aluno("Eugênio", 2005);
        No a = new No(eugenio);

        Aluno lucia = new Aluno("Lucia", 1900);
        No b = new No(lucia);

        Lista lista = new Lista();
        lista.inserirNoFinal(a);
        lista.inserirNoFinal(b);

        System.out.println(lista.exibir());

    } //psvm
}//classe
