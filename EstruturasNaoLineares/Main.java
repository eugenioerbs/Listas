package EstruturasNaoLineares;

import SimplesmenteEncadeada.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno eugenio = new Aluno("Eugenio", 20);
        No<Aluno> e = new No<Aluno>(eugenio);

        Aluno angela = new Aluno("Angela", 40);
        No<Aluno> a = new No<Aluno>(angela);

        Aluno luiza = new Aluno("Luiza", 17);
        No<Aluno> l = new No<Aluno>(luiza);

        e.setEsquerdo(l);
        e.setDireito(a);


        ArvoreBinaria<Aluno> ar = new ArvoreBinaria<>();
        ar.setRaiz(e);

        System.out.println(ar.preOrdem());
    }
}
