package br.com.fiapride.model;

public class Fone {
    private int mudaVolume;
    private int quantidadeDeClique;
    private int volumeAtual;

    public Fone(int mudaVolume, int volumeAtual) {
        this.setMudaVolume(mudaVolume);
        this.setVolumeAtual(volumeAtual);
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
        if (volumeAtual >100){
            volumeAtual=100;
        }
        alertaVolume();
    }
    public void alertaVolume() {
        if (this.volumeAtual > 75) {
            System.out.println("Cuidado, seu volume pode prejudicar seus tímpanos");
        }
    }

    public int getMudaVolume() {
        return mudaVolume;
    }

    private void setMudaVolume(int mudaVolume) {
        this.mudaVolume = mudaVolume;
    }

    public int getQuantidadeDeClique() {
        return quantidadeDeClique;
    }

    private void setQuantidadeDeClique(int quantidadeDeClique) {
        this.quantidadeDeClique = quantidadeDeClique;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    private void setVolumeAtual(int volumeAtual) {
        if (volumeAtual>100){
            System.out.println("Você Atingiu o volume máximo");
            return;
        }
        if (volumeAtual<0){
            this.volumeAtual=0;
            return;
        }
        this.volumeAtual = volumeAtual;
    }


}
