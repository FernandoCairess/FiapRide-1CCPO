package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private String cpf; // Novo Atributo
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf); // Novo Atributo
        this.setSaldo(0.0);
    }

    // Método para PEGAR o saldo (Leitura)
    public double getSaldo() {
        return this.saldo; // Apenas devolve o valor, não altera nada.
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // Faça o mesmo para o nome (sem regras complexas por enquanto)
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    // Faça o mesmo para o cpf (sem regras complexas por enquanto)
    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarSaldo(double valor) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return; // Interrompe a execução do método
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }
}