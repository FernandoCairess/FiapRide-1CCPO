package br.com.fiapride.model;

public class Fone {
    public int mudaVolume;
    public int quantidadeDeClique;
    public int volumeAtual;

    public Fone(int mudaVolume, int volumeAtual) {
        this.mudaVolume = mudaVolume;
        this.volumeAtual = volumeAtual;
    }

    public void mudarVolume(int volumeAtual) {
        this.volumeAtual = volumeAtual;
        this.alertaVolume();
    }
    public void clique(int quatidadeDeClique){
        this.quantidadeDeClique = quatidadeDeClique;
        if(quatidadeDeClique>=5){
            System.out.println("Seu volume está no maximo");
        }
        if (quatidadeDeClique<=0) {
            System.out.println("Seu volume ja está zerado");
        }
        volumeAtual= quantidadeDeClique*20;
        alertaVolume();
    }
    public void alertaVolume() {
        if (this.volumeAtual > 75) {
            System.out.println("Cuidado, seu volume pode prejudicar seus tímpanos");
        }

    }
}