package br.com.fiapride.main;

import br.com.fiapride.model.Fone;

public class SistemaPrincipalFone {
    public static void main(String[] args) {
        Fone fone1 = new Fone(0,-1);
//        fone1.clique(6);
        Fone fone2= new Fone(1,3);
        fone2.clique(3);
        System.out.println("Seu volume atual é "+ fone1.getVolumeAtual());
        System.out.println("Seu volume atual é "+ fone2.getVolumeAtual());
    }
}
